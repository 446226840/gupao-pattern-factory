package com.gupao.pattern.simplefactory;

import com.gupao.pattern.Alipay;
import com.gupao.pattern.Payment;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/2/26 15:45
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment payment = paymentFactory.creatPay(Alipay.class);
        payment.pay();
    }
}
