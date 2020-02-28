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
                    yearText.setText(R.string.cocoReleased);
                    durationText.setText(R.string.cocoDuration);
                    directorText.setText(R.string.cocoDirector);
                    starsText.setText(R.string.cocoStars);
                    ratingsText.setText(R.string.cocoRatings);
                    moviePicture.setImageResource(cocoResource);
                    break;
                case "infinity":
                    int infinityResource = getResources().getIdentifier("@drawable/infinity",
                            null, this.getPackageName());
                    yearText.setText(R.string.infinityReleased);
                    durationText.setText(R.string.infinityDuration);
                    directorText.setText(R.string.infinityDirector);
                    starsText.setText(R.string.infinityStars);
                    ratingsText.setText(R.string.infinityRatings);
                    moviePicture.setImageResource(infinityResource);
                    break;
                case "joker":
                    int jokerResource = getResources().getIdentifier("@drawable/joker",
                            null, this.getPackageName());
                    yearText.setText(R.string.jokerReleased);
                    durationText.setText(R.string.jokerDuration);
                    directorText.setText(R.string.jokerDirector);
                    starsText.setText(R.string.jokerStars);
                    ratingsText.setText(R.string.jokerRatings);
                    moviePicture.setImageResource(jokerResource);
                    break;
                case "knives":
                    int knivesResource = getResources().getIdentifier("@drawable/knives",
                            null, this.getPackageName());
                    yearText.setText(R.string.knivesReleased);
                    durationText.setText(R.string.knivesDuration);
                    directorText.setText(R.string.knivesDirector);
                    starsText.setText(R.string.knivesStars);
                    ratingsText.setText(R.string.knivesRatings);
                    moviePicture.setImageResource(knivesResource);
                    break;
                case "parasite":
                    int parasiteResource = getResources().getIdentifier("@drawable/parasite",
                            null, this.getPackageName());
                    yearText.setText(R.string.parasiteReleased);
                    durationText.setText(R.string.parasiteDuration);
                    directorText.setText(R.string.parasiteDirector);
                    starsText.setText(R.string.parasiteStars);
                    ratingsText.setText(R.string.parasiteRatings);
                    moviePicture.setImageResource(parasiteResource);
                    break;
                case "uncut":
                    int uncutResource = getResources().getIdentifier("@drawable/uncut",
                            null, this.getPackageName());
                    yearText.setText(R.string.uncutReleased);
                    durationText.setText(R.string.uncutDuration);
                    directorText.setText(R.string.uncutDirector);
                    starsText.setText(R.string.uncutStars);
                    ratingsText.setText(R.string.uncutRatings);
                    moviePicture.setImageResource(uncutResource);
                    break;
            }
        }
    }
}
