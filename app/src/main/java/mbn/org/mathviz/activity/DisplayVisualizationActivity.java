package mbn.org.mathviz.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

import mbn.org.mathviz.R;
import mbn.org.mathviz.fragment.NoLineVisualizationFragment;
import mbn.org.mathviz.fragment.SetVisualizationFragment;


public class DisplayVisualizationActivity extends AppCompatActivity {
    private VideoView video,video2;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private TabLayout tabVisualization;
    private ViewPager mViewPager;
    public static final String VISUALIZATION_ID = "VISUALIZATION_ID";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String visualization_id = intent.getStringExtra("VISUALIZATION_ID");
        video = findViewById(R.id.vidAddition);

        switch(visualization_id){
            case "addition":
                setContentView(R.layout.activity_display_visualization_1);
                setViewPager("addition");
                break;
            case "subtraction":
                setContentView(R.layout.activity_display_visualization_1);
                setViewPager("subtraction");
                break;
            case "multiplication":
                setContentView(R.layout.activity_display_visualization_1);
                setViewPager("multiplication");
                break;
            case "division":
                setContentView(R.layout.activity_display_visualization_1);
                setViewPager("division");
                break;
            default:
                setContentView(R.layout.activity_display_visualization_1);
                break;
        }
    }

    private void setViewPager(String vizualization_id){
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(),vizualization_id);
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

    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        String visualization_id;

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public SectionsPagerAdapter(FragmentManager fm,String visualization_id) {
            super(fm);
            this.visualization_id = visualization_id;
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
