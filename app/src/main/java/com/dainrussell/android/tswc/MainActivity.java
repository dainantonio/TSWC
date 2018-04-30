package com.dainrussell.android.tswc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView link= (TextView) findViewById(R.id.weblink);
        link.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
