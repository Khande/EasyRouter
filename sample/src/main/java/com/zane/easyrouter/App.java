package com.zane.easyrouter;

import android.app.Application;

import com.zane.router.EasyRouter;


/**
 * Created by Zane on 2016/12/25.
 * Email: zanebot96@gmail.com
 * Blog: zane96.github.io
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        EasyRouter.init(this);
    }
}
