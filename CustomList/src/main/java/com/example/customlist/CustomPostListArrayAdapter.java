package com.example.customlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomPostListArrayAdapter extends ArrayAdapter<PostItem> {

    Context context;
    int resource;
    ArrayList<PostItem> objects;


    public CustomPostListArrayAdapter(Context context, int resource, ArrayList<PostItem> objects) {
        super(context, resource, objects);

        this.context= context;
        this.resource= resource;
        this.objects= objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder;

        if(convertView==null) {
            holder= new Holder();

            convertView= LayoutInflater.from(context).inflate(resource,null);

            holder.imgChannelLogo= (ImageView) convertView.findViewById(R.id.img_channel_logo);
            holder.tvChannelName= (TextView) convertView.findViewById(R.id.tv_channel_name);
            holder.tvDateTime= (TextView) convertView.findViewById(R.id.tv_post_date);
            holder.tvHeading= (TextView) convertView.findViewById(R.id.tv_heading);
            holder.imgPost= (ImageView) convertView.findViewById(R.id.img_post);
            holder.tvDescription= (TextView) convertView.findViewById(R.id.tv_description);
            holder.tvLink= (TextView) convertView.findViewById(R.id.tv_link);
            holder.tvLikes= (TextView) convertView.findViewById(R.id.tv_likes);
            holder.tvComments= (TextView) convertView.findViewById(R.id.tv_comments);

            convertView.setTag(holder);

        } else {

            holder= (Holder) convertView.getTag();

        }

        holder.imgChannelLogo.setImageResource(objects.get(position).getChannelLogoResId());
        holder.tvChannelName.setText(objects.get(position).getChannelName());
        holder.tvDateTime.setText(objects.get(position).getDateTime());
        holder.tvHeading.setText(objects.get(position).getHeading());
        holder.imgPost.setImageResource(objects.get(position).getPostResId());
        holder.tvDescription.setText(objects.get(position).getDescription());
        holder.tvLink.setText(objects.get(position).getLink());
        holder.tvLikes.setText(objects.get(position).getLikes());
        holder.tvComments.setText(objects.get(position).getComments());

        return convertView;
    }

    class Holder {

        ImageView imgChannelLogo;
        TextView tvChannelName;
        TextView tvDateTime;
        TextView tvHeading;
        ImageView imgPost;
        TextView tvDescription;
        TextView tvLink;
        TextView tvLikes;
        TextView tvComments;

    }
}
