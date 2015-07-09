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
    public void sendMessage1(View view) {
        // Do something in response to button click
        Toast.makeText(getApplicationContext(), "This button with launch my spotify streamer app!", Toast.LENGTH_SHORT).show();
    }

    public void sendMessage2(View view) {
        // Do something in response to button click
        Toast.makeText(getApplicationContext(), "This button with launch my scores app!", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage3(View view) {
        // Do something in response to button click
        Toast.makeText(getApplicationContext(), "This button with launch my library app!", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage4(View view) {
        // Do something in response to button click
        Toast.makeText(getApplicationContext(), "This button with launch my build it bigger app!", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage5(View view) {
        // Do something in response to button click
        Toast.makeText(getApplicationContext(), "This button with launch my bacon reader app!", Toast.LENGTH_SHORT).show();
    }
    public void sendMessage6(View view) {
        // Do something in response to button click
        Toast.makeText(getApplicationContext(), "This button with launch my capstone app!", Toast.LENGTH_SHORT).show();
    }

}
