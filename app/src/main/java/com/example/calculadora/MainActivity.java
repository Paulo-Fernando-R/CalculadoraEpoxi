package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    public void startActivity1(View view)
    {
        Intent activity1 = new Intent(this, Activity1.class);
        startActivity(activity1);
    }

    public void startActivity2(View view)
    {
        Intent activity2 = new Intent(this, Activity2.class);
        startActivity(activity2);
    }

    public void startActivity3(View view)
    {
        Intent activity3 = new Intent(this, Activity3.class);
        startActivity(activity3);
    }

    public void startActivity4(View view)
    {
        Intent activity4 = new Intent(this, Activity4.class);
        startActivity(activity4);
    }




    TabLayout tabLayout;
    ViewPager2 pager2;
    FragmentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        pager2 = findViewById(R.id.view_pager2);

        FragmentManager fm = getSupportFragmentManager();
        adapter = new FragmentAdapter(fm, getLifecycle());
        pager2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("Laminar"));
        tabLayout.addTab(tabLayout.newTab().setText("Preencher"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });




    }
}