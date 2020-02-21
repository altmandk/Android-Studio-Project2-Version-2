package com.example.project_2_version_2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ImageView moviePicture = (ImageView) findViewById(R.id.movieImage);
        TextView yearText = (TextView) findViewById(R.id.yearText);
        TextView durationText = (TextView) findViewById(R.id.durationText);
        TextView directorText = (TextView) findViewById(R.id.directorText);
        TextView starsText = (TextView) findViewById(R.id.starsText);
        TextView ratingsText = (TextView) findViewById(R.id.ratingsText);

        Intent callingIntent = getIntent();
        if (callingIntent != null) {

            switch (callingIntent.getStringExtra("movieInfo")) {
                case "coco":
                    int cocoResource = getResources().getIdentifier("@drawable/coco",
                            null, this.getPackageName());
                    yearText.setText("Released: November 22, 2017");
                    durationText.setText("Duration: 1h 45min");
                    directorText.setText("Director: Lee Unkrich");
                    starsText.setText("Starring: Anthony Gonzalez,\n                Gael Garcia Bernal,\n                Benjamin Bratt");
                    ratingsText.setText("Ratings: IMDb: 8.4\n               Rotten Tomatoes: 97%");
                    moviePicture.setImageResource(cocoResource);
                    return;
                case "infinity":
                    int infinityResource = getResources().getIdentifier("@drawable/infinity",
                            null, this.getPackageName());
                    yearText.setText("Released: April 27, 2018");
                    durationText.setText("Duration: 2h 29min");
                    directorText.setText("Director: Anthony Russo,\n                Joe Russo");
                    starsText.setText("Starring: Robert Downey Jr.,\n                Chris Hemsworth,\n                Mark Ruffalo");
                    ratingsText.setText("Ratings: IMDb: 8.5\n               Rotten Tomatoes: 85%");                    moviePicture.setImageResource(infinityResource);
                    return;
                case "joker":
                    int jokerResource = getResources().getIdentifier("@drawable/joker",
                            null, this.getPackageName());
                    yearText.setText("Released: October 4, 2019");
                    durationText.setText("Duration: 2h 2min");
                    directorText.setText("Director: Todd Phillips");
                    starsText.setText("Starring: Joaquin Phoenix,\n                Robert De Niro,\n                Zazie Beetz");
                    ratingsText.setText("Ratings: IMDb: 8.6\n               Rotten Tomatoes: 68%");                    moviePicture.setImageResource(jokerResource);
                    return;
                case "knives":
                    int knivesResource = getResources().getIdentifier("@drawable/knives",
                            null, this.getPackageName());
                    yearText.setText("Released: November 27, 2019");
                    durationText.setText("Duration: 2h 11min");
                    directorText.setText("Director: Rian Johnson");
                    starsText.setText("Starring: Daniel Craig,\n                Chris Evans,\n                Ana de Armas");
                    ratingsText.setText("Ratings: IMDb: 8.0\n               Rotten Tomatoes: 97%");                    moviePicture.setImageResource(knivesResource);
                    return;
                case "parasite":
                    int parasiteResource = getResources().getIdentifier("@drawable/parasite",
                            null, this.getPackageName());
                    yearText.setText("Released: November 8, 2019");
                    durationText.setText("Duration: 2h 12min");
                    directorText.setText("Director: Bong Joon Ho");
                    starsText.setText("Starring: Kang-ho Song,\n                Sun-kyun Lee,\n                Yeo-jeong Jo");
                    ratingsText.setText("Ratings: IMDb: 8.6\n               Rotten Tomatoes: 99%");                    moviePicture.setImageResource(parasiteResource);
                    return;
                case "uncut":
                    int uncutResource = getResources().getIdentifier("@drawable/uncut",
                            null, this.getPackageName());
                    yearText.setText("Released: December 25, 2019");
                    durationText.setText("Duration: 2h 15min");
                    directorText.setText("Director: Benny Safdie,\n                Josh Safdie");                    starsText.setText("Starring: Anthony Gonzalez,\n                Gael Garcia Bernal,\n                Benjamin Bratt");
                    ratingsText.setText("Ratings: IMDb: 7.7\n               Rotten Tomatoes: 92%");                    moviePicture.setImageResource(uncutResource);
                    return;
            }
        }
    }
}
