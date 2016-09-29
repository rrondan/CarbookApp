package com.papus.los.carbookapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Desarrollo on 29/9/2016.
 */

public class BaseActivity  extends AppCompatActivity {

    public void ChangeScreem(Class toActivity,Boolean delete)
    {
        Intent intent = new Intent(this,toActivity);
        startActivity(intent);
        if(delete)
            finish();

    }
    //ssss
    public void ChangeScreem(Class toActivity,Boolean delete,Integer fromAnimation,Integer toAnimation)
    {
        Intent intent = new Intent(this,toActivity);
        startActivity(intent);
        overridePendingTransition(fromAnimation,toAnimation );
        if(delete)
            finish();
    }

}
