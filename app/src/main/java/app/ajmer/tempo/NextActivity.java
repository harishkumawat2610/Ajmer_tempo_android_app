package app.ajmer.tempo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;




public class NextActivity extends AppCompatActivity {

    private ListView listView;

    String[] place={
            "अजय नगर  से  वैशाली नगर",
            "माकडवाली  से  चंद्रवरदाई",
            "रेलवे स्टेशन से जनाना अस्पताल",
            "मदार  से  जनाना",
            "डबल फाटक से जनाना अस्पताल",
            "कल्याणीपुरा  से  कुंदन नगर",
            "हटूंडी  से  यूनिवर्सिटी",
            "धोला भाटा  से  कुंदन नगर",
            "दोराई  से  फायसागर",
            "कोटडा  से  नारीशाला",
            "तबीजी  से  जनाना",
            "मार्टिन ब्रिज  से  नारेली",
            "धोला भाटा  से  जनाना",
            "यूनिवर्सिटी  से  कोटडा",
            "अंदर कोट  से  जनाना",
            "बोराज  से  संजय नगर",
            "माखुपुरा  से  R.T.O",
            "लो फ्लोर",
            "Not Available"
    };

    private Integer[] images={
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9,
            R.drawable.img10,
            R.drawable.img11,
            R.drawable.img15,
            R.drawable.img18,
            R.drawable.img19,
            R.drawable.img20,
            R.drawable.img21,
            R.drawable.img24,
            R.drawable.lowfloor,
            R.drawable.not

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        listView=(ListView)findViewById(R.id.listView);
      /*  AdView adView=(AdView)findViewById(R.id.adview);
        adView.loadAd(new AdRequest.Builder().build());*/


        CustomListAdapter adapter=new CustomListAdapter(this,place,images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {

                if(pos==0)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",1);
                    startActivity(in);
                }
                else if(pos==1)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",2);
                    startActivity(in);
                }
                else if(pos==2)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",3);
                    startActivity(in);
                }
                else if(pos==3)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",4);
                    startActivity(in);
                }
                else if(pos==4)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",5);
                    startActivity(in);
                }
                else if(pos==5)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",6);
                    startActivity(in);
                }
                else if(pos==6)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",7);
                    startActivity(in);
                }
                else if(pos==7)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",8);
                    startActivity(in);
                }
                else if(pos==8)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",9);
                    startActivity(in);
                }
                else if(pos==9)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",10);
                    startActivity(in);
                }
                else if(pos==10)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",11);
                    startActivity(in);
                }
                else if(pos==11)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",12);
                    startActivity(in);
                }
                else if(pos==12)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",13);
                    startActivity(in);
                }
                else if(pos==13)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",14);
                    startActivity(in);
                }
                else if(pos==14)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",15);
                    startActivity(in);
                }
                else if(pos==15)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",16);
                    startActivity(in);
                }
                else if(pos==16)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",17);
                    startActivity(in);
                }
                //low folr
                else if(pos==17)
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",18);
                    startActivity(in);
                }
                else
                {
                    Intent in=new Intent(NextActivity.this,LastActivity.class);
                    in.putExtra("key",19);
                    startActivity(in);
                }


            }
        });
    }

}
