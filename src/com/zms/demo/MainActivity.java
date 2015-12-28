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

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initialLayout();
	}

	private void initialLayout() {
		ListView listView = (ListView) findViewById(R.id.listView);
		List<String> listData = new ArrayList<String>();
		listData.add("Progress");
		listData.add("Arrow");
		listData.add("Spectrum");
		listData.add("Light");
		listData.add("Battery");

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
			switch (position) {
			case 0:
				Intent intentProgress = new Intent(MainActivity.this,
						ProgressActivity.class);
				startActivity(intentProgress);
				break;

			case 1:
				Intent intentArrow = new Intent(MainActivity.this,
						ArrowActivity.class);
				startActivity(intentArrow);
				break;

			case 2:
				Intent intentSpectrum = new Intent(MainActivity.this,
						SpectrumActivity.class);
				startActivity(intentSpectrum);
				break;

			case 3:
				Intent intentLight = new Intent(MainActivity.this,
						LightActivity.class);
				startActivity(intentLight);
				break;

			case 4:
				Intent intentBattery = new Intent(MainActivity.this,
						BatteryActivity.class);
				startActivity(intentBattery);
				break;

			default:
				break;
			}

		}

	}
}
