package com.skylar.annotationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.skylar.lib_annotation.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindViewTool.bind(this);
        mTextView.setText("Hello Annotation");
    }
}
