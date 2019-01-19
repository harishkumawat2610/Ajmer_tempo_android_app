package app.ajmer.tempo;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Arrays;



public class LastActivity extends AppCompatActivity {
   // private InterstitialAd interstitialAd;
    private TextView t1;
    Integer key;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

       /* AdView adView=(AdView)findViewById(R.id.adview);
        adView.loadAd(new AdRequest.Builder().build());

        interstitialAd=new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.interstitial1));
        interstitialAd.loadAd(new AdRequest.Builder().build());*/


        t1=(TextView)findViewById(R.id.textView);
        try {
            Bundle b = getIntent().getExtras();
            if (b != null) {
                key = (Integer) b.get("key");
            }
            switch (key) {
                case 1: {
                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_one)));
                    break;
                }
                case 2: {
                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_two)));
                    break;

                }
                case 3: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_three)));
                    break;

                }
                case 4: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_four)));
                    break;

                }
                case 5: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_five)));
                    break;

                }
                case 6: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_six)));
                    break;

                }
                case 7: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_seven)));
                    break;

                }
                case 8: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_eight)));
                    break;

                }
                case 9: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_nine)));
                    break;

                }
                case 10: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_ten)));
                    break;

                }
                case 11: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_eleven)));
                    break;

                }
                case 12: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_twelve)));
                    break;

                }
                case 13: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_thirthteen)));
                    break;

                }
                case 14: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_fourteen)));
                    break;

                }
                case 15: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_fifteen)));
                    break;

                }
                case 16: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_sixteen)));
                    break;

                }
                case 17: {

                    t1.setText(Arrays.toString(getResources().getStringArray(R.array.num_seventeen)));
                    break;

                }
                //for lowflore
                case 18: {
                    t1.setText("" +
                            "(1): बसस्टैंड से नसीराबाद.\n" +
                            "(2): बसस्टैंड से पुष्कर.\n" +
                            "(3): बसस्टैंड से श्रीनगर.");
                    break;

                }
                default: {

                    t1.setText("जानकारी के अनुसार वर्तमान समय में टेंपो नंबर 12,13,14,16,17,22,23 नहीं चलते और इसके बारे में हमारे पास कोई जानकारी नहीं है यदि आप इनके बारे में कोई जानकारी रखते हैं तो कृपया हमारी ईमेल Id पर जानकारी सेंड करें धन्यवाद\nKumawat.softs.questions4me@gmail.com");

                }
            }
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT).show();
        }

    }

    /*public void onBackPressed()
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
