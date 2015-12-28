package com.zms.demo;

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
		ImageLayout figure001 = (ImageLayout) findViewById(R.id.figure001);
		figure001.init(R.drawable.figure_001, "001",
				getResources().getColor(R.color.fancy_white));
	}

}
