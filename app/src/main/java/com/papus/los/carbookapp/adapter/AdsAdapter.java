package com.papus.los.carbookapp.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.papus.los.carbookapp.R;
import com.papus.los.carbookapp.activity.OneAdActivity;
import com.papus.los.carbookapp.models.Ad;

import org.w3c.dom.Text;

/**
 * Created by usuario on 29/09/2016.
 */

public class AdsAdapter extends RecyclerView.Adapter<AdsAdapter.ViewHolder> {

        private List<Ad> Ads;

        public AdsAdapter(List<Ad> Ads) {
                this.Ads = Ads;
        }

        @Override
        public AdsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.card_ad, parent, false);
                ViewHolder viewHolder = new ViewHolder(view);
                return viewHolder;
        }

        @Override
        public void onBindViewHolder(AdsAdapter.ViewHolder holder, final int position) {
                holder.titleTextView.setText(Ads.get(position).getTitle());
                holder.adPictureImageView.setImageResource(Integer.parseInt(Ads.get(position).getPictureUri()));
                holder.descriptionAdTextView.setText(Ads.get(position).getDescription());
                holder.nameTextView.setText(Ads.get(position).getClient());
                holder.AdCardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Intent itemIntent = new Intent(v.getContext(), OneAdActivity.class);
                                Bundle bundle = new Bundle();
                                bundle.putString("name",Ads.get(position).getClient());
                                bundle.putString("title",Ads.get(position).getTitle());
                                bundle.putString("description",Ads.get(position).getDescription());
                                bundle.putString("pictureUri",Ads.get(position).getPictureUri());
                                itemIntent.putExtras(bundle);
                                v.getContext().startActivity(itemIntent);
                        }
                });

        }

        @Override
        public int getItemCount() {
                return Ads.size();
                }

        public void setAds(List<Ad> Ads) {
                this.Ads = Ads;
                }

        public class ViewHolder extends RecyclerView.ViewHolder {
                CardView AdCardView;
                TextView titleTextView, descriptionAdTextView, nameTextView;
                ImageView adPictureImageView;

                public ViewHolder(View itemView) {
                        super(itemView);
                        AdCardView = (CardView) itemView.findViewById(R.id.adCardView);
                        titleTextView = (TextView) itemView.findViewById(R.id.titleTextView);
                        descriptionAdTextView = (TextView) itemView.findViewById(R.id.descriptionAdTextView);
                        nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
                        adPictureImageView = (ImageView) itemView.findViewById(R.id.adPictureImageView);
                }
        }
}
