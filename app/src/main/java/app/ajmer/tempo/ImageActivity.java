package app.ajmer.tempo;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class ImageActivity extends Activity {
    //private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
      /*  AdView adView=(AdView)findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        interstitialAd=new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.interstitial2));
        interstitialAd.loadAd(adRequest);*/



        RelativeLayout relativeLayout=(RelativeLayout)findViewById(R.id.relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ImageActivity.this,"Upcomming In Next Version",Toast.LENGTH_SHORT).show();
            }
        });
    }

   /* public void onBackPressed()
    {
        if(interstitialAd.isLoaded()) {
            interstitialAd.show();
            super.onBackPressed();
        }
        else
        {
            super.onBackPressed();
        }
    }*/
}
