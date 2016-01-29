package com.zms.demo;

import android.app.Activity;
import android.os.Bundle;

public class ArrowActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arrow);

		initialLayout();
	}

	private void initialLayout() {

		ImageLayout arrow015 = (ImageLayout) findViewById(R.id.arrow015);
		arrow015.init(R.drawable.arrow_015, "015",
				getResources().getColor(R.color.fancy_yellow));

		ImageLayout arrow014 = (ImageLayout) findViewById(R.id.arrow014);
		arrow014.init(R.drawable.arrow_014, "014",
				getResources().getColor(R.color.fancy_white));

		ImageLayout arrow013 = (ImageLayout) findViewById(R.id.arrow013);
		arrow013.init(R.drawable.arrow_013, "013",
				getResources().getColor(R.color.fancy_white));

		ImageLayout arrow012 = (ImageLayout) findViewById(R.id.arrow012);
		arrow012.init(R.drawable.arrow_012, "012",
				getResources().getColor(R.color.fancy_blue));

		ImageLayout arrow011 = (ImageLayout) findViewById(R.id.arrow011);
		arrow011.init(R.drawable.arrow_011, "011",
				getResources().getColor(R.color.fancy_blue));

		ImageLayout arrow010 = (ImageLayout) findViewById(R.id.arrow010);
		arrow010.init(R.drawable.arrow_010, "010",
				getResources().getColor(R.color.fancy_white));

		ImageLayout arrow009 = (ImageLayout) findViewById(R.id.arrow009);
		arrow009.init(R.drawable.arrow_009, "009",
				getResources().getColor(R.color.fancy_yellow));

		ImageLayout arrow008 = (ImageLayout) findViewById(R.id.arrow008);
		arrow008.init(R.drawable.arrow_008, "008",
				getResources().getColor(R.color.fancy_blue));

		ImageLayout arrow007 = (ImageLayout) findViewById(R.id.arrow007);
		arrow007.init(R.drawable.arrow_007, "007",
				getResources().getColor(R.color.fancy_orange));

		ImageLayout arrow006 = (ImageLayout) findViewById(R.id.arrow006);
		arrow006.init(R.drawable.arrow_006, "006",
				getResources().getColor(R.color.fancy_yellow));

		ImageLayout arrow005 = (ImageLayout) findViewById(R.id.arrow005);
		arrow005.init(R.drawable.arrow_005, "005",
				getResources().getColor(R.color.fancy_teal));

		ImageLayout arrow004 = (ImageLayout) findViewById(R.id.arrow004);
		arrow004.init(R.drawable.arrow_004, "004",
				getResources().getColor(R.color.fancy_green));

		ImageLayout arrow003 = (ImageLayout) findViewById(R.id.arrow003);
		arrow003.init(R.drawable.arrow_003, "003",
				getResources().getColor(R.color.fancy_red));

		ImageLayout arrow002 = (ImageLayout) findViewById(R.id.arrow002);
		arrow002.init(R.drawable.arrow_002, "002",
				getResources().getColor(R.color.fancy_yellow));

		ImageLayout arrow001 = (ImageLayout) findViewById(R.id.arrow001);
		arrow001.init(R.drawable.arrow_001, "001",
				getResources().getColor(R.color.fancy_blue));

	}

}
