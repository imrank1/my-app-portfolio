package com.example.ikhawaja.appportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    Button spotifyButton;
    Button scoresButton;
    Button libraryButton;
    Button buildItBiggerButton;
    Button xyzReaderButton;
    Button capstoneButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spotifyButton = (Button)findViewById(R.id.spotify_button);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), getResources().getString(R.string.spotify_launch_toast), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        scoresButton = (Button)findViewById(R.id.football_scores_button);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), getResources().getString(R.string.footbal_launch_toast), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        libraryButton = (Button)findViewById(R.id.library_button);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), getResources().getString(R.string.library_launch_toast), Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        buildItBiggerButton = (Button)findViewById(R.id.build_it_bigger_button);
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), getResources().getString(R.string.build_it_bigger_launch_toast), Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        xyzReaderButton = (Button)findViewById(R.id.xyz_reader_button);
        xyzReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), getResources().getString(R.string.xyz_reader_launch_toast), Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        capstoneButton = (Button)findViewById(R.id.capstone_button);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), getResources().getString(R.string.capstone_launch_toast), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
