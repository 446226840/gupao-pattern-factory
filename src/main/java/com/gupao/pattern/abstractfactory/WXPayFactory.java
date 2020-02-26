package com.gupao.pattern.abstractfactory;


/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/2/26 15:56
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class WXPayFactory extends AbstractPaymentFactory {

    @Override
    DomesticPayment createDomesticPay() {
        return new WXPayDomesticPay();
    }

    @Override
    OffshorePayment createOffshorePay() {
        return new WXPayOffshorePay();
    }
}
