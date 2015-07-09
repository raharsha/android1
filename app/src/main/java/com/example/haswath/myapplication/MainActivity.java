package com.example.haswath.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        // Do something in response to button click
        String app = "spotify streamer";
        switch (view.getId()) {
            case R.id.button2:
                app = "scores";
                break;
            case R.id.button3:
                app = "library";
                break;
            case R.id.button4:
                app = "build it bigger";
                break;
            case R.id.button5:
                app = "bacon reader";
                break;
            case R.id.button6:
                app = "capstone";
                break;
        }
        Toast.makeText(getApplicationContext(), "This button with launch my " + app + " app!", Toast.LENGTH_SHORT).show();
    }

}
