package com.example.basicgraphics;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	BView shapes;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		shapes = new BView(this);
		setContentView(shapes);

	}

	private class BView extends View {
		public BView(Context mcontext) {
			super(mcontext);

		}

		@Override
		protected void onDraw(Canvas canvas) {
			super.onDraw(canvas);

			Paint paint = new Paint();
			paint.setStyle(Paint.Style.FILL);

			paint.setColor(Color.RED);
			canvas.drawPaint(paint);

			paint.setAntiAlias(false);
			paint.setColor(Color.BLUE);
			canvas.drawCircle(25, 25, 20, paint);

			paint.setAntiAlias(true);
			paint.setColor(Color.BLACK);
			canvas.drawCircle(80, 50, 30, paint);

			paint.setAntiAlias(false);
			paint.setColor(Color.GRAY);
			canvas.drawRect(135, 75, 200, 200, paint);

			canvas.rotate(-40);

			canvas.restore();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}