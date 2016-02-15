package com.zms.demo.ui;

import com.zms.demo.ImageLayout;
import com.zms.demo.R;

import android.app.Activity;
import android.os.Bundle;

public class RibbonActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ribbon);

		initialLayout();
	}

	private void initialLayout() {
		ImageLayout ribbon001 = (ImageLayout) findViewById(R.id.ribbon001);
		ribbon001.init(R.drawable.ribbon_001, "001",
				getResources().getColor(R.color.fancy_white));
	}
}
