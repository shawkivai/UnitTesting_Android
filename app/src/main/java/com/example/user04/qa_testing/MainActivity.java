package com.example.user04.qa_testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name,password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        final String username="shawki";
        final String pass="12345";

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validate(username,pass,name.getText().toString(),password.getText().toString())){
                    Toast.makeText(MainActivity.this, "Login! Success",
                            Toast.LENGTH_LONG).show();
//                    Snackbar snackbar= Snackbar.make( v , "Login!", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Invalid Login!",
                            Toast.LENGTH_LONG).show();
//                    Snackbar.make( v , "Invalid!", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                }

            }
        });


    }

    public static boolean validate(String username, String password, String inputUsername, String inputPass){
        if (username==inputUsername){
            if (password==inputPass){
                return true;
            }
        }
        else {
            return false;
        }
        return false;
    }
}
