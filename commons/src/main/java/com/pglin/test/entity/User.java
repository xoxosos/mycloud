package com.pglin.test.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
   int uid;
   String name;
   String sex;
}
