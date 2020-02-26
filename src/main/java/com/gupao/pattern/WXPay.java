package com.gupao.pattern;

/**
 * 描述：
 *
 * @auther yangke
 * @date 2020/2/26 15:32
 * @email yangke@tydic.com
 * @copyright 2020 www.tydic.com Inc. All rights reserved.
 **/
public class WXPay implements Payment{
    @Override
    public void pay() {
        System.out.println("微信支付，亿万用户的选择，更快更安全");
    }
}
