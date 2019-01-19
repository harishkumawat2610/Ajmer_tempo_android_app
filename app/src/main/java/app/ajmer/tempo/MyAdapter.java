package app.ajmer.tempo;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MyAdapter extends BaseAdapter {
    private Context mContext;
    private final String[] Imageid;
    private final String[] gridColor;

    public MyAdapter(Context c,String[] Imageid,String[] gridColor ) {
        mContext = c;
        this.Imageid = Imageid;
        this.gridColor=gridColor;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return Imageid.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.fragment_grid, null);
            grid.setBackgroundColor(Color.parseColor(gridColor[position]));
            TextView textView = (TextView)grid.findViewById(R.id.txt);
            textView.setText(Imageid[position]);
        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}