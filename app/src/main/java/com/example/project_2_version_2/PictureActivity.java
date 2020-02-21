package com.example.project_2_version_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        ImageView moviePicture = (ImageView) findViewById(R.id.imageView);

        Intent callingIntent = getIntent();
        if (callingIntent != null) {

            switch(callingIntent.getStringExtra("moviePic")) {
                case "coco":
                    int cocoResource = getResources().getIdentifier("@drawable/coco",
                            null, this.getPackageName());
                    moviePicture.setImageResource(cocoResource);
                    return;
                case "infinity":
                    int infinityResource = getResources().getIdentifier("@drawable/infinity",
                            null, this.getPackageName());
                    moviePicture.setImageResource(infinityResource);
                    return;
                case "joker":
                    int jokerResource = getResources().getIdentifier("@drawable/joker",
                            null, this.getPackageName());
                    moviePicture.setImageResource(jokerResource);
                    return;
                case "knives":
                    int knivesResource = getResources().getIdentifier("@drawable/knives",
                            null, this.getPackageName());
                    moviePicture.setImageResource(knivesResource);
                    return;
                case "parasite":
                    int parasiteResource = getResources().getIdentifier("@drawable/parasite",
                            null, this.getPackageName());
                    moviePicture.setImageResource(parasiteResource);
                    return;
                case "uncut":
                    int uncutResource = getResources().getIdentifier("@drawable/uncut",
                            null, this.getPackageName());
                    moviePicture.setImageResource(uncutResource);
                    return;
            }
        }
    }

    public void toWebsite(View view) {
        Intent callingIntent = getIntent();
        switch(callingIntent.getStringExtra("moviePic")) {
            case "coco":
                String cocoUrl = "https://www.imdb.com/title/tt2380307/?ref_=nv_sr_srsg_0";
                Uri cocoWebpage = Uri.parse(cocoUrl);

                Intent cocoImdb = new Intent(Intent.ACTION_VIEW, cocoWebpage);

                if (cocoImdb.resolveActivity(getPackageManager()) != null) {
                    startActivity(cocoImdb);
                }
                return;
            case "infinity":
                String infinityUrl = "https://www.imdb.com/title/tt4154756/?ref_=nv_sr_srsg_0";
                Uri infinityWebpage = Uri.parse(infinityUrl);

                Intent infinityImdb = new Intent(Intent.ACTION_VIEW, infinityWebpage);

                if (infinityImdb.resolveActivity(getPackageManager()) != null) {
                    startActivity(infinityImdb);
                }
                return;
            case "joker":
                String jokerUrl = "https://www.imdb.com/title/tt7286456/?ref_=fn_al_tt_1";
                Uri jokerWebpage = Uri.parse(jokerUrl);

                Intent jokerImdb = new Intent(Intent.ACTION_VIEW, jokerWebpage);

                if (jokerImdb.resolveActivity(getPackageManager()) != null) {
                    startActivity(jokerImdb);
                }
                return;
            case "knives":
                String knivesUrl = "https://www.imdb.com/title/tt8946378/?ref_=nv_sr_srsg_0";
                Uri knivesWebpage = Uri.parse(knivesUrl);

                Intent knivesImdb = new Intent(Intent.ACTION_VIEW, knivesWebpage);

                if (knivesImdb.resolveActivity(getPackageManager()) != null) {
                    startActivity(knivesImdb);
                }
                return;
            case "parasite":
                String parasiteUrl = "https://www.imdb.com/title/tt6751668/?ref_=nv_sr_srsg_1";
                Uri parasiteWebpage = Uri.parse(parasiteUrl);

                Intent parasiteImdb = new Intent(Intent.ACTION_VIEW, parasiteWebpage);

                if (parasiteImdb.resolveActivity(getPackageManager()) != null) {
                    startActivity(parasiteImdb);
                }
                return;
            case "uncut":
                String uncutUrl = "https://www.imdb.com/title/tt5727208/?ref_=nv_sr_srsg_0";
                Uri uncutWebpage = Uri.parse(uncutUrl);

                Intent uncutImdb = new Intent(Intent.ACTION_VIEW, uncutWebpage);

                if (uncutImdb.resolveActivity(getPackageManager()) != null) {
                    startActivity(uncutImdb);
                }
                return;
        }
    }
}
