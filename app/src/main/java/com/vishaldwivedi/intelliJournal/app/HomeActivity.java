package com.vishaldwivedi.intelliJournal.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.vishaldwivedi.intelliJournal.R;
import com.vishaldwivedi.intelliJournal.app.AddAccounts;
import com.vishaldwivedi.intelliJournal.app.NavigationDrawerFragment;

public class HomeActivity extends AppCompatActivity {
    private Boolean isFabOpen = false;
    private Toolbar toolbar;
    private Animation fab_open, fab_close, rotate_forward, rotate_backward;
    private FloatingActionButton fab, fabAddImage, fabAddText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setUpToolBar();
        setUpDrawer();

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fabAddImage = (FloatingActionButton) findViewById(R.id.fabAddImage);
        fabAddText = (FloatingActionButton) findViewById(R.id.fabAddText);
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_backward);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
                //Intent i = new Intent(getApplicationContext(), AddAccounts.class);
                //startActivity(i);

                if(isFabOpen){

                    fab.startAnimation(rotate_backward);
                    fabAddImage.startAnimation(fab_close);
                    fabAddText.startAnimation(fab_close);
                    fabAddImage.setClickable(false);
                    fabAddText.setClickable(false);
                    isFabOpen = false;

                } else {

                    fab.startAnimation(rotate_forward);
                    fabAddImage.startAnimation(fab_open);
                    fabAddText.startAnimation(fab_open);
                    fabAddImage.setClickable(true);
                    fabAddText.setClickable(true);
                    isFabOpen = true;

                }
            }
        });
    }

    private void setUpToolBar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("IntelliJournal");
        //setSupportActionBar(toolbar);
    }

    private void setUpDrawer() {
        NavigationDrawerFragment navDrawerFragmet = (NavigationDrawerFragment)getSupportFragmentManager().findFragmentById(R.id.nav_draw_fragment);
        DrawerLayout drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        navDrawerFragmet.setupDrawer(R.id.nav_draw_fragment, drawerLayout, toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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
