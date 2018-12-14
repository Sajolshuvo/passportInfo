package com.infocircus.passport;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import java.util.Arrays;

public class DivisionalOfiiceList extends AppCompatActivity {
    private TextView jurisdiction, mobile, email, portal, fb, div;

    private AutoCompleteTextView textView;
    private String[] officeName = {"Dhaka", "Chittagong", "Rajshahi", "Sylhet", "Rangpur", "Khulna", "Barisal"};

    private String mobles[] = {"01733393323", "01733393349", "01733393380", "01733393361", "01733393389", "01733393364", "01733393374"};
    private String emails[] = {"rpoagargaon@pass.gov.bd", "rpomansurabad@pass.gov.bd", "rporajshahi@pass.gov.bd", "rposylhet@pass.gov.bd", "rporangpur@pass.gov.bd", "rpokhulna@pass.gov.bd", "rpobarisal@pass.gov.bd"};
    private String fbs[] = {"https://www.facebook.com/Passportoffice-Agargaon-764096140306879", "https://www.facebook.com/profile.php?id=100010504654079", "https://www.facebook.com/passportoffice.rajshahi", "https://www.facebook.com/profile.php?id=100009062442361", "https://www.facebook.com/profile.php?id=100007862806131", "https://www.facebook.com/Passportoffice-khulna-1583998481814857", "https://www.facebook.com/Passportoffice-Barisal-1627784010766709"};
    private String portals[] = {" ", "http://pass.chittagong.gov.bd", "http://pass.rajshahi.gov.bd", "http://pass.sylhet.gov.bd", "http://pass.rangpur.gov.bd", "http://pass.khulna.gov.bd", "http://pass.barisal.gov.bd"};
    private String jurisdictons[] = {"Motijheel, Paltan, Mirpur, Shah Ali, Pallabi, Kafrul, Tejgaon, Mohammadpur, Adabar,  Gulshan,  Ramna, Shahbagh, Newmarket, Dhanmondi, Hajaribagh, Dhamrai, Savar.", "Kotwali, Pahartali, Chandgaon, Panchlaish, Bandar, Double Mooring, Karnaphuli, Khulshi, Halishahar, Bayjid Bostami, Bakalia, Patenga, Mirsharai, Hathazari, Sitakunda and Raozan thana under Chittagong district.", "Rajshahi District", "Sylhet District", "Rangpur District", "Khulna District", "Barisal District"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_divisional_ofiice_list);


        mobile = findViewById(R.id.mobile);
        div = findViewById(R.id.div);
        jurisdiction = findViewById(R.id.jurisdiction);
        fb = findViewById(R.id.fb);
        email = findViewById(R.id.emails);
        portal = findViewById(R.id.portal);

        div.setText("Division");


        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_dropdown_item_1line, officeName);

        textView = findViewById(R.id.textview);
        textView.setHint("Select Division");
        textView.setAdapter(arrayAdapter);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View arg0) {
                textView.showDropDown();
            }
        });
        textView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selected = (String) parent.getItemAtPosition(position);
                int pos = Arrays.asList(officeName).indexOf(selected);

                mobile.setText("+88" + mobles[pos]);
                jurisdiction.setText(jurisdictons[pos]);
                email.setText(emails[pos]);
                fb.setText(fbs[pos]);
                portal.setText(portals[pos]);


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
