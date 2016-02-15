package com.zms.demo.ui;

import com.zms.demo.ImageLayout;
import com.zms.demo.R;

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
		ImageLayout battery008 = (ImageLayout) findViewById(R.id.battery008);
		battery008.init(R.drawable.battery_008, "008",
				getResources().getColor(R.color.fancy_white));

		ImageLayout battery007 = (ImageLayout) findViewById(R.id.battery007);
		battery007.init(R.drawable.battery_007, "007",
				getResources().getColor(R.color.fancy_blue));

		ImageLayout battery006 = (ImageLayout) findViewById(R.id.battery006);
		battery006.init(R.drawable.battery_006, "006",
				getResources().getColor(R.color.fancy_yellow));

		ImageLayout battery005 = (ImageLayout) findViewById(R.id.battery005);
		battery005.init(R.drawable.battery_005, "005",
				getResources().getColor(R.color.fancy_white));

		ImageLayout battery004 = (ImageLayout) findViewById(R.id.battery004);
		battery004.init(R.drawable.battery_004, "004",
				getResources().getColor(R.color.fancy_orange));

		ImageLayout battery003 = (ImageLayout) findViewById(R.id.battery003);
		battery003.init(R.drawable.battery_003, "003",
				getResources().getColor(R.color.fancy_teal));

		ImageLayout battery002 = (ImageLayout) findViewById(R.id.battery002);
		battery002.init(R.drawable.battery_002, "002",
				getResources().getColor(R.color.fancy_blue));

		ImageLayout battery001 = (ImageLayout) findViewById(R.id.battery001);
		battery001.init(R.drawable.battery_001, "001",
				getResources().getColor(R.color.fancy_white));

	}

}
