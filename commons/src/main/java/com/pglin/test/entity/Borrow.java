package com.pglin.test.entity;

import lombok.Data;
import java.io.Serializable;

/**
 *
 * @author LinRenJie
 * @date 2022-06-13
 */
@Data
public class Borrow implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer uid;

    private Integer bid;


}
