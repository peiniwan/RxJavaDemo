package com.example.lading.applicationdemo.operator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lading.applicationdemo.R;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;


/**
 * 操作符--filter
 */
public class RxFilterActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mText;
    private Button mBtn;
    private TextView mEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        initView();
    }

    private void initView() {
        mText = (TextView) findViewById(R.id.text1);
        mEdit = (TextView) findViewById(R.id.edit1);
        mBtn = (Button) findViewById(R.id.button);

        mBtn.setOnClickListener(this);
        mText.setOnClickListener(this);
        mEdit.setOnClickListener(this);
        mEdit.setText("输入1-10,过滤掉能被2整除的数");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.text1:
                break;
            case R.id.edit1:
                break;
            case R.id.button:

                start();
                break;
        }
    }

    private void start() {
//        filter：对集合进行过滤；map：对集合进行转化
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Observable.from(integers)
                .filter(new Func1<Integer, Boolean>() {
                    //参数是匿名内部类泛型第一个，返回值是匿名内部类泛型第二个
                    @Override
                    public Boolean call(Integer integer) {
                        return integer % 2 != 0;
                    }
                })
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        mText.append(integer.toString() + ",");
                    }
                });

        Observable.from(integers)
                .map(new Func1<Integer, Integer>() {//参数1：转换前的类型，参数2：转换后的类型

                    @Override
                    public Integer call(Integer integer) {
                        if( integer % 2 != 0){
                            return integer;
                        }
                        return 0;
                    }
                })
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        mText.append(integer.toString() + ",");

                    }
                });
    }
}
