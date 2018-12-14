package com.infocircus.passport;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;

public class Ambassy extends AppCompatActivity {
    String countryNames[] = {"UK", "USA", "Saudi Arabia", "Malaysia", "UAE", "India", "India", "UAE", "Australia", "Thailand", "Saudi Arabia", "Kuwait", "Singapore", "France", "Oman", "China", "China", "USA", "Bahrain", "Qatar", "Nepal", "South Africa", "Canada", "USA", "UK", "UK", "Turkey", "Greece", "Netherlands", "Sweden", "Egypt", "Kenya", "Jordan", "Belgium", "Vietnam", "Myanmar", "Morocco", "Bhutan", "Brunei", "Sri-Lanka", "Iran", "India", "Italy", "Iraq", "Italy", "Germany", "Pakistan", "Spain", "Philippines", "Russian Federation", "Japan", "Libya", "Switzerland", "Pakistan", "Indonesia", "Mexico", "Maldives", "South Korea", "Uzbekistan", "Portugal", "Mauritius", "Brazil", "India", "Turkey", "Myanmar"};


    String embassyNames[] = {"London", "New York", "Riyadh", "Kuala Lumpur", "Dubai", "Calcutta", "New Delhi", "Abu Dhabi", "Canberra", "Bangkok", "Jeddah", "Kuwait", "Singapore", "Paris", "Muscat", "Hong Kong", "Beijing", "Washington", "Manama", "Doha", "Katmandu", "Pretoria", "Ottawa", "Los Angeles", "Birmingham", "Manchester", "Ankara", "Athens", "The Hague", "Stockholm", "Cairo", "Nairob", "Amman", "Brussels", "Hanoi", "Yangon", "Rabat", "Thimphu", "Brunei", "Colombo", "Tehran", "Agartala", "Rome", "Baghdad", "Milan", "Berlin", "Karachi", "Madrid", "Manila", "Moscow", "Tokyo", "Tripoli", "Geneva", "Islamabad", "Jakarta", "Mexico", "Male", "Seoul", "Tashkent", "Lisbon", "Port Louis", "Brasilia", "Mumbai", "Istanbul", "Sittwe"};

    TableLayout tl;

    TableRow tr;

    TextView serial, embassyName, country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_ambassy);

        tl = findViewById(R.id.table);


        addHeaders();

        addData();

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

    /**
     * This function add the headers to the table
     **/

    public void addHeaders() {

        /** Create a TableRow dynamically **/

        tr = new TableRow(this);

        tr.setLayoutParams(new LayoutParams(

                LayoutParams.MATCH_PARENT,

                LayoutParams.WRAP_CONTENT));
        // tr2.setBackgroundResource(R.drawable.border);

        /** Creating a TextView to add to the row **/

        TextView serial = new TextView(this);

        serial.setText("SL");

        serial.setTextColor(Color.WHITE);

        serial.setTypeface(Typeface.DEFAULT, Typeface.BOLD);

        serial.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 1.0f));

        serial.setPadding(10, 10, 10, 0);
        serial.setBackgroundResource(R.drawable.border);

        tr.addView(serial);  // Adding textView to tablerow.

        /** Creating another textview **/

        TextView Embassy = new TextView(this);

        Embassy.setText("Name of Embassy/Mission");

        Embassy.setTextColor(Color.WHITE);

        Embassy.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 2.0f));

        Embassy.setPadding(10, 10, 10, 0);

        Embassy.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        Embassy.setBackgroundResource(R.drawable.border);

        tr.addView(Embassy); // Adding textView to tablerow.

        /** Creating a TextView to add to the row **/

        TextView country = new TextView(this);

        country.setText("Country");

        country.setTextColor(Color.WHITE);

        country.setTypeface(Typeface.DEFAULT, Typeface.BOLD);

        country.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 2.0f));

        country.setPadding(10, 10, 10, 0);
        country.setBackgroundResource(R.drawable.border);

        tr.addView(country);  // Adding textView to tablerow.

        // Add the TableRow to the TableLayout

        tl.addView(tr, new TableLayout.LayoutParams(

                LayoutParams.MATCH_PARENT,

                LayoutParams.WRAP_CONTENT));


    }

    /**
     * This function add the data to the table
     **/

    public void addData() {

        for (int i = 0; i < countryNames.length; i++)

        {

            /** Create a TableRow dynamically **/

            tr = new TableRow(this);

            tr.setLayoutParams(new LayoutParams(

                    LayoutParams.MATCH_PARENT,

                    LayoutParams.WRAP_CONTENT));
            // tr2.setBackgroundResource(R.drawable.border);

            /** Creating a TextView to add to the row **/

            serial = new TextView(this);

            serial.setText("" + (i + 1));

            serial.setTextColor(Color.WHITE);

            serial.setTypeface(Typeface.DEFAULT, Typeface.NORMAL);

            serial.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 1.0f));

            serial.setPadding(10, 10, 10, 10);
            serial.setBackgroundResource(R.drawable.border);

            tr.addView(serial);  // Adding textView to tablerow.

            /** Creating another textview **/

            embassyName = new TextView(this);

            embassyName.setText(embassyNames[i]);

            embassyName.setTextColor(Color.WHITE);

            embassyName.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT, 2.0f));

            embassyName.setPadding(10, 10, 10, 10);

            embassyName.setTypeface(Typeface.DEFAULT, Typeface.NORMAL);
            embassyName.setBackgroundResource(R.drawable.border);

            tr.addView(embassyName); // Adding textView to tablerow.

            /** Creating a TextView to add to the row **/

            country = new TextView(this);

            country.setText(countryNames[i]);

            country.setTextColor(Color.WHITE);

            country.setTypeface(Typeface.DEFAULT, Typeface.NORMAL);

            country.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 2.0f));

            country.setPadding(10, 10, 10, 10);
            country.setBackgroundResource(R.drawable.border);

            tr.addView(country);  // Adding textView to tablerow.

            // Add the TableRow to the TableLayout

            tl.addView(tr, new TableLayout.LayoutParams(

                    TableLayout.LayoutParams.MATCH_PARENT,

                    TableLayout.LayoutParams.WRAP_CONTENT));

        }


    }

}
