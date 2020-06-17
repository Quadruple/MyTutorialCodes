package app.syntaxation.listitemapplication;

import android.content.Context ;
import android.view.LayoutInflater ;
import android.view.View ;
import android.view.ViewGroup ;
import android.widget.ArrayAdapter;
import android.widget.ImageView ;
import android.widget.TextView ;


class CustomAdapter extends ArrayAdapter<String> {
    public CustomAdapter(Context context, String[] foods) {
        super(context, R.layout.custom_row , foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater atakansInflater = LayoutInflater.from(getContext()) ;
        View customView = atakansInflater.inflate(R.layout.custom_row , parent , false) ;

        String singleFoodItem = getItem(position) ;
        TextView atakansText = (TextView) customView.findViewById(R.id.atakansText) ;
        ImageView atakansImage = (ImageView) customView.findViewById(R.id.atakansImage) ;

        atakansText.setText(singleFoodItem) ;
        atakansImage.setImageResource(R.mipmap.samsunglogo);

        return customView ;
    }
}
