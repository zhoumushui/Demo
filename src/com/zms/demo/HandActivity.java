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
		ImageLayout hand009 = (ImageLayout) findViewById(R.id.hand009);
		hand009.init(R.drawable.hand_009, "009",
				getResources().getColor(R.color.fancy_blue));

		ImageLayout hand008 = (ImageLayout) findViewById(R.id.hand008);
		hand008.init(R.drawable.hand_008, "008",
				getResources().getColor(R.color.fancy_teal));
		
		ImageLayout hand007 = (ImageLayout) findViewById(R.id.hand007);
		hand007.init(R.drawable.hand_007, "007",
				getResources().getColor(R.color.fancy_red));

		ImageLayout hand006 = (ImageLayout) findViewById(R.id.hand006);
		hand006.init(R.drawable.hand_006, "006",
				getResources().getColor(R.color.fancy_blue));

		ImageLayout hand005 = (ImageLayout) findViewById(R.id.hand005);
		hand005.init(R.drawable.hand_005, "005",
				getResources().getColor(R.color.fancy_white));
		
		ImageLayout hand004 = (ImageLayout) findViewById(R.id.hand004);
		hand004.init(R.drawable.hand_004, "004",
				getResources().getColor(R.color.fancy_green));

		ImageLayout hand003 = (ImageLayout) findViewById(R.id.hand003);
		hand003.init(R.drawable.hand_003, "003",
				getResources().getColor(R.color.fancy_white));

		ImageLayout hand002 = (ImageLayout) findViewById(R.id.hand002);
		hand002.init(R.drawable.hand_002, "002",
				getResources().getColor(R.color.fancy_yellow));

		ImageLayout hand001 = (ImageLayout) findViewById(R.id.hand001);
		hand001.init(R.drawable.hand_001, "001",
				getResources().getColor(R.color.fancy_blue));
	}

}
