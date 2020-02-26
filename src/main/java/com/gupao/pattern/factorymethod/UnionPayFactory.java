package com.gupao.pattern.factorymethod;

import com.gupao.pattern.Payment;
import com.gupao.pattern.UnionPay;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/2/26 16:05
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class UnionPayFactory implements PaymentFactory {
    @Override
    public Payment create() {
        return new UnionPay();
    }
}
