package com.zms.demo.ui;

import com.zms.demo.ImageLayout;
import com.zms.demo.R;

import android.app.Activity;
import android.os.Bundle;

public class FigureActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_figure);

		initialLayout();
	}

	private void initialLayout() {
		ImageLayout figure005 = (ImageLayout) findViewById(R.id.figure005);
		figure005.init(R.drawable.figure_005, "005",
				getResources().getColor(R.color.fancy_yellow));

		ImageLayout figure004 = (ImageLayout) findViewById(R.id.figure004);
		figure004.init(R.drawable.figure_004, "004",
				getResources().getColor(R.color.fancy_red));

		ImageLayout figure003 = (ImageLayout) findViewById(R.id.figure003);
		figure003.init(R.drawable.figure_003, "003",
				getResources().getColor(R.color.fancy_orange));

		ImageLayout figure002 = (ImageLayout) findViewById(R.id.figure002);
		figure002.init(R.drawable.figure_002, "002",
				getResources().getColor(R.color.fancy_white));

		ImageLayout figure001 = (ImageLayout) findViewById(R.id.figure001);
		figure001.init(R.drawable.figure_001, "001",
				getResources().getColor(R.color.fancy_white));

	}

}
