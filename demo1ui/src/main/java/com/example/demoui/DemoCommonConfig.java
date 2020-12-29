package com.example.demoui;

import com.example.commonsdk.AbstractCommonConfig;
import com.example.commonsdk.CommonConfigManager;

/**
 * Created by LiuYu on 2020/12/29 9:18 PM
 */
public class DemoCommonConfig extends AbstractCommonConfig {

    @Override
    public boolean isShowMessage1() {
        return true;
    }

    @Override
    public CommonConfigManager.Product getProductType() {
        return CommonConfigManager.Product.Demo1;
    }

}
