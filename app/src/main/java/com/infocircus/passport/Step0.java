package com.infocircus.passport;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class Step0 extends AppCompatActivity {

    private TextView p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step0);

        p1 = findViewById(R.id.p1);
        p1.setText("**আবেদন করার জন্য প্রয়োজনীয় নথীপত্র ঃ\n\n\n১। পুরনকৃত ডি.আই.পি. ফরম-১ এর ০২(দুই কপি)। ৪র্থ পাতায় প্রত্যায়নকারী কর্তৃক সত্যায়ন করতে হবে।\n\n২। সদ্য তোলা পাসপোর্ট সাইজের ০২ কপি ছবি পুরনকৃত ফরমে আঠা দিয়ে লাগিয়ে সত্যায়িত করতে হবে।\n\n৩। জাতীয় পরিচয়পত্র/জন্ম নিবন্ধন সনদ পত্রের সত্যায়িত ০২ কপি।\n\n৪। ডাক্তার,ইঞ্জিনিয়ার,গাড়িচালক এবং অন্যান্য কারিগরী পেশাসমুহের ক্ষেত্রে পেশাগত সনদ পত্রের সত্যায়িত কপি।\n\n৫। অপ্রাপ্তবয়স্ক(১৫ বছরের কম) আবেদনকারীর ক্ষেত্রে পাসপোর্ট সাইজের ০২ কপি ছবি এবং আবেদনকারীর পিতা ও মাতার ০২ কপি রঙ্গিন ছবি আঠা দিয়ে লাগানোর পর সত্যায়িত করতে হবে।\n\n৬। অফিসিয়াল পাসপোর্টের ক্ষেত্রে সরকারী আদেশ(জিও) দাখিল করতে হবে।\n\n৭। অবসর প্রাপ্তদের ক্ষেত্রে পেনশনবুকের ফটোকপি প্রদান সাপেক্ষে সাধারন ফি তে জরুরী সেবা প্রদান করা হবে। \n\n৮। আপনার সকল সত্যায়িত কাগজের মুলকপি সাথে নিয়ে যাবেন তারা দেখতে চাইতে পারে।"
        );
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
