package com.zms.demo;

import android.app.Activity;
import android.os.Bundle;

public class ArrowActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arrow);

		initialLayout();
	}

	private void initialLayout() {
		ImageLayout arrow001 = (ImageLayout) findViewById(R.id.arrow001);
		arrow001.init(R.drawable.arrow_001, "001",
				getResources().getColor(R.color.fancy_blue));

		ImageLayout arrow002 = (ImageLayout) findViewById(R.id.arrow002);
		arrow002.init(R.drawable.arrow_002, "002",
				getResources().getColor(R.color.fancy_yellow));
		
		ImageLayout arrow003 = (ImageLayout) findViewById(R.id.arrow003);
		arrow003.init(R.drawable.arrow_003, "003",
				getResources().getColor(R.color.fancy_red));
	}

}
