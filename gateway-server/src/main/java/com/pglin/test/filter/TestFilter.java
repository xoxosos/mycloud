package com.pglin.test.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @author LinRenJie
 */
@Component
public class TestFilter implements GlobalFilter, Ordered { //ordered设置过滤器优先
    @Override
    public int getOrder() {
        //值越小越优先 默认1 order一样全局优先执行
        return 0;
    }

    /**
     * 全局过滤器 所有请求都会拦截
     *
     * @param exchange 交换
     * @param chain    链
     * @return {@link Mono}<{@link Void}>
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        MultiValueMap<String, String> queryParams = exchange.getRequest().getQueryParams();
        System.out.println(queryParams);
        System.out.println(exchange.getRequest().getHeaders().get("Test"));
        List<String> strings = queryParams.get("test");
        if (!strings.isEmpty()&&strings.contains("1")){
            //放行
            return chain.filter(exchange);
        }else {
            //拦截
            return exchange.getResponse().setComplete();
        }

    }
}
