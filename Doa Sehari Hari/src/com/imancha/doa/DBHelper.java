package com.imancha.doa;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

	public static final String DATABASE_NAME = "myDoa.db";

	public DBHelper(Context context) {
		super(context, DATABASE_NAME, null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE Bookmark (title text)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		db.execSQL("DROP TABLE IF EXISTS Bookmark");
		onCreate(db);
	}

	public Cursor getData(String title) {
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor res = db.rawQuery("select * from Bookmark where title=" + title + "",
				null);
		return res;
	}

	public boolean insertBookmark(String title) {
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues contentValues = new ContentValues();
		contentValues.put("title", title);		
		db.insert("Bookmark", null, contentValues);
		return true;
	}

	public int deleteBookmark(String title) {
		SQLiteDatabase db = this.getWritableDatabase();
		String[] args = {title};
		return(db.delete("Bookmark", "title = ?",args));
	}

	public ArrayList<String> getAllBookmark() {
		ArrayList<String> array_list = new ArrayList<String>();
		SQLiteDatabase db = this.getReadableDatabase();
		Cursor res = db.rawQuery("select * from Bookmark", null);
		res.moveToFirst();
		while (res.isAfterLast() == false) {
			array_list.add(res.getString(res.getColumnIndex("title")));
			res.moveToNext();
		}
		return array_list;
	}
}
