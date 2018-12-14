package com.infocircus.passport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Step1 extends AppCompatActivity {

    private TextView b1;
    private Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step1);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);

        b1.setText("ব্যাংকে টাকা জমা দেওয়া ঃ\n\n\n১। অনলাইনে পাসপোর্ট ফরম পুরন করার পূর্বে ব্যাংকে টাকা জমা দিতে হবে।কারন অনলাইনে ফরম পূরন করার সময় ব্যাংকের নাম, ব্যাংকের শাখা,টাকা জমার রিসিট নম্বর ও জমা দেওয়ার তারিখ লাগবে।\n\n২। টাকা জমার রিসিট ১ টি ফটোকপি করে রাখুন।\n\n৩। টাকা জমার রিসিট যত্ন সহকারে রেখে দিন। পুরনকৃত ফরমের উপর এটা আঠা দিয়ে লাগিয়ে জমা দিতে হবে।");

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Step1.this, PassportFee.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
