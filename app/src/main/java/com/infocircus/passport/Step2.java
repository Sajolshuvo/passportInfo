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

public class Step2 extends AppCompatActivity {
    private TextView p1;
    private Button im1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);

        p1 = findViewById(R.id.s1);
        p1.setText("অনলাইনে আবেদনের জন্য প্রথমে  www.passport.gov.bd  এই সাইটে যেতে হবে। এই সাইটে গিয়ে  \"I have read the above information and the relevant guidance notes.\" এ সিলেক্ট করে \"Continue to Online enrollment\" এ ক্লিক করুন। \n\nএবার নতুন একটি পেজ আসবে, এখানে আপনার সকল তথ্য দিয়ে ফরমটি পুরন করুন। স্টার মার্ক (*)করা সকল ঘর অবশ্য্যই পুরন করতে হবে। অনলাইনে ফরম কিভাবে পুরন করতে হবে নিচে তার একটি নমুনা দেওয় হল। \n\nআবেদন ফরমটি সমপুর্নভাবে পুরন করা হলে পুনরায় ভালভাবে চেক করে তথ্য মিলিয়ে নিন। সব তথ্য চেক করার পর সাবমিট করুন,সাবমিট করার পর একটা পিডিএফ ফাইল ডাউনলোড হবে। সেটা ডাউনলোড করে ২ কপি কালার প্রিন্ট করুন।");

        im1 = findViewById(R.id.im1);

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://dip.portal.gov.bd/sites/default/files/files/dip.portal.gov.bd/page/38bcf737_4bb4_45a3_9532_5ef21a0357a0/Passport_MRPOnline_Instruction_2013%20(1).PDF";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
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
