package app.ajmer.tempo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;




public class Splash extends AppCompatActivity{
    private MediaPlayer mdx;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
       // MobileAds.initialize(this,"ca-app-pub-7442434584874848~2172122681");
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        mdx=MediaPlayer.create(this,R.raw.speech);
        mdx.start();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this,GridActivity.class);
                mdx.stop();
                finish();
                startActivity(i);
            }
        },3000);
    }
}
