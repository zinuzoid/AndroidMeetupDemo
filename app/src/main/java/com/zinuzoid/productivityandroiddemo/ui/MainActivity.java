package com.zinuzoid.productivityandroiddemo.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.zinuzoid.productivityandroiddemo.R;

public class MainActivity extends AppCompatActivity {

	int a;
	int b;
	int c;
	int d;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.make(view, "Lorem", Snackbar.LENGTH_LONG).show();

				a++;
				Toast.makeText(MainActivity.this, "Toast " + String.valueOf(a), Toast.LENGTH_SHORT).show();
			}
		});
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();

		if(id == R.id.action_settings) {
			a++;
			Toast.makeText(MainActivity.this, "Toast " + String.valueOf(a), Toast.LENGTH_SHORT).show();
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

}
