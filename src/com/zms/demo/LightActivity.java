package com.zms.demo;

import android.app.Activity;
import android.os.Bundle;

public class LightActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_light);

		initialLayout();
	}

	private void initialLayout() {
		ImageLayout light008 = (ImageLayout) findViewById(R.id.light008);
		light008.init(R.drawable.light_008, "008",
				getResources().getColor(R.color.fancy_white));

		ImageLayout light007 = (ImageLayout) findViewById(R.id.light007);
		light007.init(R.drawable.light_007, "007",
				getResources().getColor(R.color.fancy_white));

		ImageLayout light006 = (ImageLayout) findViewById(R.id.light006);
		light006.init(R.drawable.light_006, "006",
				getResources().getColor(R.color.fancy_black));

		ImageLayout light005 = (ImageLayout) findViewById(R.id.light005);
		light005.init(R.drawable.light_005, "005",
				getResources().getColor(R.color.fancy_white));

		ImageLayout light004 = (ImageLayout) findViewById(R.id.light004);
		light004.init(R.drawable.light_004, "004",
				getResources().getColor(R.color.fancy_yellow));

		ImageLayout light003 = (ImageLayout) findViewById(R.id.light003);
		light003.init(R.drawable.light_003, "003",
				getResources().getColor(R.color.fancy_green));

		ImageLayout light002 = (ImageLayout) findViewById(R.id.light002);
		light002.init(R.drawable.light_002, "002",
				getResources().getColor(R.color.fancy_teal));

		ImageLayout light001 = (ImageLayout) findViewById(R.id.light001);
		light001.init(R.drawable.light_001, "001",
				getResources().getColor(R.color.fancy_blue));

	}

}
