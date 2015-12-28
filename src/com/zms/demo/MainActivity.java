package com.zms.demo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private List<String> listData;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initialLayout();
	}

	private void initialLayout() {
		ListView listView = (ListView) findViewById(R.id.listView);
		listData = new ArrayList<String>();
		listData.add("Arrow");
		listData.add("Battery");
		listData.add("Bell");
		listData.add("Figure");
		listData.add("Hand");
		listData.add("Light");
		listData.add("Progress");
		listData.add("Ripple");
		listData.add("Spectrum");

		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				MainActivity.this, android.R.layout.simple_list_item_1,
				listData);
		listView.setAdapter(arrayAdapter);

		listView.setOnItemClickListener(new MyOnItemClickListener());
	}

	public class MyOnItemClickListener implements
			AdapterView.OnItemClickListener {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			try {
				Intent intent = new Intent(MainActivity.this,
						Class.forName("com.zms.demo." + listData.get(position)
								+ "Activity"));
				startActivity(intent);
			} catch (ClassNotFoundException e) {
				Toast.makeText(MainActivity.this, "ClassNotFound:" + e.toString(),
						Toast.LENGTH_SHORT).show();
				e.printStackTrace();
			}
		}
	}
}
