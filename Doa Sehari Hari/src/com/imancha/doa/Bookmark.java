package com.imancha.doa;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class Bookmark extends ListFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		DBHelper mydb = new DBHelper(getActivity().getBaseContext());
		ArrayList<String> bookmark = mydb.getAllBookmark();

		/** Creating array adapter to set data in listview */
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity()
				.getBaseContext(), android.R.layout.simple_list_item_1, bookmark);

		/** Setting the array adapter to the listview */
		setListAdapter(adapter);

		return super.onCreateView(inflater, container, savedInstanceState);
	}

	@Override
	public void onStart() {
		super.onStart();		
		getListView().setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);
		getListView().setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				ViewDoa.Title = getListAdapter().getItem(arg2).toString();
				Intent intent = new Intent(getActivity(), ViewDoa.class);
				startActivity(intent);
			}

		});

		getListView().setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				DBHelper mydb = new DBHelper(getActivity().getBaseContext());
				mydb.deleteBookmark(getListAdapter().getItem(arg2).toString());
/*				Intent intent = new Intent(getActivity(), MainActivity.class);
				startActivity(intent);
*/				Toast.makeText(getActivity(),"Removed from Bookmark", Toast.LENGTH_SHORT)
						.show();
				return true;
			}

		});
	}
}