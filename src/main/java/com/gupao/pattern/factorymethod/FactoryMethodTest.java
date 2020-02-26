package com.gupao.pattern.factorymethod;

import com.gupao.pattern.Payment;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/2/26 16:06
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class FactoryMethodTest {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new WXPayFactory();
        Payment payment = paymentFactory.create();
        payment.pay();
    }
}
