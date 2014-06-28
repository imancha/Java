package com.imancha.doa;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final ActionBar mActionBar = getActionBar();

		mActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		final ViewPager mPager = (ViewPager) findViewById(R.id.pager);

		FragmentManager fm = getSupportFragmentManager();

		ViewPager.SimpleOnPageChangeListener pageChangeListener = new ViewPager.SimpleOnPageChangeListener() {
			@Override
			public void onPageSelected(int position) {
				super.onPageSelected(position);
				mActionBar.setSelectedNavigationItem(position);
			}
		};

		mPager.setOnPageChangeListener(pageChangeListener);

		FragmentAdapter fragmentPagerAdapter = new FragmentAdapter(fm);

		mPager.setAdapter(fragmentPagerAdapter);

		mActionBar.setDisplayShowTitleEnabled(true);

		ActionBar.TabListener tabListener = new ActionBar.TabListener() {

			@Override
			public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
			}

			@Override
			public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
				mPager.setCurrentItem(arg0.getPosition());
			}

			@Override
			public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
			}
		};

		Tab tab;
		tab = mActionBar.newTab().setText("Do'a").setTabListener(tabListener);
		mActionBar.addTab(tab);
		tab = mActionBar.newTab().setText("Bookmark").setTabListener(tabListener);
		mActionBar.addTab(tab);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.action_settings:
				Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
				break;
			case R.id.about:
				Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
				break;
			case R.id.action_search:
				Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
				break;
		}

		return true;
	}

}
