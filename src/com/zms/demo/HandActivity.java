package com.zms.demo;

import android.app.Activity;
import android.os.Bundle;

public class HandActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hand);

		initialLayout();
	}

	private void initialLayout() {
		ImageLayout hand001 = (ImageLayout) findViewById(R.id.hand001);
		hand001.init(R.drawable.hand_001, "001",
				getResources().getColor(R.color.fancy_blue));

		ImageLayout hand002 = (ImageLayout) findViewById(R.id.hand002);
		hand002.init(R.drawable.hand_002, "002",
				getResources().getColor(R.color.fancy_yellow));

		ImageLayout hand003 = (ImageLayout) findViewById(R.id.hand003);
		hand003.init(R.drawable.hand_003, "003",
				getResources().getColor(R.color.fancy_white));

		ImageLayout hand004 = (ImageLayout) findViewById(R.id.hand004);
		hand004.init(R.drawable.hand_004, "004",
				getResources().getColor(R.color.fancy_green));

		ImageLayout hand005 = (ImageLayout) findViewById(R.id.hand005);
		hand005.init(R.drawable.hand_005, "005",
				getResources().getColor(R.color.fancy_white));
	}

}
