package com.infocircus.passport;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class Step3 extends AppCompatActivity {
    private TextView p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step3);

        p1 = findViewById(R.id.pa1);
        p1.setText("পাসপোর্ট আবেদনের ২ কপি কালার প্রিন্ট করতে হবে। ২ টি আবেদন কপির প্রথম পৃষ্ঠায় নিজের নাম বাংলায় লিখতে হবে এবং তিন নম্বর পৃষ্ঠায় সাক্ষর করতে হবে।\n\n ২ টি আবেদন কপির উপরে পাসপোর্ট সাইজ ছবি আঠা দিয়ে লাগাতে হবে। এখন ছবির উপরে সত্যায়িত করতে এবং খেয়াল রাখতে হবে যাতে সত্যায়ন সিল বা সাক্ষর ছবির উপর ও ফরমের গায়ে থাকে।\n\nএবার উভয় ফরমের চতুর্থ পৃষ্ঠায় \"প্রত্যয়ন\" অংশে সত্যায়িত করতে হবে এবং সত্যায়নকারীর তথ্য দিতে হবে।\n\nএই দুই কপি আবেদনপত্র সত্যায়িত করার পর তার সাথে জন্মনিবন্ধন বা জাতীয় পরিচয়পত্রের দুইটি ফটোকপি সত্যায়িত করতে হবে। এবং আপনার পেশার সনদ দুই্টি ফটোকপি সত্যায়িত করতে হবে। \n\n আপনি জন্মনিবন্ধন দিয়ে পাসপোর্ট করলে কিংবা আপনার ঠিকানায় কোন ভুল থাকলে চেয়ারম্যান/কমিশনার সার্টিফিকেট এর সত্যায়িত দুই কপি লাগতে পারে।\n\n এবার আবেদন ফরমের সাথে কি কি কাগজ সংযুক্ত করেছেন তা আবেদন ফরমের তিন নাম্বার পৃষ্ঠায় টিক দিয়ে দিন। এবং যেকোন একটি ফরমের উপরে ডান্ দিকে ব্যাংকের রিসিট টি আঠা দিয়ে লাগিয়ে দিন। এবার এই দুই সেট কাগজ নিয়ে আপনার এলাকার পাসপোর্ট অফিসে গিয়ে জমা দিন। ");
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
