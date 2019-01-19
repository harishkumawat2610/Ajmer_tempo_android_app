package app.ajmer.tempo;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;



public class GridActivity extends AppCompatActivity {
	GridView Grid;
	int i;
	
	String[] name={
			"Search\nBy\nNumber",
			"Search\nBy\nPalace Name",
			"Search\nBy\nLinks",
			"Search\nBy\nImages",
			"About\nUs",
			"Share"

	};
	String[] gridColor={

			"#2980B9",
			"#2ECC71",
			"#9B59B6",
			"#E67E22",
			"#FF6E40",
			"#2980B9"
	};
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_grid);
			/*MobileAds.initialize(this,"ca-app-pub-1521582919795978~4032073306");
			this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER_PORTRAIT);
			AdView adView=(AdView)findViewById(R.id.adview);
			adView.loadAd(new AdRequest.Builder().build());*/



			Grid = (GridView) findViewById(R.id.lst);
			Grid.setAdapter(new MyAdapter(GridActivity.this,name,gridColor));



				Grid.setOnItemClickListener(new OnItemClickListener() {
					@Override
					public void onItemClick(AdapterView<?> arg0, View v, int pos, long arg3) {
						if(connection()){

							if(pos==0)
							{
								startActivity(new Intent(GridActivity.this,NextActivity.class));
								Runtime.getRuntime().gc();

							}
							else if(pos==1)
							{
								startActivity(new Intent(GridActivity.this,Search.class));
								Runtime.getRuntime().gc();


							}
							else if(pos==2)
							{
								startActivity(new Intent(GridActivity.this,LinkActivity.class));
								Runtime.getRuntime().gc();

							}
							else if(pos==3)
							{
								startActivity(new Intent(GridActivity.this,ImageActivity.class));
								Runtime.getRuntime().gc();

							}
							else if(pos==4)
							{
								startActivity(new Intent(GridActivity.this,About.class));
								Runtime.getRuntime().gc();

							}
							else {
								Intent sendIntent = new Intent();
								sendIntent.setAction(Intent.ACTION_SEND).putExtra(Intent.EXTRA_TEXT, "आ गया अब अजमेर Ajmer tempo app जिससे आप घर बैठे देख सकते हैं कि कि कौनसा टेंपो कहां-कहां जाता है\nhttps://play.google.com/store/apps/details?id=app.ajmer.tempo\n" +
												"and Rate " +
												"and Share this application to your friends Thank you.").setType("text/plain");
								startActivity(sendIntent);
								Runtime.getRuntime().gc();

							}
						}else {
							Toast.makeText(getApplicationContext(),"कृपया इंटरनेट चालू करें",Toast.LENGTH_LONG).show();
						}
					}
				});
		      }

	public boolean connection(){
		ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
		if(cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState()== NetworkInfo.State.CONNECTED||cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState()==NetworkInfo.State.CONNECTED){
			return true;
		}
		else{
			return false;
		}
	}

}