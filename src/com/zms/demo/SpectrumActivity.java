package com.zms.demo;

import android.app.Activity;
import android.os.Bundle;

public class SpectrumActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spectrum);

		initialLayout();
	}

	private void initialLayout() {
		ImageLayout spectrum001 = (ImageLayout) findViewById(R.id.spectrum001);
		spectrum001.init(R.drawable.spectrum_001, "001", getResources()
				.getColor(R.color.fancy_blue));

		ImageLayout spectrum002 = (ImageLayout) findViewById(R.id.spectrum002);
		spectrum002.init(R.drawable.spectrum_002, "002", getResources()
				.getColor(R.color.fancy_blue));

		ImageLayout spectrum003 = (ImageLayout) findViewById(R.id.spectrum003);
		spectrum003.init(R.drawable.spectrum_003, "003", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout spectrum004 = (ImageLayout) findViewById(R.id.spectrum004);
		spectrum004.init(R.drawable.spectrum_004, "004", getResources()
				.getColor(R.color.fancy_blue));
	}

}
