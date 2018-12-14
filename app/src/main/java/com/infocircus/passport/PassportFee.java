package com.infocircus.passport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class PassportFee extends AppCompatActivity {
    private TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_passport_fee);

        t1 = findViewById(R.id.t1);

        t2 = findViewById(R.id.t2);

        t1.setText("**  অবসরপ্রাপ্ত সরকারি চাকুরীজীবি ও তাদের স্বামী/স্ত্রী (নতুন আবেদন ও রি-ইস্যু উভয় ক্ষেত্রে) সাধারণ ফি প্রদান করে জরুরি সুবিধা পাবেন। এক্ষেত্রে অবসর গ্রহণের সনদ দাখিল করতে হবে।");

        t2.setText("** সোনালী ব্যাংকের পাশাপাশি আরও ৫টি ব্যাংকে টাকা জমা দিতে পারবেন।\n" +
                "\n" +
                "১) ওয়ান ব্যাংক\n" +
                "২) ট্রাস্ট ব্যাংক\n" +
                "৩) ব্যাংক এশিয়া\n" +
                "৪) প্রিমিয়ার ব্যাংক\n" +
                "৫) ঢাকা ব্যাংক।");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
