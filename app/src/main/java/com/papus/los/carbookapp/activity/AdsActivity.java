package com.papus.los.carbookapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.papus.los.carbookapp.R;
import com.papus.los.carbookapp.adapter.AdsAdapter;
import com.papus.los.carbookapp.models.Ad;

import java.util.ArrayList;
import java.util.List;

public class AdsActivity extends BaseActivity {

    private List<Ad> Ads = new ArrayList<>();
    private RecyclerView adsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads);

        initializeData();

        adsRecyclerView = (RecyclerView) findViewById(R.id.adsRecyclerView);
        adsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        adsRecyclerView.setAdapter(new AdsAdapter(this.Ads));

    }

    public void initializeData(){
        Ads.add(new Ad(
                "Mejoras a mi vehiculo",
                "Quiero que a mi vehiculo le pongan aeroleones, nuevo motor, nuevas llantas y nuevas luces",
                Integer.toString(R.drawable.ad01),
                "Chuck Norris"
        ));
        Ads.add(new Ad(
                "Mejoras a mi vehiculo",
                "Quiero que a mi vehiculo le pongan aeroleones, nuevo motor, nuevas llantas y nuevas luces",
                Integer.toString(R.drawable.ad01),
                "Quien Te conoce"
        ));
        Ads.add(new Ad(
                "Mejoras a mi vehiculo",
                "Quiero que a mi vehiculo le pongan aeroleones, nuevo motor, nuevas llantas y nuevas luces",
                Integer.toString(R.drawable.ad01),
                "Chuck Norris Fucking Norris"
        ));

    }
}
