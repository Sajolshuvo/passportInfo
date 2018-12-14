package com.infocircus.passport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class NewPassport extends AppCompatActivity {

    private String[] itemNum = {"০", "১", "২", "৩", "৪"};
    private String[] itemName = {"যা যা প্রয়োজন", "ব্যাংকে টাকা জমা", "অনলাইনে আবেদন", "আবেদনপত্র জমাদান", "যারা সত্যায়িত করতে পারবেন"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_new_passport);


        ListView listView = findViewById(R.id.list);

        // Create a new_pass adapter that takes the list of earthquakes as input
        final ItemAdapter itemAdapter = new ItemAdapter(itemName, itemNum, this);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        listView.setAdapter(itemAdapter);

        // Set an item click listener on the ListView, which sends an intent to a web browser
        // to open a website with more information about the selected earthquake.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Find the current earthquake that was clicked on

                Intent i;
                switch (position) {

                    case 0:
                        i = new Intent(NewPassport.this, Step0.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(NewPassport.this, Step1.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(NewPassport.this, Step2.class);
                        startActivity(i);
                        break;
                    case 3:
                        i = new Intent(NewPassport.this, Step3.class);
                        startActivity(i);
                        break;
                    case 4:
                        i = new Intent(NewPassport.this, Step4.class);
                        startActivity(i);
                        break;


                }

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
