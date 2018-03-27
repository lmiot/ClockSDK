package com.loonggg.lib.alarmmanager.clock;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SimpleDialog extends Dialog {
    protected static int default_width = WindowManager.LayoutParams.WRAP_CONTENT; // 默认宽度
    protected static int default_height = WindowManager.LayoutParams.WRAP_CONTENT;// 默认高度
    public static int TYPE_TWO_BT = 2;
    public static int TYPE_NO_BT = 0;
    public TextView dialog_timer;
    public TextView dialog_detail;
    public Button dialog_sure;
    protected Context mContext;
    private View.OnClickListener listener;
    private View customView;


    public SimpleDialog(Context context, int style) {
        super(context, R.style.FullScreenDialog);
        mContext = context;
        customView = LayoutInflater.from(context).inflate(R.layout.dialog_simple, null);

        dialog_timer = (TextView) customView.findViewById(R.id.id_timer);
        dialog_detail = (TextView) customView.findViewById(R.id.id_detial);
        dialog_sure = (Button) customView.findViewById(R.id.id_sure);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(customView);
        //ButterKnife  view绑定
        //ButterKnife.bind(this,customView);
    }

    public SimpleDialog setClickListener(View.OnClickListener listener) {
        this.listener = listener;
        dialog_sure.setOnClickListener(listener);
        return this;
    }

    public SimpleDialog setMessage(String message) {
        dialog_detail.setText(message);
        return this;
    }

    public SimpleDialog setTimer(String timer) {
        dialog_timer.setText(timer);
        return this;
    }


}
