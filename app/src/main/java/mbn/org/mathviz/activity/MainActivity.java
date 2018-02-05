package mbn.org.mathviz.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import mbn.org.mathviz.R;
import mbn.org.mathviz.dialog.AlgebraContentsDialog;
import mbn.org.mathviz.dialog.ArithemeticOperationsDialog;
import mbn.org.mathviz.dialog.EvolutionOfNumbersDialog;
import mbn.org.mathviz.dialog.MathVizInfoDialog;
import mbn.org.mathviz.dialog.OtherConceptsDialog;
import mbn.org.mathviz.dialog.SpecialNumbersDialog;
import mbn.org.mathviz.fragment.ContentsFragment;
import mbn.org.mathviz.fragment.HomeFragment;
import mbn.org.mathviz.fragment.TimeLineFragment;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private MainActivity.SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        TabLayout tabLayout = findViewById(R.id.tabbar);
        tabLayout.addTab(tabLayout.newTab().setText("Home"));
        tabLayout.addTab(tabLayout.newTab().setText("Contents"));
        tabLayout.addTab(tabLayout.newTab().setText("Timeline"));
        //tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        mSectionsPagerAdapter = new MainActivity.SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            public void onTabSelected(TabLayout.Tab tab) { mViewPager.setCurrentItem(tab.getPosition()); }
            public void onTabUnselected(TabLayout.Tab tab) {}
            public void onTabReselected(TabLayout.Tab tab) {}
        });


        FloatingActionButton fab =  findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        FragmentManager fragmentManager;
        switch(id){
            case R.id.nav_visualization:
                fragmentManager = getSupportFragmentManager();
                (new MathVizInfoDialog()).show(fragmentManager, "InfoDialog");
                break;
            case R.id.nav_geometry:
                break;
            case R.id.nav_algebra:
                fragmentManager = getSupportFragmentManager();
                (new AlgebraContentsDialog()).show(fragmentManager,"ALGEBDIALOG");
                break;
            case R.id.nav_arithmetic_operations:
                fragmentManager = getSupportFragmentManager();
                (new ArithemeticOperationsDialog()).show(fragmentManager,"ALGEBDIALOG");
                break;
            case R.id.nav_evolution_of_numbers:
                fragmentManager = getSupportFragmentManager();
                (new EvolutionOfNumbersDialog()).show(fragmentManager,"ALGEBDIALOG");
                break;
            case R.id.nav_special_numbers:
                fragmentManager = getSupportFragmentManager();
                (new SpecialNumbersDialog()).show(fragmentManager,"ALGEBDIALOG");
                break;
            case R.id.nav_other_concepts:
                fragmentManager = getSupportFragmentManager();
                (new OtherConceptsDialog()).show(fragmentManager,"ALGEBDIALOG");
                break;

        }

//        else if (id == R.id.nav_gallery) {
//
//        } else if (id == R.id.nav_slideshow) {
//
//        } else if (id == R.id.nav_manage) {
//
//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
//
//        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public CharSequence getPageTitle(int position){
            switch (position){
                case 0:
                    return "Home";
                case 1:
                    return "Contents";
                case 2:
                    return "Timeline";
                default:
                    return "none selected";
            }
        }
        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position){
                case 0:
                    return new HomeFragment();
                case 1:
                    return new ContentsFragment();
                case 2:
                    return new TimeLineFragment();
                default:
                    return null;
            }

        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }

}