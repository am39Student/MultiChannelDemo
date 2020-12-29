package com.example.commonsdk;

/**
 * Created by LiuYu on 2020/12/29 9:02 PM
 */
public class AbstractCommonConfig {

    public boolean isShowMessage1() {
        return false;
    }

    public boolean isShowMessage2() {
        return false;
    }

    public String getDemoName() {
        return "My is Demo1";
    }

    public CommonConfigManager.Product getProductType() {
        return CommonConfigManager.Product.Demo2;
    }

}
