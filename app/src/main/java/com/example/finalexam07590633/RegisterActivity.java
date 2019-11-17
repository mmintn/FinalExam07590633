package com.example.finalexam07590633;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

       private static final String Fullname = "";
       private static final String Username = "";
       private static final String PASSWORD= "";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);



            Button reegister=findViewById(R.id.register_button);
            reegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    EditText fullname=findViewById(R.id.full_name_edit_text);
                    EditText username=findViewById(R.id.username_edit_text);
                    EditText password=findViewById(R.id.password_edit_text);

                    String inputFullname = username.getText().toString();
                    String inputUsername = username.getText().toString();
                    String inputPassword = password.getText().toString();

                    if(inputFullname.equals("")||inputUsername.equals(Username) || inputPassword.equals(PASSWORD)){
                        Toast t = Toast.makeText(RegisterActivity.this, "All fields are required", Toast.LENGTH_SHORT);
                        t.show();

                    }
                    else{
                        Toast t = Toast.makeText(RegisterActivity.this, "Register_successfully)", Toast.LENGTH_SHORT);
                        t.show();
                        //เก็บลงdb

                    }

                }
            });




        }

}
