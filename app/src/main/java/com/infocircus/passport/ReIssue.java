package com.infocircus.passport;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReIssue extends AppCompatActivity {
    private TextView d1, d3;
    private Button d2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_issue);
        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);


        d1.setText("পাসপোর্ট নবায়ন এর জন্য এই ফরমটি পূরণ করে বর্তমান পাসপোর্ট এর ফটোকপি ও ব্যাংকে টাকা জমার রশিদ সংযুক্ত করতে হবে এবং মূল পাসপোর্টটি অবশ্যই সঙ্গে নিয়ে আসতে হবে।\n" +
                "\n" +
                "তথ্য পরিবর্তন/সংশোধনের ক্ষেত্রে সংশ্লিষ্ট প্রমানপত্র সংযুক্ত করতে হবে। \n" +
                "\n" +
                "ক) সরকারি, আধাসরকারী, স্বায়ত্তশাষিত ও রাষ্ট্রায়ত্ত সংস্থার স্থায়ী কর্মকর্তা/ কর্মচারী ও সরকারি চাকুরীজীবির স্বামী/স্ত্রী, এবং সরকারি চাকুরীজীবির নির্ভরশীল ১৫ (পনের) বৎসরের কম বয়সী সন্তান  সাধারণ ফি জমা করে জরুরি সুবিধা পাবেন। এক্ষেত্রে নিজ নিজ প্রতিষ্ঠান থেকে অনাপত্তি সনদ (NOC) ওয়েব সাইটে আপলোড পূর্বক দাখিল করতে হবে।\n" +
                "\n" +
                "খ) অবসরপ্রাপ্ত সরকারি চাকুরীজীবি ও তাদের স্বামী/স্ত্রী সাধারণ ফি জমা করে জরুরি সুবিধা পাবেন। এক্ষেত্রে অবসরের সনদ জমা দিতে হবে।\n" +
                "\n" +
                "গ) বিদ্যমান মেশিন রিডেবল পাসপোর্টের তথ্য পরিবর্তনের ক্ষেত্রে রি-ইস্যুর আবেদনের জন্য নিন্মরূপ কাগজপত্র প্রয়োজন।");


        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "http://dip.portal.gov.bd/sites/default/files/files/dip.portal.gov.bd/forms/e6754f3e_af35_4cb9_a653_05593c4da681/RE-ISSUECorrection%20form%201st%20page-1.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        d3.setText("** বিঃ দ্রঃ- রি-ইস্যুর আবেদনপত্র জমা এবং ইস্যুকৃত পাসপোর্ট গ্রহণের সময় পুরাতন পাসপোর্ট অবশ্যই সাথে আনতে হবে।");
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
