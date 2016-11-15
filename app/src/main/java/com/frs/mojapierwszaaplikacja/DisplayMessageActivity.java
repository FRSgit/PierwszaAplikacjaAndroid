package com.frs.mojapierwszaaplikacja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String wiadomosc = intent.getStringExtra(MainActivity.WIADOMOSC);
        TextView rezultat = (TextView) findViewById(R.id.rezultat);
        rezultat.setText(wiadomosc);
    }
}
