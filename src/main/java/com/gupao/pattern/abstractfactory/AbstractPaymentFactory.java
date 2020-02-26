package com.gupao.pattern.abstractfactory;

import com.gupao.pattern.Alipay;
import com.gupao.pattern.UnionPay;
import com.gupao.pattern.WXPay;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/2/26 16:14
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public abstract class AbstractPaymentFactory {
    public void init(){
        System.out.println("初始化数据");
    }

    abstract DomesticPayment createDomesticPay();

    abstract OffshorePayment createOffshorePay();


}
