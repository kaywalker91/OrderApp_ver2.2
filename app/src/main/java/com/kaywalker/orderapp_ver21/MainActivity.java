package com.kaywalker.orderapp_ver21;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kaywalker.orderapp_ver21.bottomFrag.BottomFrag_1;
import com.kaywalker.orderapp_ver21.bottomFrag.BottomFrag_2;
import com.kaywalker.orderapp_ver21.bottomFrag.BottomFrag_3;
import com.kaywalker.orderapp_ver21.bottomFrag.BottomFrag_4;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private BottomFrag_1 bottomfrag_1;
    private BottomFrag_2 bottomfrag_2;
    private BottomFrag_3 bottomfrag_3;
    private BottomFrag_4 bottomfrag_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_1:
                        setFrag(0);
                        break;
                    case R.id.action_2:
                        setFrag(1);
                        break;
                    case R.id.action_3:
                        setFrag(2);
                        break;
                    case R.id.action_4:
                        setFrag(3);
                        break;
                }
                return true;
            }
        });

        bottomfrag_1 = new BottomFrag_1();
        bottomfrag_2 = new BottomFrag_2();
        bottomfrag_3 = new BottomFrag_3();
        bottomfrag_4 = new BottomFrag_4();
        setFrag(0);

    }

    private void setFrag(int n){
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        switch (n){
            case 0:
                fragmentTransaction.replace(R.id.frame, bottomfrag_1);
                fragmentTransaction.commit();
                break;
            case 1:
                fragmentTransaction.replace(R.id.frame, bottomfrag_2);
                fragmentTransaction.commit();
                break;
            case 2:
                fragmentTransaction.replace(R.id.frame, bottomfrag_3);
                fragmentTransaction.commit();
                break;
            case 3:
                fragmentTransaction.replace(R.id.frame, bottomfrag_4);
                fragmentTransaction.commit();
                break;
        }
    }
}