package com.gupao.pattern;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/2/26 15:31
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class Alipay implements Payment {
    @Override
    public void pay() {
        System.out.println("阿里支付，不止于支付");
    }
}
