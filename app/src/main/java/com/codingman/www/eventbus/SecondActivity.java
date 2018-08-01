package com.codingman.www.eventbus;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

/**
 * ================================================
 * 版    本：
 * 创建日期：
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class SecondActivity extends Activity {

    private TextView mTvSecond;
    private Button mBtnSecond;
    private Button mBtnStickEvent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        mBtnSecond = (Button) findViewById(R.id.id_btn_second);
        mTvSecond = (TextView) findViewById(R.id.id_tv_second);
        mBtnStickEvent = (Button)findViewById(R.id.id_btn_EmitStickEvent);

        mBtnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new MessageEvent("我是EventBus3.0 的测试发送信息"));
                finish();
            }
        });


        mBtnStickEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().postSticky(new MessageEvent("我是EventBus3.0 发送的粘性事件"));
                finish();

            }
        });


    }
}
