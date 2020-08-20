package com.dueeeke.dkplayer.activity.api;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.dueeeke.dkplayer.R;
import com.dueeeke.dkplayer.util.DataUtil;
import com.dueeeke.videoplayer.player.VideoView;

/**
 * 音频播放
 */
public class AudioPlayActivity extends AppCompatActivity {

    private static final String VOD_URL_1 = "http://vfx.mtime.cn/Video/2019/03/18/mp4/190318231014076505.mp4";
    private static final String VOD_URL_2 = DataUtil.SAMPLE_URL;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_play);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(R.string.str_audio_player);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        VideoView player1 = findViewById(R.id.player_1);
        player1.setUrl(VOD_URL_1);


    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
