package com.example.finalexam07590633;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;




public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button registerButton = findViewById(R.id.register_button);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
//                i.putExtra("bbb", "222");
                startActivity(i);

            }
        });

        Button loginButton = findViewById(R.id.login_button);

        final EditText tName = (EditText) findViewById(R.id.username_edit_text);
        final EditText tPassword = (EditText) findViewById(R.id.password_edit_text);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check กรอกครบไหม
                if (tName.getText().length() == 0 || tPassword.getText().length() == 0) {
                    Toast t = Toast.makeText(LoginActivity.this, "All fields are required", Toast.LENGTH_SHORT);
                    t.show();
                } else {
                    //เช็คในdb
                    //if(มีในdb)ก็เข้าได้
                    //elseเข้าไม่ได้
                }
            }
        });

    }
}
