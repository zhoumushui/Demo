package com.zms.demo;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ImageLayout extends RelativeLayout {

	private RelativeLayout relativeLayout;
	private ImageView imageView;
	private TextView textView;
	private boolean isPlaying = false;

	public ImageLayout(Context context) {
		super(context);
		initView(context);
	}

	public ImageLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView(context);
	}

	public ImageLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initView(context);
	}

	private void initView(Context context) {
		if (relativeLayout == null) {
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			relativeLayout = (RelativeLayout) inflater.inflate(
					R.layout.view_imagelayout, this);
		}
		imageView = (ImageView) relativeLayout.findViewById(R.id.imageView);
		textView = (TextView) relativeLayout.findViewById(R.id.textView);
	}

	public void init(int drawableId, String text, int bgColor) {
		imageView.setImageDrawable(getResources().getDrawable(drawableId));
		((Animatable) imageView.getDrawable()).start();
		isPlaying = true;
		textView.setText(text);
		relativeLayout.setBackgroundColor(bgColor);
		relativeLayout.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				if (!isPlaying) {
					((Animatable) imageView.getDrawable()).start();
					isPlaying = true;
				} else {
					((Animatable) imageView.getDrawable()).stop();
					isPlaying = false;
				}
			}
		});
	}

}
