package com.imancha.doa;

import java.io.IOException;
import java.io.InputStream;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;
import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;

public final class ViewDoa extends Activity {
	static String Title;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_doa);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		super.setTitle(Title);

		final ImageView IV = (ImageView) findViewById(R.id.imageView1);

		AssetManager assetManager = getAssets();

		try {
			InputStream input = assetManager.open(Title + ".png");
			IV.setImageDrawable(Drawable.createFromStream(input, null));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case android.R.id.home:
				finish();
				break;
			case R.id.bookmark:
				DBHelper mydb = new DBHelper(this);
				mydb.insertBookmark(Title);
				Toast.makeText(this, "Added to Bookmark", Toast.LENGTH_SHORT)
						.show();
/*				Intent intent = new Intent(this, MainActivity.class);
				startActivity(intent);
*/				break;
		}

		return true;
	}
}
