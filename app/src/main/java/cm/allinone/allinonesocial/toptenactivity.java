package cm.allinone.allinonesocial;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class toptenactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toptenactivity);
        ImageButton gauravzone,mumbaikar,mysmartsupport,naman,prince,technical,techno,uic,dhananjay,jeevan;
        gauravzone=(ImageButton)findViewById(R.id.gaurav);
        mumbaikar=(ImageButton)findViewById(R.id.mumbaikar);
        mysmartsupport=(ImageButton)findViewById(R.id.MySmartSupport);
        naman=(ImageButton)findViewById(R.id.NamanChhabra);
        prince=(ImageButton)findViewById(R.id.PrinceChandra);
        technical=(ImageButton)findViewById(R.id.technicalDost);
        techno=(ImageButton)findViewById(R.id.TechnoRuhez);
        uic=(ImageButton)findViewById(R.id.UICVlogs);
        dhananjay=(ImageButton)findViewById(R.id.Dhananjayghongade);
        jeevan=(ImageButton)findViewById(R.id.Jeevan);


        gauravzone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value","https://www.youtube.com/channel/UCGXaE9EsaPbG8YkSm7lBFBA");
                startActivity(in);
            }
        });
        prince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value","https://www.youtube.com/channel/UC3hNf9tl-m8Kf7XvrxXdviA");
                startActivity(in);
            }
        });

        naman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value","https://www.youtube.com/user/CyberTrickx");
                startActivity(in);
            }
        });

        mysmartsupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value","https://www.youtube.com/user/tips4net");
                startActivity(in);
            }
        });

        prince.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value","http://www.flipkart.com");
                startActivity(in);
            }
        });

        uic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value","https://www.youtube.com/channel/UCJu32YspnuE7bck6Li-vyfQ");
                startActivity(in);
            }
        });


        jeevan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value","https://www.youtube.com/channel/UC4BFta04-H7yVIa3045chXA");
                startActivity(in);

            }
        });

        techno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value","https://www.youtube.com/channel/UC8vlDm5xvbxOrCvdu9UNOiA");
                startActivity(in);
            }
        });


        technical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value","https://www.youtube.com/channel/UC1D1vdq169T7w5iJ45zZL5Q");
                startActivity(in);
            }
        });

        dhananjay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value","https://www.youtube.com/channel/UCz9HfaersZK5tt1QcaroEVg");
                startActivity(in);
            }
        });

        mumbaikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value","https://www.youtube.com/channel/UCNn6AaHharXIbkRleXGboiQ");
                startActivity(in);
            }
        });

    }
}
