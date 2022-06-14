package com.pglin.test.mapper;

import com.pglin.test.entity.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author LinRenJie
 */
@Mapper
public interface BorrowMapper {
    /**
     * 通过uid
     * @param uid uid
     * @return {@link List}<{@link Borrow}>
     */
    @Select("select * from db_borrow where uid = #{uid}")
    List<Borrow> getBorrowsByUid(int uid);

    /**
     * 通过Bid
     * @param bid 报价
     * @return {@link List}<{@link Borrow}>
     */
    @Select("select * from db_borrow where bid = #{bid}")
    List<Borrow> getBorrowsByBid(int bid);

    /**
     * 通过uid和bid
     * @param uid uid
     * @param bid 报价
     * @return {@link Borrow}
     */
    @Select("select * from db_borrow where uid = #{uid} and bid = #{bid}")
    Borrow getBorrowsByUidandBid(int uid,int bid);
}
