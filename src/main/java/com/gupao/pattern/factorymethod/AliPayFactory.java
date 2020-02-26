package com.gupao.pattern.factorymethod;

import com.gupao.pattern.Alipay;
import com.gupao.pattern.Payment;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/2/26 15:51
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class AliPayFactory implements PaymentFactory {
    @Override
    public Payment create() {
        return new Alipay();
    }
}
