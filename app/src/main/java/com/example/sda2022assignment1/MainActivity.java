package com.example.sda2022assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void showToast(View view)

    {
        CharSequence text = getResources().getString(R.string.mess_toast);
        int duration =Toast.LENGTH_SHORT;
        Toast toast =Toast.makeText(this, text, duration);
        toast.show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }






}