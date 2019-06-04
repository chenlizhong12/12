package com.marvin.identifyspamapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.select_from_album:
            default:
                break;
        }

    }
}
