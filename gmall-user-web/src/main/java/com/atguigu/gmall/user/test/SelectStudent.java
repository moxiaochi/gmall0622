package com.atguigu.gmall.user.test;

import java.util.Random;

public class SelectStudent {

    public static void main(String[] args) {
        Random row = new Random();// 行号
        Random col = new Random();// 列号

        int rowNo = row.nextInt(7)+2;

        System.out.println("行号："+rowNo);

        int colNo = col.nextInt(9)+1;

        System.out.println("列号："+colNo);
    }
}
