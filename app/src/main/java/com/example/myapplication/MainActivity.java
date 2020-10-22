package com.example.myapplication;

import android.app.Fragment;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Class<?> aClass = null;
        Fragment f1 =null;
        try {

            aClass = Class.forName("com.example.myapplication.FirstFragment");
            f1 =(FirstFragment) aClass.newInstance();

            aClass = Class.forName("com.example.myapplication.SecondFragment");
            f1 =(FirstFragment) aClass.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }








        Fragment f2 = new SecondFragment();
        getFragmentManager().beginTransaction().replace(R.id.test, f1).commit();
        getFragmentManager().beginTransaction().replace(R.id.test2, f2).commit();


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