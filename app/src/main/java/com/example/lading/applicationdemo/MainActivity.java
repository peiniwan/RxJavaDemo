package com.example.lading.applicationdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.lading.applicationdemo.operator.NormalRxActivity;
import com.example.lading.applicationdemo.operator.RxBindingActivity;
import com.example.lading.applicationdemo.operator.RxConnetActivity;
import com.example.lading.applicationdemo.operator.RxFilterActivity;
import com.example.lading.applicationdemo.operator.RxFlatMapActivity;
import com.example.lading.applicationdemo.operator.RxMapActivity;
import com.example.lading.applicationdemo.operator.RxMergeActivity;
import com.example.lading.applicationdemo.operator.RxSchuderActivity;
import com.example.lading.applicationdemo.operator.RxSortActivity;
import com.example.lading.applicationdemo.operator.RxTakeActivity;
import com.example.lading.applicationdemo.operator.RxTimerActivity;
import com.example.lading.applicationdemo.operator.TimestampActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;
    private Button mBtn4;
    private Button mBtn5;
    private Button mBtn6;
    private Button mBtn7;
    private Button mBtn8;
    private Button mBtn9;
    private Button mBtn13;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
        findViewById(R.id.button9).setOnClickListener(this);
        findViewById(R.id.button10).setOnClickListener(this);
        findViewById(R.id.button11).setOnClickListener(this);
        findViewById(R.id.button12).setOnClickListener(this);
        findViewById(R.id.button13).setOnClickListener(this);

//        mBtn1= (Button) findViewById(R.id.button);
//        mBtn1= (Button) findViewById(R.id.button);
//        mBtn1= (Button) findViewById(R.id.button);



    }

    @Override
    public void onClick(View view) {
        Intent intent=null;
        switch (view.getId()){
            case R.id.button1:intent=new Intent(MainActivity.this,NormalRxActivity.class);
                break;
            case R.id.button2: intent=new Intent(MainActivity.this,RxMapActivity.class);
                break;
            case R.id.button3:intent=new Intent(MainActivity.this,RxSchuderActivity.class);
                break;
            case R.id.button4:intent=new Intent(MainActivity.this,RxFlatMapActivity.class);
                break;
            case R.id.button5:intent=new Intent(MainActivity.this,RxMergeActivity.class);
                break;
            case R.id.button6:intent=new Intent(MainActivity.this,RxBindingActivity.class);
                break;
            case R.id.button7:intent=new Intent(MainActivity.this,RxFilterActivity.class);
                break;
            case R.id.button8:intent=new Intent(MainActivity.this,RxTakeActivity.class);
                break;
            case R.id.button9:intent=new Intent(MainActivity.this,RxTimerActivity.class);
                break;
            case R.id.button10:intent=new Intent(MainActivity.this,RxSortActivity.class);
                break;
            case R.id.button11:intent=new Intent(MainActivity.this,RxConnetActivity.class);
                break;
            case R.id.button12:intent=new Intent(MainActivity.this,TimestampActivity.class);
                break;
            case R.id.button13:intent=new Intent(MainActivity.this,NetActivity.class);
                break;
        }
        startActivity(intent);
    }
}
