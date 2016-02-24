package com.example.actionbardemo;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_N extends Fragment{
@Override
public void onCreate(Bundle savedInstanceState) {
	Log.i("aaa", "EidtFragment--->onCreate");
	super.onCreate(savedInstanceState);
}
@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	Log.i("aaa", "EidtFragment--->onCreateView");
		return inflater.inflate(R.layout.tab_n, container,false);
	}
@Override
public void onStop()
{
    System.out.println("EidtFragment--->onStop");
    super.onStop();
}
}
