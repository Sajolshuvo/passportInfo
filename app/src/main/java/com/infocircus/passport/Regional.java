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

public class Regional extends AppCompatActivity {

    private TextView jurisdiction, mobile, email, portal, fb, reg;

    private AutoCompleteTextView textView;
    private String[] officeName = {"Uttara,Dhaka", "Jatrabari,Dhaka", "Comilla", "Mymensingh", "Gopalganj", "Noakhali", "Sirajganj", "Jessore", "Hobiganj", "Faridpur", "Chandpur", "Manikganj", "Munshiganj", "Bogra", "Dinajpur", "Pabna", "Patuakhali", "Moulvibazar", "Tangail", "Panchlish,Chittagong", "Kishoreganj", "Narsingdi", " Feni", "Cox's Bazar", "Rangamati", "Kushtia", "Bandarban", "Bagerhat", "Barguna", "Bhola", "Chuadanga", "Chapai nawabganj", "Gaibandha.", "Gazipur", "Jamalpur", "Joypurhat", "Jhalokathi", "Jhenaidah", "Khagrachhari", "Kurigram", "Lalmonirhat", "Lakshmipur", "Madaripur", "Magura", "Meherpur", "Natore", "Naogaon", "Narail", "Narayanganj", "Netrakona", "Nilphamari", "Panchagarh", "Pirojpur", "Rajbari", "Satkhira", "Shariatpur", "Sherpur", "Sunamganj", "Thakurgaon", "Cantonment, Dhaka", "Secretariat, Dhaka"};

    private String mobles[] = {"01733393328", "01733393327", "01733393352", "01733393334", "01733393346", "01733393381", "01733393384", "01733393365", "01733393363", "01733393342", "01733393355", "01733393335", "01733393339", "01733393382", "01733393358", "01733393386", "01733393377", "01733393362", "01733393338", "01733393350", "01733393340", "01733393397", "01733393353", "01733393322", " ", "01733393356", "01733393372", "01733393359", "01733393368", "01733393378", "01733393376", "01733393373", "01733393388", "01733393390", "01733393337", "01733393344", "01733393383", "01733393375", "01733393366", "01733393360", "01733393395", "01733393394", "01733393347", "01733393369", "01733393371", "01733393385", "01733393387", "01733393370", "01733393336", "01733393348", "01733393393", "01733393391", "01733393379", "01733393343", "01733393367", "01733393345", "01733393341", "01733393396", "01733393392", "01709989900", "01732436080"};
    private String emails[] = {"rpouttara@pass.gov.bd", "rpojatrabari@pass.gov.bd", "rpocomilla@pass.gov.bd", "rpomymensingh@pass.gov.bd", "rpogopalgonj@pass.gov.bd", "rponoahkhali@pass.gov.bd", "rposirajgonj@pass.gov.bd", "rpojessore@pass.gov.bd", "rpohobigonj@pass.gov.bd", "rpofaridpur@pass.gov.bd", "rpochandpur@pass.gov.bd", "rpomanikgonj@pass.gov.bd", "rpomunshigonj@pass.gov.bd", "rpobogra@pass.gov.bd", "rpodinajpur@pass.gov.bd", "rpopabna@pass.gov.bd", "rpopatuakhali@pass.gov.bd", "rpomoulovibazar@pass.gov.bd", "rpotangail@pass.gov.bd", "rpochandgaon@pass.gov.bd", "rpokishiregonj@pass.gov.bd", "rponarshindi@pass.gov.bd", "rpofeni@pass.gov.bd", "rpobrahmanbaria@pass.gov.bd", "rpocoxbazar@pass.gov.bd", "rporangamati@pass.gov.bd", "rpokushtia@pass.gov.bd", "rpobandarban@pass.gov.bd", "rpobagerhat@pass.gov.bd", "rpo_borguna@pass.gov.bd", "rpobhola@pass.gov.bd", "rpochuadanga@pass.gov.bd", "rpochapainawabgonj@pass.gov.bd", "rpogaibandha@pass.gov.bd", "rpogazipur@pass.gov.bd", "rpojamalpur@pass.gov.bd", "rpojaypurhat@pass.gov.bd", "rpojhalokati@pass.gov.bd", "rpojinaidaha@pass.gov.bd", "rpokhagrachori@pass.gov.bd", "rpokurigram@pass.gov.bd", "rpolalmonirhat@pass.gov.bd", "rpolaxmipur@pass.gov.bd", "rpomadaripur@pass.gov.bd", "rpomagura@pass.gov.bd", "rpomeherpur@pass.gov.bd", "rponatore@pass.gov.bd", "rponaogaon@pass.gov.bd", "rponorail@pass.gov.bd", "rponarayangonj@pass.gov.bd", "rponetrogona@pass.gov.bd", "rponilphamari@pass.gov.bd", "rpoponchogar@pass.gov.bd", "rpopirojpur@pass.gov.bd", "rporajbari@pass.gov.bd", "rposatkhira@pass.gov.bd", "rposhariatpur@pass.gov.bd", "rposherpur@pass.gov.bd", "rposunamgonj@pass.gov.bd", "rpothakurgaon@pass.gov.bd", "rpocantonment@pass.gov.bd", "rpo_secretariat@pass.gov.bd"};
    private String fbs[] = {"https://www.facebook.com/passportoffice-uttara-1541804059392339", "https://www.facebook.com/rpo.jatrabari", "https://www.facebook.com/Passportoffice-comilla-1567265400181836", "https://www.facebook.com/pages/Passport-Office-Mymensingh/329129887135577", "https://www.facebook.com/profile.php?id=100008907046591", "https://www.facebook.com/rponoakhali", "https://www.facebook.com/passportoffice.sirajganj", "https://www.facebook.com/dipjessore", "https://www.facebook.com/passportoffice.habiganj", "https://www.facebook.com/profile.php?id=100008783524781", "https://www.facebook.com/Passportoffice-Chandpur-1477761669171664", "https://www.facebook.com/profile.php?id=100008699149345", "https://www.facebook.com/Passportoffice-Munshiganj-332160430306598", "https://www.facebook.com/profile.php?id=100008849463291", "https://www.facebook.com/Passportoffice-Dinajpur-250263525144015", "https://www.facebook.com/profile.php?id=100008735772514", "https://www.facebook.com/profile.php?id=100008810528278", "https://www.facebook.com/profile.php?id=100008811815241", "https://www.facebook.com/rpotangail", "https://www.facebook.com/profile.php?id=100008674638538", "https://www.facebook.com/profile.php?id=100008712615191", "https://www.facebook.com/profile.php?id=100013587394641", " https://www.facebook.com/passportoffice.feni", "https://www.facebook.com/passportoffice.brahmanbaria", "https://www.facebook.com/Passportoffice-Coxsbazar-851219631613247", "https://www.facebook.com/Passportoffice-Rangamati-821705241220924", "https://www.facebook.com/Passportoffice-Kushtia-733110196758097", "https://www.facebook.com/rpo.bandarban", "https://www.facebook.com/Passportoffice-Bagerhat-1539919872954660", "https://www.facebook.com/Passportoffice-barguna-452076838278087", "https://www.facebook.com/rpo.bhola", "https://www.facebook.com/profile.php?id=100008985995698", "https://www.facebook.com/passportoffice.chapai", "https://www.facebook.com/Passportoffice-Gaibandha-1540590356225794", "https://www.facebook.com/Passportoffice-Gazipur-372905059556974", "https://www.facebook.com/passportoffice.jamalpur.5", "https://www.facebook.com/RpoJoypurhat", " ", "https://www.facebook.com/Passportoffice-Jhenaidah-326168047578236/", "https://www.facebook.com/pass.khagrachari", "https://www.facebook.com/profile.php?id=100008882409081", "https://www.facebook.com/Passportoffice-lalmonirhat-1685220578371472", "https://www.facebook.com/profile.php?id=100008700766431", "https://www.facebook.com/rpo.madaripur", "https://www.facebook.com/regionalpassportoffice.magura", "https://www.facebook.com/Passportoffice-Meherpur-1396063857356202", "https://www.facebook.com/rpo.natore", "https://www.facebook.com/profile.php?id=100009013128126", "https://www.facebook.com/rponorail", "https://www.facebook.com/rponarayangonj", "https://www.facebook.com/passportofficenetrokona.rpo.9", "https://www.facebook.com/PassportofficeNilphamari", "https://www.facebook.com/Passportoffice-panchagarh-761699127249630", "https://www.facebook.com/Passportoffice-pirojpur-766412150095561", "https://www.facebook.com/passportoffice.rajbari", "https://www.facebook.com/rpo.satkhira.1", "https://www.facebook.com/rpo.shariatpur", "https://www.facebook.com/profile.php?id=100008887789083", "https://www.facebook.com/passportofficesunamganj", "https://www.facebook.com/passportoffice.thakurgaon", " ", " "};
    private String portals[] = {" ", " ", "http://pass.comilla.gov.bd", "http://pass.mymensingh.gov.bd/", "http://pass.gopalganj.gov.bd/", "http://pass.noakhali.gov.bd", "http://pass.sirajganj.gov.bd/", "http://pass.jessore.gov.bd/", "http://pass.habiganj.gov.bd", "http://pass.faridpur.gov.bd/", "http://pass.chandpur.gov.bd", "http://pass.manikganj.gov.bd/", "http://pass.munshiganj.gov.bd", "http://pass.bogra.gov.bd/", " http://pass.dinajpur.gov.bd/", "rpopabna@pass.gov.bd", "http://pass.patuakhali.gov.bd/", "http://pass.moulvibazar.gov.bd/", "http://pass.tangail.gov.bd/", " ", "http://pass.kishoreganj.gov.bd/", "http://pass.narsingdi.gov.bd/", "http://pass.feni.gov.bd/", "http://pass.brahmanbaria.gov.bd/", "http://pass.coxsbazar.gov.bd/", "http://pass.rangamati.gov.bd/", "http://pass.kushtia.gov.bd/", " ", "http://pass.barguna.gov.bd/", "http://pass.bhola.gov.bd/", "http://pass.chuadanga.gov.bd/", "http://pass.chapainawabganj.gov.bd/", "http://pass.gaibandha.gov.bd/", "http://pass.gazipur.gov.bd/", "http://pass.jamalpur.gov.bd/", "http://pass.joypurhat.gov.bd/", "http://pass.jhalakathi.gov.bd/", "http://pass.jhenaidah.gov.bd/", "http://pass.khagrachhari.gov.bd/", "http://pass.kurigram.gov.bd/", "http://pass.lalmonirhat.gov.bd/", "ttp://pass.lakshmipur.gov.bd/", "http://www.madaripur.gov.bd/node/1609376", "http://pass.magura.gov.bd/", "http://pass.meherpur.gov.bd", "http://pass.natore.gov.bd/", "http://pass.naogaon.gov.bd/", "http://pass.narail.gov.bd/", " ", "http://www.netrokona.gov.bd/node/1600083", "http://pass.nilphamari.gov.bd/", "http://pass.panchagarh.gov.bd/", "http://pass.pirojpur.gov.bd/", "http://pass.rajbari.gov.bd/", "http://www.satkhira.gov.bd/node/1149288/", "http://pass.shariatpur.gov.bd/", " ", "http://pass.sunamganj.gov.bd/", "http://pass.thakurgaon.gov.bd/", " ", " "};
    private String jurisdictons[] = {"Uttara, Dakhinkhan, Uttarkhan, Turag, Airport, Badda, Ashulia, Khilkhet.", "Jatrabari, Dohar. Khilgaon, Sabujbagh, Demra, Kadomtoli, Kotwali, Gandaria, Shutrapur, Nawabganj, Keraniganj, Shampur.", "Comilla Sadar (Kotwali), Chandina, Burichong, Debidwar, Daudkandi, Homna, Brahmanpara, Muradnagar, Meghna, Monoharganj and Titas thana under Comilla district", "Mymensingh District", "Gopalganj District", "Noakhali District", "Sirajganj District", "Jessore District", "Hobiganj District", "Faridpur District", "Chandpur District", "Manikganj District", "Munshiganj District", "Bogra District", "Dinajpur District", "Pabna District", "Patuakhali District", "Moulvibazar District", "Tangail District", "Panchlish,Chittagong", "Kishoreganj District", "Narsingdi District", " Feni District", "Cox's Bazar District", "Rangamati District", "Kushtia District", "Bandarban District", "Bagerhat District", "Barguna District", "Bhola District", "Chuadanga District", "Chapai nawabganj District", "Gaibandha District", "Gazipur District", "Jamalpur District", "Joypurhat District", "Jhalokathi District", "Jhenaidah District", "Khagrachhari District", "Kurigram District", "Lalmonirhat District", "Lakshmipur District", "Madaripur District", "Magura District", "Meherpur District", "Natore District", "Naogaon District", "Narail District", "Narayanganj District", "Netrakona", "Nilphamari District", "Panchagarh District", "Pirojpur District", "Rajbari District", "Satkhira District", "Shariatpur District", "Sherpur District", "Sunamganj District", "Thakurgaon District", "Cantonment, Dhaka", "Secretariat, Dhaka"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_divisional_ofiice_list);


        mobile = findViewById(R.id.mobile);
        reg = findViewById(R.id.div);
        jurisdiction = findViewById(R.id.jurisdiction);
        fb = findViewById(R.id.fb);
        email = findViewById(R.id.emails);
        portal = findViewById(R.id.portal);

        reg.setText("Region");


        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_dropdown_item_1line, officeName);

        textView = findViewById(R.id.textview);
        textView.setHint("Select Region");
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