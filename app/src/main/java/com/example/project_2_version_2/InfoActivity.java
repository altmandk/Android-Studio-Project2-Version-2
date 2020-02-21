package com.example.project_2_version_2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent callingIntent = getIntent();

        if (callingIntent != null) {
            switch(callingIntent.getStringExtra("movieInfo")) {
                case "coco":

                case "infinity":

                case "joker":

                case "knives":

                case "parasite":

                case "uncut":

            }
        }





    }
}
