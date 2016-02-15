package com.zms.demo.ui;

import com.zms.demo.ImageLayout;
import com.zms.demo.R;

import android.app.Activity;
import android.os.Bundle;

public class StarActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_star);

		initialLayout();
	}

	private void initialLayout() {
		ImageLayout star003 = (ImageLayout) findViewById(R.id.star003);
		star003.init(R.drawable.star_003, "003",
				getResources().getColor(R.color.fancy_black));

		ImageLayout star002 = (ImageLayout) findViewById(R.id.star002);
		star002.init(R.drawable.star_002, "002",
				getResources().getColor(R.color.fancy_white));

		ImageLayout star001 = (ImageLayout) findViewById(R.id.star001);
		star001.init(R.drawable.star_001, "001",
				getResources().getColor(R.color.fancy_white));

	}

}
