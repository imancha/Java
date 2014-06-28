package com.example.gajipegawai;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText eNama = (EditText) findViewById(R.id.editText1);
		final EditText eAnak = (EditText) findViewById(R.id.editText2);
		final EditText eGaji = (EditText) findViewById(R.id.editText3);
		final TextView tNama = (TextView) findViewById(R.id.textView3);
		final TextView tAnak = (TextView) findViewById(R.id.textView4);
		final TextView tGajiPokok = (TextView) findViewById(R.id.textView5);
		final TextView tTunjKeluarga = (TextView) findViewById(R.id.textView6);
		final TextView tTunjAnak = (TextView) findViewById(R.id.textView8);
		final TextView tGajiKotor = (TextView) findViewById(R.id.textView9);
		final TextView tPajak = (TextView) findViewById(R.id.textView10);
		final TextView tGajiBersih = (TextView) findViewById(R.id.textView11);
		Button submit = (Button) findViewById(R.id.button1);
		
		submit.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				String nama = eNama.getText().toString();
				byte anak = Byte.parseByte(eAnak.getText().toString());
				double gajiPokok = Double.parseDouble(eGaji.getText().toString());
				double tunjKeluarga = 0.2 * gajiPokok;
				double tunjAnak = 0.05 * gajiPokok * anak;
				double gajiKotor = gajiPokok + tunjKeluarga + tunjAnak;
				double pajak = 0.15 * gajiKotor;
				double gajiBersih = gajiKotor - pajak;
				
				Resources res = getResources();
				
				String hNama = String.format(res.getString(R.string.hasil_nama), nama);
				String hAnak = String.format(res.getString(R.string.hasil_anak), anak);
				String hgajiPokok = String.format(res.getString(R.string.hasil_gajiPokok), gajiPokok);
				String htunjKeluarga = String.format(res.getString(R.string.hasil_tunjKeluarga), tunjKeluarga);
				String htunjAnak = String.format(res.getString(R.string.hasil_tunjAnak), tunjAnak);
				String hgajiKotor = String.format(res.getString(R.string.hasil_gajiKotor), gajiKotor);
				String hpajak = String.format(res.getString(R.string.hasil_pajak), pajak);
				String hgajiBersih = String.format(res.getString(R.string.hasil_gajiBersih), gajiBersih);
				
				tNama.setText(hNama);
				tAnak.setText(hAnak);
				tGajiPokok.setText(hgajiPokok);
				tTunjKeluarga.setText(htunjKeluarga);
				tTunjAnak.setText(htunjAnak);
				tGajiKotor.setText(hgajiKotor);
				tPajak.setText(hpajak);
				tGajiBersih.setText(hgajiBersih);
				
				tNama.setVisibility(0);
				tAnak.setVisibility(0);
				tGajiPokok.setVisibility(0);
				tTunjKeluarga.setVisibility(0);
				tTunjAnak.setVisibility(0);
				tGajiKotor.setVisibility(0);
				tPajak.setVisibility(0);
				tGajiBersih.setVisibility(0);
        	}
		});
	}
}
