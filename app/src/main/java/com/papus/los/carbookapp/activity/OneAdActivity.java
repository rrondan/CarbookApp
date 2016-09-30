package com.papus.los.carbookapp.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.papus.los.carbookapp.R;

public class OneAdActivity extends BaseActivity {

    TextView nameTextView, titleTextView, descriptionTextView;
    ImageView adPictureImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_ad);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        titleTextView = (TextView) findViewById(R.id.titleTextView);
        descriptionTextView = (TextView) findViewById(R.id.descriptionAdTextView);
        adPictureImageView = (ImageView) findViewById(R.id.adPictureImageView);

        Bundle bundle = getIntent().getExtras();
        nameTextView.setText(bundle.getString("name"));
        titleTextView.setText(bundle.getString("title"));
        descriptionTextView.setText(bundle.getString("description"));
        adPictureImageView.setImageResource(Integer.parseInt(bundle.getString("pictureUri")));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
