package com.liuyu;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;

import liuyu.com.latte_core.app.Latte;
import liuyu.com.latte_ec.icon.FontEcModule;

/**
 * 创建日期：2018/4/12
 * 描述:
 * 作者:LiuYu
 */
public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http://127.0.0.1")
                .configure();

    }

}
