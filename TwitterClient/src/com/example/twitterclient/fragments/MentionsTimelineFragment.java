package com.example.twitterclient.fragments;

import android.os.Bundle;

import com.example.twitterclient.util.Constants;

public class MentionsTimelineFragment extends TweetsListFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}
	
	@Override
	public void setFragmentType() {
		setFragmentType(Constants.FragmentType.MENTIONS);
	}
}
