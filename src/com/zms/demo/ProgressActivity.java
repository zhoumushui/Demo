package com.zms.demo;

import android.app.Activity;
import android.os.Bundle;

public class ProgressActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progress);

		initialLayout();
	}

	private void initialLayout() {
		ImageLayout layout001 = (ImageLayout) findViewById(R.id.layout001);
		layout001.init(R.drawable.progress_001, "001");
	}

}
