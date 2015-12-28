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
				.getColor(R.color.fancy_green));

		ImageLayout spectrum003 = (ImageLayout) findViewById(R.id.spectrum003);
		spectrum003.init(R.drawable.spectrum_003, "003", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout spectrum004 = (ImageLayout) findViewById(R.id.spectrum004);
		spectrum004.init(R.drawable.spectrum_004, "004", getResources()
				.getColor(R.color.fancy_yellow));

		ImageLayout spectrum005 = (ImageLayout) findViewById(R.id.spectrum005);
		spectrum005.init(R.drawable.spectrum_005, "005", getResources()
				.getColor(R.color.fancy_teal));

		ImageLayout spectrum006 = (ImageLayout) findViewById(R.id.spectrum006);
		spectrum006.init(R.drawable.spectrum_006, "006", getResources()
				.getColor(R.color.fancy_orange));

		ImageLayout spectrum007 = (ImageLayout) findViewById(R.id.spectrum007);
		spectrum007.init(R.drawable.spectrum_007, "007", getResources()
				.getColor(R.color.fancy_yellow));

		ImageLayout spectrum008 = (ImageLayout) findViewById(R.id.spectrum008);
		spectrum008.init(R.drawable.spectrum_008, "008", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout spectrum009 = (ImageLayout) findViewById(R.id.spectrum009);
		spectrum009.init(R.drawable.spectrum_009, "009", getResources()
				.getColor(R.color.fancy_blue));

		ImageLayout spectrum010 = (ImageLayout) findViewById(R.id.spectrum010);
		spectrum010.init(R.drawable.spectrum_010, "010", getResources()
				.getColor(R.color.fancy_green));

		ImageLayout spectrum011 = (ImageLayout) findViewById(R.id.spectrum011);
		spectrum011.init(R.drawable.spectrum_011, "011", getResources()
				.getColor(R.color.fancy_white));
		
		ImageLayout spectrum012 = (ImageLayout) findViewById(R.id.spectrum012);
		spectrum012.init(R.drawable.spectrum_012, "011", getResources()
				.getColor(R.color.fancy_blue));
		
	}

}
