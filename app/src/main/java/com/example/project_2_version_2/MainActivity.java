package com.example.project_2_version_2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String TAG = "moviePic";
    String TAG2 = "movieInfo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movies> movies = new ArrayList<>();
        movies.add(new Movies ("2017", "Coco", R.drawable.coco_small));
        movies.add(new Movies ("2018", "Avengers: Infinity War", R.drawable.infinity_small));
        movies.add(new Movies ("2019", "Joker", R.drawable.joker_small));
        movies.add(new Movies ("2019", "Knives Out", R.drawable.knives_small));
        movies.add(new Movies ("2019", "Parasite", R.drawable.parasite_small));
        movies.add(new Movies ("2019", "Uncut Gems",  R.drawable.uncut_small));

        listView = findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(this, movies);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, PictureActivity.class);

                switch(position) {
                    case 0:
                        i.putExtra(TAG, "coco");
                        startActivity(i);
                        break;
                    case 1:
                        i.putExtra(TAG, "infinity");
                        startActivity(i);
                        break;
                    case 2:
                        i.putExtra(TAG, "joker");
                        startActivity(i);
                        break;
                    case 3:
                        i.putExtra(TAG, "knives");
                        startActivity(i);
                        break;
                    case 4:
                        i.putExtra(TAG, "parasite");
                        startActivity(i);
                        break;
                    case 5:
                        i.putExtra(TAG, "uncut");
                        startActivity(i);
                        break;
                }
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        AdapterView.AdapterContextMenuInfo info =
                (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch(item.getItemId()) {
            case R.id.DisplayInfo:
                switch(info.position) {
                    case 0:
                        Intent cocoInfo = new Intent(MainActivity.this, InfoActivity.class);
                        cocoInfo.putExtra(TAG2, "coco");
                        if (cocoInfo.resolveActivity(getPackageManager()) != null) {
                            startActivity(cocoInfo);
                        }
                        return true;
                    case 1:
                        Intent infinityInfo = new Intent(MainActivity.this, InfoActivity.class);
                        infinityInfo.putExtra(TAG2, "infinity");
                        if (infinityInfo.resolveActivity(getPackageManager()) != null) {
                            startActivity(infinityInfo);
                        }
                        return true;
                    case 2:
                        Intent jokerInfo = new Intent(MainActivity.this, InfoActivity.class);
                        jokerInfo.putExtra(TAG2, "joker");
                        if (jokerInfo.resolveActivity(getPackageManager()) != null) {
                            startActivity(jokerInfo);
                        }
                        return true;
                    case 3:
                        Intent knivesInfo = new Intent(MainActivity.this, InfoActivity.class);
                        knivesInfo.putExtra(TAG2, "knives");
                        if (knivesInfo.resolveActivity(getPackageManager()) != null) {
                            startActivity(knivesInfo);
                        }
                        return true;
                    case 4:
                        Intent parasiteInfo = new Intent(MainActivity.this, InfoActivity.class);
                        parasiteInfo.putExtra(TAG2, "parasite");
                        if (parasiteInfo.resolveActivity(getPackageManager()) != null) {
                            startActivity(parasiteInfo);
                        }
                        return true;
                    case 5:
                        Intent uncutInfo = new Intent(MainActivity.this, InfoActivity.class);
                        uncutInfo.putExtra(TAG2, "uncut");
                        if (uncutInfo.resolveActivity(getPackageManager()) != null) {
                            startActivity(uncutInfo);
                        }
                        return true;
                }
                return true;
            case R.id.ToTrailer:
                switch(info.position) {
                    case 0:
                        String cocoTrailerUrl = "https://www.imdb.com/video/vi4249729305?ref_=nv_sr_srsg_1";
                        Uri cocoTrailerUri = Uri.parse(cocoTrailerUrl);

                        Intent cocoTrailer = new Intent(Intent.ACTION_VIEW, cocoTrailerUri);

                        if (cocoTrailer.resolveActivity(getPackageManager()) != null) {
                            startActivity(cocoTrailer);
                        }
                        return true;
                    case 1:
                        String infinityTrailerUrl = "https://www.imdb.com/video/vi528070681?playlistId=tt4154756&ref_=tt_ov_vi";
                        Uri infinityTrailerUri = Uri.parse(infinityTrailerUrl);

                        Intent infinityTrailer = new Intent(Intent.ACTION_VIEW, infinityTrailerUri);

                        if (infinityTrailer.resolveActivity(getPackageManager()) != null) {
                            startActivity(infinityTrailer);
                        }
                    case 2:
                        String jokerTrailerUrl = "https://www.imdb.com/video/vi1723318041?ref_=nv_sr_srsg_1";
                        Uri jokerTrailerUri = Uri.parse(jokerTrailerUrl);

                        Intent jokerTrailer = new Intent(Intent.ACTION_VIEW, jokerTrailerUri);

                        if (jokerTrailer.resolveActivity(getPackageManager()) != null) {
                            startActivity(jokerTrailer);
                        }
                        return true;
                    case 3:
                        String knivesTrailerUrl = "https://www.imdb.com/video/vi2464857881?ref_=nv_sr_srsg_1";
                        Uri knivesTrailerUri = Uri.parse(knivesTrailerUrl);

                        Intent knivesTrailer = new Intent(Intent.ACTION_VIEW, knivesTrailerUri);

                        if (knivesTrailer.resolveActivity(getPackageManager()) != null) {
                            startActivity(knivesTrailer);
                        }
                        return true;
                    case 4:
                        String parasiteTrailerUrl = "https://www.imdb.com/video/vi1015463705?playlistId=tt6751668&ref_=tt_ov_vi";
                        Uri parasiteTrailerUri = Uri.parse(parasiteTrailerUrl);

                        Intent parasiteTrailer = new Intent(Intent.ACTION_VIEW, parasiteTrailerUri);

                        if (parasiteTrailer.resolveActivity(getPackageManager()) != null) {
                            startActivity(parasiteTrailer);
                        }
                        return true;
                    case 5:
                        String uncutTrailerUrl = "https://www.imdb.com/video/vi2668412697?ref_=nv_sr_srsg_1";
                        Uri uncutTrailerUri = Uri.parse(uncutTrailerUrl);

                        Intent uncutTrailer = new Intent(Intent.ACTION_VIEW, uncutTrailerUri);

                        if (uncutTrailer.resolveActivity(getPackageManager()) != null) {
                            startActivity(uncutTrailer);
                        }
                        return true;
                }
                return true;
            case R.id.ToWiki:
                switch(info.position) {
                    case 0:
                        String cocoWikiUrl = "https://en.wikipedia.org/wiki/Lee_Unkrich";
                        Uri cocoWikiUri = Uri.parse(cocoWikiUrl);

                        Intent cocoWiki = new Intent(Intent.ACTION_VIEW, cocoWikiUri);

                        if (cocoWiki.resolveActivity(getPackageManager()) != null) {
                            startActivity(cocoWiki);
                        }
                        return true;
                    case 1:
                        String infinityWikiUrl = "https://en.wikipedia.org/wiki/Russo_brothers";
                        Uri infinityWikiUri = Uri.parse(infinityWikiUrl);

                        Intent infinityWiki = new Intent(Intent.ACTION_VIEW, infinityWikiUri);

                        if (infinityWiki.resolveActivity(getPackageManager()) != null) {
                            startActivity(infinityWiki);
                        }
                        return true;
                    case 2:
                        String jokerWikiUrl = "https://en.wikipedia.org/wiki/Todd_Phillips";
                        Uri jokerWikiUri = Uri.parse(jokerWikiUrl);

                        Intent jokerWiki = new Intent(Intent.ACTION_VIEW, jokerWikiUri);

                        if (jokerWiki.resolveActivity(getPackageManager()) != null) {
                            startActivity(jokerWiki);
                        }
                        return true;
                    case 3:
                        String knivesWikiUrl = "https://en.wikipedia.org/wiki/Rian_Johnson";
                        Uri knivesWikiUri = Uri.parse(knivesWikiUrl);

                        Intent knivesWiki = new Intent(Intent.ACTION_VIEW, knivesWikiUri);

                        if (knivesWiki.resolveActivity(getPackageManager()) != null) {
                            startActivity(knivesWiki);
                        }
                        return true;
                    case 4:
                        String parasiteWikiUrl = "https://en.wikipedia.org/wiki/Bong_Joon-ho";
                        Uri parasiteWikiUri = Uri.parse(parasiteWikiUrl);

                        Intent parasiteWiki = new Intent(Intent.ACTION_VIEW, parasiteWikiUri);

                        if (parasiteWiki.resolveActivity(getPackageManager()) != null) {
                            startActivity(parasiteWiki);
                        }
                        return true;
                    case 5:
                        String uncutWikiUrl = "https://en.wikipedia.org/wiki/Safdie_brothers";
                        Uri uncutWikiUri = Uri.parse(uncutWikiUrl);

                        Intent uncutWiki = new Intent(Intent.ACTION_VIEW, uncutWikiUri);

                        if (uncutWiki.resolveActivity(getPackageManager()) != null) {
                            startActivity(uncutWiki);
                        }
                        return true;
                }
                return true;
            case R.id.ToImdb:
                switch(info.position) {
                    case 0:
                        String cocoImdbUrl = "https://www.imdb.com/title/tt2380307/?ref_=nv_sr_srsg_0";
                        Uri cocoImdbUri = Uri.parse(cocoImdbUrl);

                        Intent cocoImdb = new Intent(Intent.ACTION_VIEW, cocoImdbUri);

                        if (cocoImdb.resolveActivity(getPackageManager()) != null) {
                            startActivity(cocoImdb);
                        }
                        return true;
                    case 1:
                        String infinityImdbUrl = "https://www.imdb.com/title/tt4154756/?ref_=nv_sr_srsg_0";
                        Uri infinityImdbUri = Uri.parse(infinityImdbUrl);

                        Intent infinityImdb = new Intent(Intent.ACTION_VIEW, infinityImdbUri);

                        if (infinityImdb.resolveActivity(getPackageManager()) != null) {
                            startActivity(infinityImdb);
                        }
                        return true;
                    case 2:
                        String jokerImdbUrl = "https://www.imdb.com/title/tt7286456/?ref_=fn_al_tt_1";
                        Uri jokerImdbUri = Uri.parse(jokerImdbUrl);

                        Intent jokerImdb = new Intent(Intent.ACTION_VIEW, jokerImdbUri);

                        if (jokerImdb.resolveActivity(getPackageManager()) != null) {
                            startActivity(jokerImdb);
                        }
                        return true;
                    case 3:
                        String knivesImdbUrl = "https://www.imdb.com/title/tt8946378/?ref_=nv_sr_srsg_0";
                        Uri knivesImdbUri = Uri.parse(knivesImdbUrl);

                        Intent knivesImdb = new Intent(Intent.ACTION_VIEW, knivesImdbUri);

                        if (knivesImdb.resolveActivity(getPackageManager()) != null) {
                            startActivity(knivesImdb);
                        }
                        return true;
                    case 4:
                        String parasiteImdbUrl = "https://www.imdb.com/title/tt6751668/?ref_=nv_sr_srsg_1";
                        Uri parasiteImdbUri = Uri.parse(parasiteImdbUrl);

                        Intent parasiteImdb = new Intent(Intent.ACTION_VIEW, parasiteImdbUri);

                        if (parasiteImdb.resolveActivity(getPackageManager()) != null) {
                            startActivity(parasiteImdb);
                        }
                        return true;

                    case 5:
                        String uncutImdbUrl = "https://www.imdb.com/title/tt5727208/?ref_=nv_sr_srsg_0";
                        Uri uncutImdbUri = Uri.parse(uncutImdbUrl);

                        Intent uncutImdb = new Intent(Intent.ACTION_VIEW, uncutImdbUri);

                        if (uncutImdb.resolveActivity(getPackageManager()) != null) {
                            startActivity(uncutImdb);
                        }
                        return true;
                }
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    class MyAdapter extends ArrayAdapter<Movies> {
        MyAdapter(Context c, List<Movies> movies){
            super(c, 0, movies);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            View row = convertView;

            if (row == null) {
                row = layoutInflater.inflate(R.layout.row, parent, false);
            }

            Movies currentMovie = getItem(position);

            ImageView images = row.findViewById(R.id.image);
            images.setImageResource(currentMovie.getmImage());

            TextView myTitle = row.findViewById(R.id.title);
            myTitle.setText(currentMovie.getmTitle());

            TextView myYear = row.findViewById(R.id.year);
            myYear.setText(currentMovie.getmYear());

            return row;
        }
    }
}
