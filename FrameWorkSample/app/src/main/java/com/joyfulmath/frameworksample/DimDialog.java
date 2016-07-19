package com.joyfulmath.frameworksample;

import android.app.Dialog;
import android.content.Context;
import android.view.WindowManager;

/**
 * Created by @joyfulmath.lu on 2016-07-19.
 */
public class DimDialog extends Dialog {
    private static final float DIMDIALOG_TRANTANT = 0.3f;
    private static final float DIMDIALOG_BG_TRANTANT = 0.8f;
    public DimDialog(Context context) {
        super(context);
        setAttributes();
    }

    private void setAttributes() {
        WindowManager.LayoutParams lp=getWindow().getAttributes();
        lp.alpha=DIMDIALOG_TRANTANT;
        lp.dimAmount = DIMDIALOG_BG_TRANTANT;
        getWindow().setAttributes(lp);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
    }

    public DimDialog(Context context, int themeResId) {
        super(context, themeResId);
        setAttributes();
    }

    protected DimDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
        setAttributes();
    }
}
