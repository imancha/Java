package com.imancha.doa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

	private static final int PAGE_COUNT = 2;

	public FragmentAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int arg0) {
		Bundle data = new Bundle();

		switch (arg0) {
			case 0:
				Doa doa = new Doa();
				data.putInt("current_page", arg0 + 1);
				doa.setArguments(data);
				return doa;
			case 1:
				Bookmark bookmark = new Bookmark();
				data.putInt("current_page", arg0 + 1);
				bookmark.setArguments(data);
				return bookmark;
		}
		return null;
	}

	@Override
	public int getCount() {

		return PAGE_COUNT;
	}

}
