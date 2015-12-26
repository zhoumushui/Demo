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
		light001.init(R.drawable.light_001, "001", "#1E88E5");
	}

}
