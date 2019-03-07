package com.example.insta.Search;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.insta.R;
import com.example.insta.Utils.BottomNav;

public class SearchActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private static final int NUM = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomnav);
        BottomNav.Navigate(SearchActivity.this,bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(NUM);
        menuItem.setChecked(true);
    }
}
