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
		ImageLayout progress001 = (ImageLayout) findViewById(R.id.progress001);
		progress001.init(R.drawable.progress_001, "001", "#FFFFFF");

		ImageLayout progress002 = (ImageLayout) findViewById(R.id.progress002);
		progress002.init(R.drawable.progress_002, "002", "#FFFFFF");
	}

}
