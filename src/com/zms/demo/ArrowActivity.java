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
	}

}
