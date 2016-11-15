package com.frs.mojapierwszaaplikacja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String WIADOMOSC = "com.frs.mojapierwszaaplikacja.WIADOMOSC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wyslijWiadomosc(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.wiadomosc);
        String message = editText.getText().toString();
        intent.putExtra(WIADOMOSC, message);
        startActivity(intent);
    }
}
