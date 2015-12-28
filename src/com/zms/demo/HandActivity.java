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
	}

}