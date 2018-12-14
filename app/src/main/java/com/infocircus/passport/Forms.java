package com.infocircus.passport;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Forms extends AppCompatActivity {
    private Button f1, f2, f3, f4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms);

        f1 = findViewById(R.id.f1);
        f2 = findViewById(R.id.f2);
        f3 = findViewById(R.id.f3);
        f4 = findViewById(R.id.f4);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://dip.portal.gov.bd/sites/default/files/files/dip.portal.gov.bd/forms/1814a4e6_495e_4dfa_b013_537f4cb297c0/Editable_MRP_Application_Form%5BHard%20Copy%5D_converted.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://dip.portal.gov.bd//sites/default/files/files/dip.portal.gov.bd/forms/e6754f3e_af35_4cb9_a653_05593c4da681/MRP-Reissue-Form-filled-UP.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://dip.portal.gov.bd//sites/default/files/files/dip.portal.gov.bd/forms/e6754f3e_af35_4cb9_a653_05593c4da681/RE-ISSUECorrection%20form%201st%20page-1.pdf";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://dip.portal.gov.bd/sites/default/files/files/dip.portal.gov.bd/forms/1814a4e6_495e_4dfa_b013_537f4cb297c0/MRP-Form-Filled.pdf";
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
