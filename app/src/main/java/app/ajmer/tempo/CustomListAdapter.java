package app.ajmer.tempo;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import de.hdodenhof.circleimageview.CircleImageView;

public class CustomListAdapter extends ArrayAdapter<String> {
 
private final Activity context;
private final String[] web;
private final Integer[] imageId;
public CustomListAdapter(Activity context,
                         String[] web, Integer[] imageId) {
super(context, R.layout.layout2, web);
this.context = context;
this.web = web;
this.imageId = imageId;
 
}
@SuppressLint({ "ViewHolder", "InflateParams" }) @Override
public View getView(int position, View view, ViewGroup parent) {
LayoutInflater inflater = context.getLayoutInflater();
View rowView= inflater.inflate(R.layout.layout2, null, true);
TextView txtTitle = (TextView) rowView.findViewById(R.id.txt1);
 
CircleImageView imageView = (CircleImageView) rowView.findViewById(R.id.img);
txtTitle.setText(web[position]);
 
imageView.setImageResource(imageId[position]);
return rowView;
}
}