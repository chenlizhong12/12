package com.marvin.identifyspamapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.recognize_rubbish)
    ImageView recognizeRubbish;
    @BindView(R.id.rubbish1)
    Button rubbish1;
    @BindView(R.id.rubbish2)
    Button rubbish2;
    @BindView(R.id.rubbish3)
    Button rubbish3;
    @BindView(R.id.take_photo)
    LinearLayout takePhoto;
    @BindView(R.id.select_from_album)
    TextView selectFromAlbum;
    //图片路径
    private Uri imageUri;
    //图片名称
    private String filename;
    public static final int TAKE_PHOTO = 1;//拍照
    public static final int CHOOSE_PHOTO = 2;//从相册选择
    /*用来记录录像存储路径*/
    /**
     * 设置录像存储路径
     */
    File file = new File(Environment.getExternalStorageDirectory().getPath() + "/video.mp4");
    /**
     * 文件转成Uri格式
     */
    Uri uri = Uri.fromFile(file);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recognizeRubbish.setOnClickListener(this);
        rubbish1.setOnClickListener(this);
        rubbish2.setOnClickListener(this);
        rubbish3.setOnClickListener(this);
        takePhoto.setOnClickListener(this);
        selectFromAlbum.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.select_from_album:
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, AlbumShowActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("id", CHOOSE_PHOTO);
                intent.putExtras(bundle);
                MainActivity.this.startActivity(intent);
            case R.id.take_photo:
                Intent intent1 = new Intent();
                intent1.setClass(MainActivity.this, AlbumShowActivity.class);
                Bundle bundle1 = new Bundle();
                //使用显式Intent传递参数，用以区分功能
                bundle1.putInt("id", TAKE_PHOTO);
                intent1.putExtras(bundle1);
                //启动新的Intent
                MainActivity.this.startActivity(intent1);
                break;
            default:
                break;
        }

    }
}
