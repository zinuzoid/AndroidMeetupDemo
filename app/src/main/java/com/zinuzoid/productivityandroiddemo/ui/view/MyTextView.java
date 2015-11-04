package com.zinuzoid.productivityandroiddemo.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

import com.zinuzoid.productivityandroiddemo.R;

/**
 * MyTextView
 * on 11/3/2015 AD
 *
 * @author Jetsada Machom <jim@imjim.im>
 */
public class MyTextView extends TextView {

	public MyTextView(Context context) {
		super(context);
		init(context, null)
	}

	public MyTextView(Context context, AttributeSet attrs) {
		super(context, attrs, R.attr.myTextViewStyle);
		init(context, attrs);
	}

	public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init(context, attrs);
	}

	private void init(Context context, AttributeSet attrs) {
		TypedArray typedArray = context.obtainStyledAttributes(attrs,
				R.styleable.MyTextView);
		int appearanceIndex = typedArray.getInt(R.styleable.MyTextView_appearance, -1);
		boolean underline = typedArray.getBoolean(R.styleable.MyTextView_underline, false);
		boolean strikeThrough = typedArray.getBoolean(R.styleable.MyTextView_strikethrough, false);
		boolean flashing = typedArray.getBoolean(R.styleable.MyTextView_flashing, false);
		typedArray.recycle();

		switch(appearanceIndex) {
			case 2:
				setBackgroundColor(Color.RED);
				break;
			case 3:
				setBackgroundColor(Color.BLUE);
				break;
			case 4:
				setBackgroundColor(Color.GREEN);
				break;
		}

		if(underline) {
			setPaintFlags(getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		}

		if(strikeThrough) {
			setPaintFlags(getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
		}

		if(flashing) {
			startFlashing();
		}

	}

	private void startFlashing() {
		AlphaAnimation anim = new AlphaAnimation(0.2f, 1.0f);
		anim.setDuration(250);
		anim.setRepeatMode(Animation.REVERSE);
		anim.setRepeatCount(Animation.INFINITE);
		startAnimation(anim);
	}

}
