package com.myschool.tp2;

import android.preference.PreferenceManager;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.SharedPreferences;
import android.content.Context;
import android.widget.TextView;


public class ProfileActivity extends ActionBarActivity {

    TextView welcome = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        welcome = (TextView) findViewById(R.id.welcome);

        SharedPreferences prefs = getSharedPreferences("CURRENT_LOGIN", Context.MODE_PRIVATE);
        String current_login = prefs.getString("current_login", "");
        SharedPreferences user_prefs = getSharedPreferences(current_login, Context.MODE_PRIVATE);
        String user_name = user_prefs.getString("user_name", "");

        welcome.setText("Bienvenue " + user_name);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_profile, menu);
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
