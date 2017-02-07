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
		
		private class BView extends View {
			public BView(Context mcontext) {
				super(mcontext);
			}
	}
	
	
	
	
	
}