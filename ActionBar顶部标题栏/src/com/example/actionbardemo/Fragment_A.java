package com.example.actionbardemo;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_A extends Fragment{
@Override
public void onCreate(Bundle savedInstanceState) {
	 Log.i("aaa","ComputerFragment--->onCreate");
	super.onCreate(savedInstanceState);
}
@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	Log.i("aaa","ConputerFragment--->onCreateView");
		return inflater.inflate(R.layout.tab_a, container, false);
		//返回R.layout.tab_a所指的view
	}
@Override
	public void onStop() {
		Log.i("aaa", "ConputerFragment--->onStop");
		super.onStop();
	}
}
