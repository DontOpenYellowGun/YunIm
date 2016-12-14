package com.sven.yunim.utils;

import android.widget.Toast;

import com.netease.nimlib.sdk.NIMClient;
import com.netease.nimlib.sdk.RequestCallback;
import com.netease.nimlib.sdk.auth.AuthService;
import com.netease.nimlib.sdk.auth.LoginInfo;
import com.sven.yunim.App;
import com.sven.yunim.callback.ImRequestCallback;

import rx.Observable;
import rx.functions.Action1;

/**
 * Created by Sven on 2016/12/9.
 */

public class AccountUtil {

    public static void LoginIn(final String account, final String token, final ImRequestCallback callback) {

        Observable.just(NetUtil.checkNet(App.get().getApplicationContext()))
                .subscribe(new Action1<Boolean>() {
                    @Override
                    public void call(Boolean aBoolean) {
                        if (aBoolean) {
                            LoginInfo info = new LoginInfo(account, token);
                            NIMClient.getService(AuthService.class)
                                    .login(info)
                                    .setCallback(callback);
                        } else {
                            Toast.makeText(App.get().getApplicationContext(), "网络无法连接~", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    public static void LoginIn(final String account, final String token, final String appKey, final RequestCallback<LoginInfo> callback) {

        Observable.just(NetUtil.checkNet(App.get().getApplicationContext()))
                .subscribe(new Action1<Boolean>() {
                    @Override
                    public void call(Boolean aBoolean) {
                        if (aBoolean) {
                            LoginInfo info = new LoginInfo(account, token, appKey);
                            NIMClient.getService(AuthService.class)
                                    .login(info)
                                    .setCallback(callback);
                        } else {
                            Toast.makeText(App.get().getApplicationContext(), "网络无法连接~", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }


}
