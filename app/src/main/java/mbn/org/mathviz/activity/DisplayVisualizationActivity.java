package mbn.org.mathviz.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.VideoView;

import mbn.org.mathviz.R;
import mbn.org.mathviz.fragment.ContentsFragment;
import mbn.org.mathviz.fragment.HomeFragment;
import mbn.org.mathviz.fragment.NoLineVisualizationFragment;
import mbn.org.mathviz.fragment.SetVisualizationFragment;
import mbn.org.mathviz.fragment.TimeLineFragment;


public class DisplayVisualizationActivity extends AppCompatActivity {
    private VideoView video,video2;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private TabLayout tabVisualization;
    private ViewPager mViewPager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        String video_id = intent.getStringExtra("VIDEO_ID");
        video = findViewById(R.id.vidAddition);

        switch(video_id){
            case "addition":
                setContentView(R.layout.activity_display_visualization_2);
                setViewPager();
                break;
            case "subtraction":
                setContentView(R.layout.activity_display_visualization_1);
                video.setVideoURI(Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.subtraction));
                break;
            case "multiplication":
                setContentView(R.layout.activity_display_visualization_1);
                video.setVideoURI(Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.multiplication));
                break;
            case "division":
                setContentView(R.layout.activity_display_visualization_1);
                video.setVideoURI(Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.division));
                break;
            default:
                setContentView(R.layout.activity_display_visualization_1);
                break;
        }



    }

    private void setViewPager(){
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
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

    public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public CharSequence getPageTitle(int position){
            switch (position){
                case 0:
                    return "SetVisualization";
                case 1:
                    return "NoLineVisualization";
                default:
                    return "none selected";
            }
        }

        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position){
                case 0:
                    return new SetVisualizationFragment();
                case 1:
                    return new NoLineVisualizationFragment();
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
