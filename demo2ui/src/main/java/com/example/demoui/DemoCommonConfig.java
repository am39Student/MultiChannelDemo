package com.example.demoui;

import com.example.commonsdk.AbstractCommonConfig;

/**
 * Created by LiuYu on 2020/12/29 9:38 PM
 */
public class DemoCommonConfig extends AbstractCommonConfig {

    @Override
    public boolean isShowMessage2() {
        return true;
    }

    @Override
    public String getDemoName() {
        return "My is Demo2";
    }

}
