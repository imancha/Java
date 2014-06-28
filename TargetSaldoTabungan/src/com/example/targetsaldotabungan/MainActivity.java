package com.example.targetsaldotabungan;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText eSaldoAwal = (EditText) findViewById(R.id.editText1);
		final EditText eBunga = (EditText) findViewById(R.id.editText2);
		final EditText eSaldoTarget = (EditText) findViewById(R.id.editText3);
		
		final TextView tHasil = (TextView) findViewById(R.id.textView4);
		
		Button hitung = (Button) findViewById(R.id.button1);
		
		hitung.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				double saldoAwal = Double.parseDouble(eSaldoAwal.getText().toString());
				double bunga = Double.parseDouble(eBunga.getText().toString());
				double saldoTarget = Double.parseDouble(eSaldoTarget.getText().toString());
				byte bulan = 0;
				String hasil = new String("");
				
				while(saldoAwal <= saldoTarget){
					hasil += String.format("Saldo bulan ke-%d : Rp. %,.0f\n", (++bulan),(saldoAwal += saldoAwal * bunga / 100));
				}
				
				tHasil.setText(hasil);
			}
			
		});
	}
}
