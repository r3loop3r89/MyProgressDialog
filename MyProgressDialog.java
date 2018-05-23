package com.raintreecomputing.cbflivesalesv3.Shrawan;

import android.app.ProgressDialog;
import android.content.Context;


/**
 * Created by Shra1 on 21-01-2017.
 */

public class MyProgressDialog
{
    static ProgressDialog progressDialog, hProgressDialog;

    public static final void dismissMyProgressdialog() {
        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    public static final void showMyProgressDialog(Context mCtx, String mMessage, Boolean cancleable) {
        progressDialog = new ProgressDialog(mCtx);
        progressDialog.setMessage(mMessage);
        progressDialog.setCancelable(cancleable);
        progressDialog.show();
    }


    public static final void dismissMyHorizontalProgressdialog() {
        if (hProgressDialog.isShowing()) {
            hProgressDialog.dismiss();
        }
    }

    public static final void showMyHorizontalProgressDialog(Context mCtx, String mMessage, Boolean cancleable) {
        hProgressDialog = new ProgressDialog(mCtx);
        hProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        hProgressDialog.setMessage(mMessage);
        hProgressDialog.setCancelable(cancleable);
        hProgressDialog.show();
    }

    public static final void setMyHPDialogProgess(int progress){
        hProgressDialog.setProgress(progress);
    }



}
