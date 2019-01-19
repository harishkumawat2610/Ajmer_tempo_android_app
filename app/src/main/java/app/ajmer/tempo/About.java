package app.ajmer.tempo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class About extends AppCompatActivity {
   // private InterstitialAd interstitialAd;
    Button initium;
    //AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        //MobileAds.initialize(this,"ca-app-pub-1521582919795978~4032073306");
       /* adView = (AdView)findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);*/

        Button email=(Button)findViewById(R.id.harishEmail);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","kumawat.softs.questions4me@gmail.com",null));
                in.putExtra(Intent.EXTRA_SUBJECT,"Supported Mail");
                startActivity(Intent.createChooser(in,"use service"));
            }
        });

      /*  interstitialAd=new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.interstitial1));
        interstitialAd.loadAd(adRequest);*/

        Button fb=(Button)findViewById(R.id.fbconnect);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/ajmertempo.app.75"));
                startActivity(intent);
               
            }
        });
        initium =(Button)findViewById(R.id.initium);
        initium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://devinitium.wixsite.com/initium-softs"));
                startActivity(intent);
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
