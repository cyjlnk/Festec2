package com.diabin.festec;

import android.app.Application;

import com.diabin.latte.app.latte;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * Created by Administrator on 2018/4/23 0023.
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withApiHost("http://127.0.0.1/")
                .configure();
    }
}