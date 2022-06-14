package com.pglin.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
/**
 * @author LinRenJie
 */
@Data
@AllArgsConstructor
public class BorrowDetail {
    User user;
    List<Book> booklist;
}
