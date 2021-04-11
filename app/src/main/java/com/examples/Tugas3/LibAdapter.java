package com.examples.Tugas3;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class LibAdapter extends RecyclerView.Adapter<LibAdapter.LibViewHolder> {
    private ArrayList<LibModel> listLib;
    private Context context;

    public LibAdapter(ArrayList<LibModel> dataList, Context context) {
        this.listLib = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public LibViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_card_recyclerview, parent, false);
        return new LibViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LibViewHolder holder, int position) {
        String image    = listLib.get(position).getImage();
        String name     = listLib.get(position).getName();
        String take     = listLib.get(position).getTake();
        String detail  = listLib.get(position).getDetail();

        Glide.with(holder.itemView.getContext())
            .load(listLib.get(position).getImage())
            .into(holder.image);

        holder.name.setText(name);
        holder.take.setText(take);
        holder.detail.setText(detail);

        try {

            holder.btnPreview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openDetailActivity(image, name, take, detail);
                }
            });

            holder.btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    shareAgent(name, detail);
                }
            });
        }catch (Exception e) {
            Log.d("DetailActivity", "MyErr : " + e);
        }
    }

    @Override
    public int getItemCount() {
        return (listLib != null) ? listLib.size() : 0;
    }


    public static class LibViewHolder extends RecyclerView.ViewHolder {

        private final ImageView image;
        private final TextView name, take, detail;
        private final Button btnPreview, btnShare;

        public LibViewHolder(View itemView) {
            super(itemView);
            image      = (ImageView) itemView.findViewById(R.id.image);
            name       = (TextView) itemView.findViewById(R.id.name);
            take       = (TextView) itemView.findViewById(R.id.take);
            detail = (TextView) itemView.findViewById(R.id.detail);
            btnPreview = (Button) itemView.findViewById(R.id.btnPreview);
            btnShare   = (Button) itemView.findViewById(R.id.btnShare);
        }
    }

    public void openDetailActivity(@NonNull String ...agent) {
        Intent i = new Intent(context, DetailActivity.class);
        i.putExtra("IMAGE", agent[0]);
        i.putExtra("NAME", agent[1]);
        i.putExtra("TAKE", agent[2]);
        i.putExtra("DETAIL", agent[3]);
        context.startActivity(i);
    }

    public void shareAgent(@NonNull String ...agent) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, agent[0] + "\n\n" + agent[1]);
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        context.startActivity(shareIntent);
    }
}
