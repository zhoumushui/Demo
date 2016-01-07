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
		ImageLayout light001 = (ImageLayout) findViewById(R.id.light001);
		light001.init(R.drawable.light_001, "001",
				getResources().getColor(R.color.fancy_blue));

		ImageLayout light002 = (ImageLayout) findViewById(R.id.light002);
		light002.init(R.drawable.light_002, "002",
				getResources().getColor(R.color.fancy_teal));

		ImageLayout light003 = (ImageLayout) findViewById(R.id.light003);
		light003.init(R.drawable.light_003, "003",
				getResources().getColor(R.color.fancy_green));

		ImageLayout light004 = (ImageLayout) findViewById(R.id.light004);
		light004.init(R.drawable.light_004, "004",
				getResources().getColor(R.color.fancy_grey));
	}

}
