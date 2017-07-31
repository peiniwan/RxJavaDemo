package com.example.lading.applicationdemo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

import static android.content.ContentValues.TAG;

/**
 * Created by liuyu1 on 2017/7/21.
 */

public class DownPicActivity extends Activity {
    private Button button;

    private ImageView imageView;

    private String PATH = "http://pic32.nipic.com/20130829/12906030_124355855000_2.png";

    private DownLoadUtils utils;
    /**
     * 采用handler 结合了activity使用
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_down_pic);
        button = (Button)this.findViewById(R.id.button);
        imageView = (ImageView)this.findViewById(R.id.imageView);
        utils = new DownLoadUtils();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //使用HTTP协议获取数据
                utils.downLoadImage(PATH).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<byte[]>() {
                    @Override
                    public void onCompleted() {
                        Log.i(TAG,"onCompleted");//对话框消失
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i(TAG,e.getMessage());
                    }

                    @Override
                    public void onNext(byte[] bytes) {
                        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes,0,bytes.length);
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
        });
    }


}
