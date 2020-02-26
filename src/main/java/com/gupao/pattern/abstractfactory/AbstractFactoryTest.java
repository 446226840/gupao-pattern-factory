package com.gupao.pattern.abstractfactory;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/2/26 17:32
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractPaymentFactory paymentFactory = new AliPayFactory() ;
        paymentFactory.createDomesticPay().domesticPay();
        paymentFactory.createOffshorePay().offshorePay();
    }
}
