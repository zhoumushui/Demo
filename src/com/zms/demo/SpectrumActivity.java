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
		spectrum001.init(R.drawable.spectrum_001, "001", "#1E88E5");

		ImageLayout spectrum002 = (ImageLayout) findViewById(R.id.spectrum002);
		spectrum002.init(R.drawable.spectrum_002, "002", "#1E88E5");
	}

}
