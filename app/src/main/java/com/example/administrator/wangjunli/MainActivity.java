package com.example.administrator.wangjunli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loaddata();

    }

    private void loaddata() {
        textView= (TextView) findViewById(R.id.text);
        textView.setText("第一次提交");
    }

}
