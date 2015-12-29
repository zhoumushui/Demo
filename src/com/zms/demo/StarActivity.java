package com.zms.demo;

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
		ImageLayout star001 = (ImageLayout) findViewById(R.id.star001);
		star001.init(R.drawable.star_001, "001",
				getResources().getColor(R.color.fancy_white));
	}

}
