package com.zms.demo;

import android.app.Activity;
import android.os.Bundle;

public class TextActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text);

		initialLayout();
	}

	private void initialLayout() {
		ImageLayout text001 = (ImageLayout) findViewById(R.id.text001);
		text001.init(R.drawable.text_001, "001",
				getResources().getColor(R.color.fancy_yellow));

	}

}
