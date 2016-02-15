package com.zms.demo.ui;

import com.zms.demo.ImageLayout;
import com.zms.demo.R;

import android.app.Activity;
import android.os.Bundle;

public class BellActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bell);

		initialLayout();
	}

	private void initialLayout() {
		ImageLayout bell001 = (ImageLayout) findViewById(R.id.bell001);
		bell001.init(R.drawable.bell_001, "001",
				getResources().getColor(R.color.fancy_yellow));
	}

}
