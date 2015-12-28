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

		ImageLayout progress003 = (ImageLayout) findViewById(R.id.progress003);
		progress003.init(R.drawable.progress_003, "003", "#FFFFFF");

		ImageLayout progress004 = (ImageLayout) findViewById(R.id.progress004);
		progress004.init(R.drawable.progress_004, "004", "#FFFFFF");

		ImageLayout progress005 = (ImageLayout) findViewById(R.id.progress005);
		progress005.init(R.drawable.progress_005, "005", "#FFFFFF");

		ImageLayout progress006 = (ImageLayout) findViewById(R.id.progress006);
		progress006.init(R.drawable.progress_006, "006", "#FFFFFF");

		ImageLayout progress007 = (ImageLayout) findViewById(R.id.progress007);
		progress007.init(R.drawable.progress_007, "007", "#1E88E5");

		ImageLayout progress008 = (ImageLayout) findViewById(R.id.progress008);
		progress008.init(R.drawable.progress_008, "008", "#1E88E5");

		ImageLayout progress009 = (ImageLayout) findViewById(R.id.progress009);
		progress009.init(R.drawable.progress_009, "009", "#1E88E5");
	}

}
