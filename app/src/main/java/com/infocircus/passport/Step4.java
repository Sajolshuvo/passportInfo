package com.infocircus.passport;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class Step4 extends AppCompatActivity {
    private TextView p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step4);

        p1 = findViewById(R.id.sot1);
        p1.setText("যে সকল ব্যক্তিগণ পাসপোর্টের আবেদনপত্র ও ছবি প্রত্যায়ন ও সত্যায়ন করতে পারবেন – \n\n\n১। সংসদ সদস্য \n\n২। সিটি কর্পোরেশনের মেয়র\n\n৩। ডেপুটি মেয়র ও কাউন্সিলরগণ \n\n৪। গেজেটেড কর্মকর্তা\n\n৫। পাবলিক বিশ্ববিদ্যালয়ের শিক্ষক \n\n৬। উপজেলা পরিষদের চেয়ারম্যান ও ভাইস চেয়ারম্যান\n\n৭। পৌরসভার মেয়র ও পৌর কাউন্সিলরগণ\n\n৮। বেসরকারি বিশ্ববিদ্যালয়ের অধ্যাপক\n\n৯। বেসরকারি কলেজের অধ্যক্ষ, বেসরকারি উচ্চ বিদ্যালয়ের প্রধান শিক্ষক\n\n১০। জাতীয় দৈনিক পত্রিকার সম্পাদক\n\n১১। নোটারী পাবলিক ও আধাসরকারি/স্বায়ত্তশাসিত/রাষ্ট্রায়ত্ত সংস্থার জাতীয় বেতন স্কেলের ৭ম ও তদুর্ধ্ব গ্রেডের গ্রেডের কর্মকর্তাগণ।");
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