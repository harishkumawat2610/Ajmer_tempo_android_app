package app.ajmer.tempo;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
import android.widget.ListView;
        import android.widget.Spinner;


import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;


public class Search extends AppCompatActivity {
   // private InterstitialAd interstitialAd;
    ListView found;
    Spinner search;
    Button find;
    int j;
    int[] id = {R.array.num_one,R.array.num_two,R.array.num_three,R.array.num_four,R.array.num_five,R.array.num_six,R.array.num_seven,R.array.num_eight,R.array.num_nine,R.array.num_ten,R.array.num_eleven,R.array.num_twelve,R.array.num_thirthteen,R.array.num_fourteen,R.array.num_fifteen,R.array.num_sixteen,R.array.num_seventeen};
    String search_for;
    List<String> stops = new ArrayList<>();
    List<String> tempo_number= new ArrayList<>();
    List<Integer> imageid = new ArrayList<>();
    List<Integer> send = new ArrayList<>();
    private int[] images={
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
            R.drawable.img24
    };
    @Override
    protected  void onCreate(Bundle savedInstancseState) {
        super.onCreate(savedInstancseState);
        setContentView(R.layout.search);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
       /* AdView adView=(AdView)findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);



        interstitialAd=new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.interstitial2));
        interstitialAd.loadAd(adRequest);*/



        found = (ListView) findViewById(R.id.found);
        search = (Spinner) findViewById(R.id.search);
        find = (Button)findViewById(R.id.find);
        String[] items = getResources().getStringArray(R.array.AllStops);
        ArrayAdapter<String> stringArrayAdapter =new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,items);
        search.setAdapter(stringArrayAdapter);
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempo_number.clear();
                imageid.clear();
                send.clear();
                search_for = search.getSelectedItem().toString();
                for( j=0;j<id.length;j++){
                    try {
                        stops = Arrays.asList(getResources().getStringArray(id[j]));
                        if (stops.contains(search_for)) {
                            tempo_number.add(getResources().getStringArray(id[j])[0]);
                            imageid.add(images[j]);
                            send.add(j);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                set();
            }
        });
        found.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int key = send.get(i)+1;
               Intent intent = new Intent(Search.this,LastActivity.class);
                intent.putExtra("key",key);;
                startActivity(intent);
            }
        });
    }
    public void set(){
        int size = imageid.size();
        String[] temp = tempo_number.toArray(new String[tempo_number.size()]);
        Integer[] imageId = imageid.toArray(new Integer[size]);
        found.setAdapter(new CustomListAdapter(this,temp,imageId));
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

