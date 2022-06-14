package com.pglin.test.service;

import com.pglin.test.entity.Borrow;
import com.pglin.test.entity.BorrowDetail;

import java.util.List;

/**
 * @author LinRenJie
 */
public interface BorrowService {
   /**
    * 获取详情
    *
    * @param uid uid
    * @return {@link BorrowDetail}
    */
   BorrowDetail getUserBorrowDetailByUid(int uid);

}
