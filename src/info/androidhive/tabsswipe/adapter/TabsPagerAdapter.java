package info.androidhive.tabsswipe.adapter;

import info.androidhive.tabsswipe.PopularPosts;
import info.androidhive.tabsswipe.RecentPosts;
import info.androidhive.tabsswipe.posts;
import info.androidhive.tabsswipe.RecentPosts;
import info.androidhive.tabsswipe.PopularPosts;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new posts();
		case 1:
			// Games fragment activity
			return new RecentPosts();
		case 2:
			// Movies fragment activity
			return new PopularPosts();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
