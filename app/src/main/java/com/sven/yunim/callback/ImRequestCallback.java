package com.sven.yunim.callback;

import com.netease.nimlib.sdk.RequestCallback;

/**
 * Created by Sven on 2016/12/14.
 */

public class ImRequestCallback implements RequestCallback {

    @Override
    public void onSuccess(Object param) {

    }

    @Override
    public void onFailed(int code) {
        switch (code) {
            case 0:

                break;
        }
    }

    @Override
    public void onException(Throwable exception) {

    }
}
