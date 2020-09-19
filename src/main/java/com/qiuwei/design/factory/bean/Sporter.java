package com.qiuwei.design.factory.bean;

/**
 * 运动员
 * @Author: qiuweib@yonyou.com
 * @Date: 2020-09-18.
 */
public class Sporter  implements Person{


    @Override
    public void name() {

        System.out.println("我是运动员");

    }

    @Override
    public void run() {

        System.out.println("我在打篮球");

    }
}
