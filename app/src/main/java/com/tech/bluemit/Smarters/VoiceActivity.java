package com.tech.bluemit.Smarters;

import android.os.Bundle;
import android.app.Activity;
import android.view.Window;
import com.dxjia.library.BaiduVoiceHelper;
import android.media.MediaPlayer;

/**
 * Created by bluemit on 16-3-26.
 */
public class VoiceActivity extends Activity {
    private static final String BAI_DU_DEMO_APIKEY = "U6D0RePVGhAirVMy4fnR3C63";
    private static final String BAI_DU_DEMO_SECRET = "cfde581f0eb55a77812ce130a539a681";

    private static final int REQUEST_UI = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MediaPlayer media = MediaPlayer.create(VoiceActivity.this,R.raw.bdspeech_recognition_start);
        if(media.isPlaying()){
            media.stop();
        }
        media.release();
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        BaiduVoiceHelper.startBaiduVoiceDialogForResult(VoiceActivity.this,
                BAI_DU_DEMO_APIKEY, BAI_DU_DEMO_SECRET, REQUEST_UI);

        setContentView(R.layout.voice);
    }


}
