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
				.getColor(R.color.fancy_yellow));

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
				.getColor(R.color.fancy_red));

		ImageLayout progress008 = (ImageLayout) findViewById(R.id.progress008);
		progress008.init(R.drawable.progress_008, "008", getResources()
				.getColor(R.color.fancy_green));

		ImageLayout progress009 = (ImageLayout) findViewById(R.id.progress009);
		progress009.init(R.drawable.progress_009, "009", getResources()
				.getColor(R.color.fancy_blue));

		ImageLayout progress010 = (ImageLayout) findViewById(R.id.progress010);
		progress010.init(R.drawable.progress_010, "010", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout progress011 = (ImageLayout) findViewById(R.id.progress011);
		progress011.init(R.drawable.progress_011, "011", getResources()
				.getColor(R.color.fancy_teal));

		ImageLayout progress012 = (ImageLayout) findViewById(R.id.progress012);
		progress012.init(R.drawable.progress_012, "012", getResources()
				.getColor(R.color.fancy_yellow));

		ImageLayout progress013 = (ImageLayout) findViewById(R.id.progress013);
		progress013.init(R.drawable.progress_013, "013", getResources()
				.getColor(R.color.fancy_orange));

		ImageLayout progress014 = (ImageLayout) findViewById(R.id.progress014);
		progress014.init(R.drawable.progress_014, "014", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout progress015 = (ImageLayout) findViewById(R.id.progress015);
		progress015.init(R.drawable.progress_015, "015", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout progress016 = (ImageLayout) findViewById(R.id.progress016);
		progress016.init(R.drawable.progress_016, "016", getResources()
				.getColor(R.color.fancy_blue));

		ImageLayout progress017 = (ImageLayout) findViewById(R.id.progress017);
		progress017.init(R.drawable.progress_017, "017", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout progress018 = (ImageLayout) findViewById(R.id.progress018);
		progress018.init(R.drawable.progress_018, "018", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout progress019 = (ImageLayout) findViewById(R.id.progress019);
		progress019.init(R.drawable.progress_019, "019", getResources()
				.getColor(R.color.fancy_yellow));

		ImageLayout progress020 = (ImageLayout) findViewById(R.id.progress020);
		progress020.init(R.drawable.progress_020, "020", getResources()
				.getColor(R.color.fancy_red));

		ImageLayout progress021 = (ImageLayout) findViewById(R.id.progress021);
		progress021.init(R.drawable.progress_021, "021", getResources()
				.getColor(R.color.fancy_teal));

		ImageLayout progress022 = (ImageLayout) findViewById(R.id.progress022);
		progress022.init(R.drawable.progress_022, "022", getResources()
				.getColor(R.color.fancy_yellow));

		ImageLayout progress023 = (ImageLayout) findViewById(R.id.progress023);
		progress023.init(R.drawable.progress_023, "023", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout progress024 = (ImageLayout) findViewById(R.id.progress024);
		progress024.init(R.drawable.progress_024, "024", getResources()
				.getColor(R.color.fancy_white));

		ImageLayout progress025 = (ImageLayout) findViewById(R.id.progress025);
		progress025.init(R.drawable.progress_025, "025", getResources()
				.getColor(R.color.fancy_white));

	}

}
