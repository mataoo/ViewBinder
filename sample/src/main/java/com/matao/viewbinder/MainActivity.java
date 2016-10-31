package com.matao.viewbinder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.matao.viewbinder.annotation.BindView;
import com.matao.viewbinder.annotation.OnClick;
import com.matao.viewbinder.api.ViewBinder;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bt_click)
    Button btClick;
    @BindView(R.id.tv_msg)
    TextView tvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewBinder.inject(this);
    }

    @OnClick(R.id.bt_click)
    void onClickBt() {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        tvMsg.setText("~~ Hello ~~");
    }
}
