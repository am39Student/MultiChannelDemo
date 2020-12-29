package com.example.commonsdk;

/**
 * Created by LiuYu on 2020/12/29 9:43 PM
 */
public class CommonConfigManager {

    public enum Product {
        Demo1, Demo2
    }

    public static AbstractCommonConfig commonConfig;

    static {
        try {
            commonConfig = (AbstractCommonConfig) Class.forName("com.example.demoui.DemoCommonConfig").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
