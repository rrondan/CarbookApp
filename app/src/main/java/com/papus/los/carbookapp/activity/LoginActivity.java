package com.papus.los.carbookapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.papus.los.carbookapp.R;

public class LoginActivity extends BaseActivity {

    EditText userEditText,passwordEditText;
    Button sigInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userEditText = (EditText)findViewById(R.id.userEditText);
        passwordEditText = (EditText)findViewById(R.id.passwordEditText);
        sigInButton = (Button) findViewById(R.id.sigInButton);

        sigInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userEditText.getText().toString().equals("user"))
                {

                }
            }
        });

    }
}
