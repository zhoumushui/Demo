package com.zms.demo;

import android.app.Activity;
import android.os.Bundle;

public class RippleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ripple);

		initialLayout();
	}

	private void initialLayout() {
		ImageLayout ripple001 = (ImageLayout) findViewById(R.id.ripple001);
		ripple001.init(R.drawable.ripple_001, "001",
				getResources().getColor(R.color.fancy_white));

		ImageLayout ripple002 = (ImageLayout) findViewById(R.id.ripple002);
		ripple002.init(R.drawable.ripple_002, "002",
				getResources().getColor(R.color.fancy_white));

		ImageLayout ripple003 = (ImageLayout) findViewById(R.id.ripple003);
		ripple003.init(R.drawable.ripple_003, "003",
				getResources().getColor(R.color.fancy_blue));

	}

}
