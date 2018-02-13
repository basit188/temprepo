package mbn.org.mathviz.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.VideoView;

import mbn.org.mathviz.R;
import mbn.org.mathviz.fragment.NoLineVisualizationFragment;
import mbn.org.mathviz.fragment.SetVisualizationFragment;


public class DisplayVisualizationActivity extends AppCompatActivity implements OnClickListener {
    private VideoView video;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private TabLayout tabVisualization;
    private ViewPager mViewPager;
    private Uri videoUri;
    FloatingActionButton fab;
    public static final String VISUALIZATION_ID = "VISUALIZATION_ID";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String visualization_id = intent.getStringExtra("VISUALIZATION_ID");
        video = findViewById(R.id.vidAddition);


        switch(visualization_id){
            case "addition":
                setContentView(R.layout.activity_display_visualization_2);
                setViewPager("addition");
                break;
            case "subtraction":
                setContentView(R.layout.activity_display_visualization_2);
                setViewPager("subtraction");
                break;
            case "multiplication":
                setContentView(R.layout.activity_display_visualization_2);
                setViewPager("multiplication");
                break;
            case "division":
                setContentView(R.layout.activity_display_visualization_2);
                setViewPager("division");
                break;

            case "natural_numbers":
                setContentView(R.layout.activity_display_visualization_1);
                fab = findViewById(R.id.fabAddition);
                fab.setOnClickListener(this);
                video = findViewById(R.id.vidAddition);
                videoUri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.natural_numbers);
                video.setVideoURI(videoUri);
                video.start();
                break;

            case "whole_numbers":
                setContentView(R.layout.activity_display_visualization_1);
                fab = findViewById(R.id.fabAddition);
                fab.setOnClickListener(this);
                video = findViewById(R.id.vidAddition);
                videoUri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.whole_numbers);
                video.setVideoURI(videoUri);
                video.start();
                break;

            case "integers":
                setContentView(R.layout.activity_display_visualization_1);
                fab = findViewById(R.id.fabAddition);
                fab.setOnClickListener(this);
                video = findViewById(R.id.vidAddition);
                videoUri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.integers);
                video.setVideoURI(videoUri);
                video.start();
                break;
            case "rational":
                setContentView(R.layout.activity_display_visualization_1);
                fab = findViewById(R.id.fabAddition);
                fab.setOnClickListener(this);
                video = findViewById(R.id.vidAddition);
                videoUri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.rational);
                video.setVideoURI(videoUri);
                video.start();
                break;

            case "irrational":
                setContentView(R.layout.activity_display_visualization_1);
                fab = findViewById(R.id.fabAddition);
                fab.setOnClickListener(this);
                video = findViewById(R.id.vidAddition);
                videoUri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.irrational);
                video.setVideoURI(videoUri);
                video.start();
                break;
            case "real_numbers":
                setContentView(R.layout.activity_display_visualization_1);
                fab = findViewById(R.id.fabAddition);
                fab.setOnClickListener(this);
                video = findViewById(R.id.vidAddition);
                videoUri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.real_numbers);
                video.setVideoURI(videoUri);
                video.start();
                break;
            case "pie":
                setContentView(R.layout.activity_display_visualization_1);
                fab = findViewById(R.id.fabAddition);
                fab.setOnClickListener(this);
                video = findViewById(R.id.vidAddition);
                videoUri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.pie);
                video.setVideoURI(videoUri);
                video.start();
                break;

            case "eulers":
                setContentView(R.layout.activity_display_visualization_1);
                fab = findViewById(R.id.fabAddition);
                fab.setOnClickListener(this);
                video = findViewById(R.id.vidAddition);
                videoUri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.eulers);
                video.setVideoURI(videoUri);
                video.start();
                break;

            case "even":
                setContentView(R.layout.activity_display_visualization_1);
                fab = findViewById(R.id.fabAddition);
                fab.setOnClickListener(this);
                video = findViewById(R.id.vidAddition);
                videoUri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.even);
                video.setVideoURI(videoUri);
                video.start();
                break;
            case "odd":
                setContentView(R.layout.activity_display_visualization_1);
                fab = findViewById(R.id.fabAddition);
                fab.setOnClickListener(this);
                video = findViewById(R.id.vidAddition);
                videoUri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.odd_numbers);
                video.setVideoURI(videoUri);
                video.start();
                break;
            case "hcf":
                setContentView(R.layout.activity_display_visualization_1);
                fab = findViewById(R.id.fabAddition);
                fab.setOnClickListener(this);
                video = findViewById(R.id.vidAddition);
                videoUri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.hcf);
                video.setVideoURI(videoUri);
                video.start();
                break;
            case "lcm":
                setContentView(R.layout.activity_display_visualization_1);
                fab = findViewById(R.id.fabAddition);
                fab.setOnClickListener(this);
                video = findViewById(R.id.vidAddition);
                videoUri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.lcm);
                video.setVideoURI(videoUri);
                video.start();
                break;
            case "order_of_operations":
                setContentView(R.layout.activity_display_visualization_1);
                fab = findViewById(R.id.fabAddition);
                fab.setOnClickListener(this);
                video = findViewById(R.id.vidAddition);
                videoUri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.order_of_operations);
                video.setVideoURI(videoUri);
                video.start();
                break;

            case "percentage":
                setContentView(R.layout.activity_display_visualization_1);
                fab = findViewById(R.id.fabAddition);
                fab.setOnClickListener(this);
                video = findViewById(R.id.vidAddition);
                videoUri = Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.percentage);
                video.setVideoURI(videoUri);
                video.start();
                break;
            default:
                setContentView(R.layout.activity_display_visualization_1);
                break;
        }
    }

    private void setViewPager(String vizualization_id){
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mSectionsPagerAdapter.setVisualizationId(vizualization_id);
        mViewPager = findViewById(R.id.viewPagerDisplayVisualization);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        tabVisualization = findViewById(R.id.tabVisualization);
        tabVisualization.addTab(tabVisualization.newTab().setText("Set"));
        tabVisualization.addTab(tabVisualization.newTab().setText("Number Line"));
        mViewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabVisualization));
        tabVisualization.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            public void onTabSelected(TabLayout.Tab tab) { mViewPager.setCurrentItem(tab.getPosition()); }
            public void onTabUnselected(TabLayout.Tab tab) {}
            public void onTabReselected(TabLayout.Tab tab) {}
        });
    }

    @Override
    public void onClick(View v) {
        video.setVideoURI(videoUri);
        video.start();
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        String visualization_id;

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public void setVisualizationId(String vid){
            this.visualization_id = vid;
        }

        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position){
                case 0:
                    return SetVisualizationFragment.newInstance(visualization_id);
                case 1:
                    return NoLineVisualizationFragment.newInstance(visualization_id);
                default:
                    return null;
            }

        }

        public int getCount() {
            // Show 2 total pages.
            return 2;
        }

    }
}
