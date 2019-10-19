package com.aserbao.aserbaosandroid.aaSource.android.os.handler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.aserbao.aserbaosandroid.R;
import com.aserbao.aserbaosandroid.comon.base.BaseRecyclerViewActivity;
import com.aserbao.aserbaosandroid.comon.base.beans.BaseRecyclerBean;
import com.aserbao.aserbaosandroid.comon.base.extend.BaseAboutProgressActivity;

public class HandlerActivity extends BaseAboutProgressActivity {


    @Override
    public void initGetData() {
        mBaseRecyclerBeen.add(new BaseRecyclerBean("模拟下载功能",0));
        View rootView = addLayoutToFrameLayout(R.layout.android_os_handler_progress);
        initView(rootView);
    }

    @Override
    public void itemClickBack(View view, int position, boolean isLongClick) {

    }


    private void initView(View rootView) {
        mProgressStartBtn = rootView.findViewById(R.id.progress_start_btn);
        mProgressStopBtn = rootView.findViewById(R.id.progress_stop_btn);
        mProgressResetBtn = rootView.findViewById(R.id.progress_reset_btn);
        mShowProgress = rootView.findViewById(R.id.show_progress);
        mShowPb = rootView.findViewById(R.id.show_pb);
    }
}