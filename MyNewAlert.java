package com.raintreecomputing.cbflivesalesv3.Shrawan;

import android.content.Context;
import android.view.View;

import com.raintreecomputing.cbflivesalesv3.R;
import com.yarolegovich.lovelydialog.LovelyCustomDialog;
import com.yarolegovich.lovelydialog.LovelyStandardDialog;


/**
 * Created by Shra1 on 15-07-2017.
 */

public class MyNewAlert {

    static LovelyStandardDialog lovelyStandardDialog;

    public static void showMyNewAlert(Context mCtx, String title, String msg) {
        lovelyStandardDialog = getMyLovelyDialog(mCtx);
        lovelyStandardDialog.setTitle(title);
        lovelyStandardDialog.setMessage(msg);
        lovelyStandardDialog.show();
    }

    public static LovelyStandardDialog getMyLovelyDialog(Context mCtx) {
        return new LovelyStandardDialog(mCtx)
                .setTopColor(mCtx.getResources().getColor(R.color.colorAccent));
    }

    public static LovelyCustomDialog getMyLovelyCustomDialog(Context mCtx) {
        return new LovelyCustomDialog(mCtx)
                .setTopColor(mCtx.getResources().getColor(R.color.colorAccent));
    }

    public static void showMyNewAlert(Context mCtx, String title, String msg, boolean cancleable) {
        lovelyStandardDialog = getMyLovelyDialog(mCtx);
        lovelyStandardDialog.setTitle(title);
        lovelyStandardDialog.setMessage(msg);
        lovelyStandardDialog.setCancelable(cancleable);
        lovelyStandardDialog.show();
    }

    public static void showMyNewAlert(Context mCtx, String title, String msg, String button1Text, View.OnClickListener button1ClickListener) {
        lovelyStandardDialog = getMyLovelyDialog(mCtx);
        lovelyStandardDialog.setTitle(title);
        lovelyStandardDialog.setMessage(msg);
        lovelyStandardDialog.setCancelable(false);
        lovelyStandardDialog.setPositiveButton(button1Text, button1ClickListener);
        lovelyStandardDialog.show();
    }

    public static void showMyNewAlert(Context mCtx, String title, String msg, String button1Text, View.OnClickListener button1ClickListener, String button2Text, View.OnClickListener button2ClickListener) {
        lovelyStandardDialog = getMyLovelyDialog(mCtx);
        lovelyStandardDialog.setTitle(title);
        lovelyStandardDialog.setMessage(msg);
        lovelyStandardDialog.setCancelable(false);
        lovelyStandardDialog.setPositiveButton(button1Text, button1ClickListener);
        lovelyStandardDialog.setNegativeButton(button2Text, button2ClickListener);
        lovelyStandardDialog.show();
    }


    public static void dismissMyNewAlert() {
        lovelyStandardDialog.dismiss();
    }

}
