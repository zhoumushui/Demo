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
		progress001.init(R.drawable.progress_001, "001", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout progress002 = (ImageLayout) findViewById(R.id.progress002);
		progress002.init(R.drawable.progress_002, "002", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout progress003 = (ImageLayout) findViewById(R.id.progress003);
		progress003.init(R.drawable.progress_003, "003", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout progress004 = (ImageLayout) findViewById(R.id.progress004);
		progress004.init(R.drawable.progress_004, "004", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout progress005 = (ImageLayout) findViewById(R.id.progress005);
		progress005.init(R.drawable.progress_005, "005", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout progress006 = (ImageLayout) findViewById(R.id.progress006);
		progress006.init(R.drawable.progress_006, "006", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout progress007 = (ImageLayout) findViewById(R.id.progress007);
		progress007.init(R.drawable.progress_007, "007", getResources()
				.getColor(R.color.fancy_blue));

		ImageLayout progress008 = (ImageLayout) findViewById(R.id.progress008);
		progress008.init(R.drawable.progress_008, "008", getResources()
				.getColor(R.color.fancy_green));

		ImageLayout progress009 = (ImageLayout) findViewById(R.id.progress009);
		progress009.init(R.drawable.progress_009, "009", getResources()
				.getColor(R.color.fancy_blue));

		ImageLayout progress010 = (ImageLayout) findViewById(R.id.progress010);
		progress010.init(R.drawable.progress_010, "010", getResources()
				.getColor(R.color.fancy_white));
	}

}
