package com.webbed.rankit.newbie.Intents;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.webbed.rankit.newbie.R;

/**
 * Created by R Ankit on 2/5/2015.
 */
public class Cybonito extends ActionBarActivity{

    private Toolbar toolbar;
    private TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cybonito);

        toolbar= (Toolbar) findViewById(R.id.my_toolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("About Cybonito");


        content=(TextView)findViewById(R.id.cybonito);
        Typeface tfSlab = Typeface.createFromAsset(getAssets(),
                "fonts/RobotoSlab-Regular.ttf");

        content.setTypeface(tfSlab);
    }
}
