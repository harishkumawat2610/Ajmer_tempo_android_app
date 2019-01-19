package app.ajmer.tempo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import java.util.Locale;



public class LinkActivity extends AppCompatActivity implements View.OnClickListener{
  //  private InterstitialAd interstitialAd;
    private Button petrol,hospital,restorant,cinema,gym,dance,other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
       /* AdView adView=(AdView)findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        interstitialAd=new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.interstitial1));
        interstitialAd.loadAd(adRequest);*/




        petrol=(Button)findViewById(R.id.petrol);
        hospital=(Button)findViewById(R.id.hospital);
        restorant=(Button)findViewById(R.id.restorant);
        cinema=(Button)findViewById(R.id.cinema);
        gym=(Button)findViewById(R.id.gym);
        dance=(Button)findViewById(R.id.dance);
        other=(Button)findViewById(R.id.other);

        petrol.setOnClickListener(this);
        hospital.setOnClickListener(this);
        restorant.setOnClickListener(this);
        cinema.setOnClickListener(this);
        gym.setOnClickListener(this);
        dance.setOnClickListener(this);
        other.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view==petrol)
        {
           Intent in =new Intent(Intent.ACTION_VIEW);
            in.setData(Uri.parse("https://www.google.co.in/search?client=ms-android-xiaomi&ei=vc2jWa2nGMGLvQS0hYjICg&q=petrol+pump+near+by+me&rlst=f&sa=X&ved=0ahUKEwjt-dyQu_nVAhXBRY8KHbQCAqkQjGoISQ"));
            startActivity(in);
        }
        else if(view==hospital)
        {

            Intent in =new Intent(Intent.ACTION_VIEW);
            in.setData(Uri.parse("https://www.google.co.in/search?client=ms-android-xiaomi&ei=Y9KjWaDyM8T8vgT30bqwBQ&q=private+hospital+near+me&oq=private+hospital+near&gs_l=mobile-gws-serp.1.0.0l5.2514.9112.0.10010.13.13.0.3.3.0.1121.4043.2-2j5j0j1j0j1.9.0....0...1.1j4.64.mobile-gws-serp..6.7.1438...35i39k1.Xg2y7uDkIGU#istate=lrl:xpd"));
            startActivity(in);
        }
        else if(view==restorant)
        {
            Intent in =new Intent(Intent.ACTION_VIEW);
            in.setData(Uri.parse("https://www.google.co.in/search?client=ms-android-xiaomi&ei=Y9KjWaDyM8T8vgT30bqwBQ&q=restaurants+near+me&oq=restorent&gs_l=mobile-gws-serp.1.0.0i10k1l5.29471.37974.0.39259.11.10.1.4.4.0.474.2708.2-7j1j1.9.0....0...1.1j4.64.mobile-gws-serp..2.9.1223.3..0j35i39k1j0i67k1j0i2i159k1.MTqYg9wVJxc#istate=lrl:xpd"));
            startActivity(in);

        }
        else if(view==cinema)
        {
            Intent in =new Intent(Intent.ACTION_VIEW);
            in.setData(Uri.parse("https://www.google.co.in/search?client=ms-android-xiaomi&ei=KtOjWeugHcXfvgTTiJawDw&q=cinemas+near+me&oq=cine+near+me&gs_l=mobile-gws-serp.1.0.0i7i30k1l5.148078.151586.0.152963.16.11.0.0.0.0.442.2710.0j1j7j1j1.10.0....0...1.1j4.64.mobile-gws-serp..11.5.1381.NOWOjGVXq68#istate=lrl:xpd"));
            startActivity(in);

        }
        else if(view==gym)
        {
            Intent in =new Intent(Intent.ACTION_VIEW);
            in.setData(Uri.parse("https://www.google.co.in/search?client=ms-android-xiaomi&ei=KtOjWeugHcXfvgTTiJawDw&q=gyms+near+me&oq=gym&gs_l=mobile-gws-serp.1.1.35i39k1j0i67k1l4.3687.10525.0.12286.12.9.4.2.2.0.485.2009.2-3j1j2.6.0....0...1.1j4.64.mobile-gws-serp..1.11.1930.3..0j0i46i67k1j46i67k1.E4wCBMQBV4E#istate=lrl:xpd"));
            startActivity(in);

        }
        else if(view==dance)
        {
            Intent in =new Intent(Intent.ACTION_VIEW);
            in.setData(Uri.parse("https://www.google.co.in/search?client=ms-android-xiaomi&ei=A9SjWf7VFML4vATtz4fYDQ&q=dance+classes+near+me&oq=Dance+near+me&gs_l=mobile-gws-serp.1.1.0i7i30k1l5.36839.42061.0.45653.10.9.0.0.0.0.312.2045.2-7j1.8.0....0...1.1j4.64.mobile-gws-serp..4.6.1543.7TUnn5tGFxo#istate=lrl:xpd"));
            startActivity(in);

        }
        //for oyhers
        else
        {
            Intent in =new Intent(Intent.ACTION_VIEW);
            in.setData(Uri.parse("https://www.google.co.in"));
            startActivity(in);

        }
    }

  /*  public void onBackPressed()
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
