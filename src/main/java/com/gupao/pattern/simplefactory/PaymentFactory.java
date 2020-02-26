package com.gupao.pattern.simplefactory;

import com.gupao.pattern.Payment;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/2/26 15:31
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class PaymentFactory {
    Payment creatPay(Class<? extends Payment> clazz) {
        Payment payment = null;
        try {
            payment = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return payment;
    }
}
