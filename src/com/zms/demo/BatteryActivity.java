package com.zms.demo;

import android.app.Activity;
import android.os.Bundle;

public class BatteryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_battery);

		initialLayout();
	}

	private void initialLayout() {
		ImageLayout battery001 = (ImageLayout) findViewById(R.id.battery001);
		battery001.init(R.drawable.battery_001, "001",
				getResources().getColor(R.color.fancy_white));

		ImageLayout battery002 = (ImageLayout) findViewById(R.id.battery002);
		battery002.init(R.drawable.battery_002, "002",
				getResources().getColor(R.color.fancy_blue));

		ImageLayout battery003 = (ImageLayout) findViewById(R.id.battery003);
		battery003.init(R.drawable.battery_003, "003",
				getResources().getColor(R.color.fancy_teal));

		ImageLayout battery004 = (ImageLayout) findViewById(R.id.battery004);
		battery004.init(R.drawable.battery_004, "004",
				getResources().getColor(R.color.fancy_green));
	}

}
