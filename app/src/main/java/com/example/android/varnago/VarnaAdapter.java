package com.example.android.varnago;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class VarnaAdapter extends ArrayAdapter<Varna> {

    //background color
    private int mBackgroundColor;

    // creation of different topics depending on user's choice
    //context==context in the activity where the adapter is created
    //varna==places which are displayed in the current moment
    //backgroundColour==background color of the topic
    public VarnaAdapter(Context context, ArrayList<Varna> varna,int backgroundColor){
        super(context,0,varna);
        mBackgroundColor=backgroundColor;
    }


    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext())
                    .inflate(R.layout.varna_list_item,parent,false);
        }
        //getting the position of a place in Varna
        Varna currentPlace = getItem(position);

        //setting the textview to hold the title
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        //getting the title

        title.setText(currentPlace.getTitle());

        TextView description = (TextView) listItemView.findViewById(R.id.description);

        description.setText(currentPlace.getDescription());

        ImageView image = (ImageView) listItemView.findViewById(R.id.imageView);

        //lets handle the both cases - when there is an image,and when there isn't
        if(currentPlace.hasImage()){
            image.setImageResource(currentPlace.getImage());
            image.setVisibility(View.VISIBLE);
        }else{
            image.setVisibility(View.GONE);
        }

        //setting the theme , picking the color and setting the background color
        View container = listItemView.findViewById(R.id.container);
        int colorTheme = ContextCompat.getColor(getContext(),mBackgroundColor);
        container.setBackgroundColor(colorTheme);

        return listItemView;
    }
}
