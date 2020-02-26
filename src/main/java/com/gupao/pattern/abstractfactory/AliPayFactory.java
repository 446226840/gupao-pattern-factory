package com.gupao.pattern.abstractfactory;

import com.gupao.pattern.Alipay;
import com.gupao.pattern.Payment;
import com.gupao.pattern.factorymethod.PaymentFactory;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/2/26 15:51
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class AliPayFactory extends AbstractPaymentFactory {

    @Override
    DomesticPayment createDomesticPay() {
        return new AliPayDomesticPay();
    }

    @Override
    OffshorePayment createOffshorePay() {
        return new AliPayOffshorePay();
    }
}
