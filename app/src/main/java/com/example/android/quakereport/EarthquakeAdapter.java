package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {
        super(context,0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        EarthquakeActivity.ViewHolder viewHolder = null;

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
            viewHolder = new EarthquakeActivity.ViewHolder();
            viewHolder.magnitude = convertView.findViewById(R.id.magnitude);
            viewHolder.location =convertView.findViewById(R.id.location);
            viewHolder.time = convertView.findViewById(R.id.time);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (EarthquakeActivity.ViewHolder) convertView.getTag();
        }

        Earthquake current = getItem(position);

        viewHolder.magnitude.setText(current.getMagnitude());
        viewHolder.location.setText(current.getLocation());
        viewHolder.time.setText(current.getTime());

        return convertView;
    }
}
