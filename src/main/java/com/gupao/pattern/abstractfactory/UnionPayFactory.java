package com.gupao.pattern.abstractfactory;

import com.gupao.pattern.Payment;
import com.gupao.pattern.UnionPay;
import com.gupao.pattern.factorymethod.PaymentFactory;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/2/26 16:05
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class UnionPayFactory extends AbstractPaymentFactory {

    @Override
    DomesticPayment createDomesticPay() {
        return new UnionPayDomesticPay();
    }

    @Override
    OffshorePayment createOffshorePay() {
        return new UnionPayOffshorePay();
    }
}
