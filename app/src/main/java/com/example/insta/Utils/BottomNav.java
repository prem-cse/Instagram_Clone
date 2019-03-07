package com.example.insta.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.example.insta.Add.AddActivity;
import com.example.insta.Home.MainActivity;
import com.example.insta.Notification.NotifyActivity;
import com.example.insta.Profile.ProfileActivity;
import com.example.insta.R;
import com.example.insta.Search.SearchActivity;

public class BottomNav {

    public static void Navigate(final Context context, BottomNavigationView view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch(menuItem.getItemId()){
                    case R.id.home : context.startActivity(new Intent(context, MainActivity.class));
                        return true;
                    case R.id.search : context.startActivity(new Intent(context, SearchActivity.class));
                        return true;
                    case R.id.addcircle : context.startActivity(new Intent(context, AddActivity.class));
                        return true;
                    case R.id.notification : context.startActivity(new Intent(context, NotifyActivity.class));
                        return true;
                    case R.id.account : context.startActivity(new Intent(context, ProfileActivity.class));
                        return true;
                    default:
                        return false;
                }

            }
        });
    }
}
