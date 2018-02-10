package cm.allinone.allinonesocial;

import android.app.SearchManager;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{

    ImageButton flipkart,amazon,shpclus,pagalworld,youtube,google,news,toptenyt,facebook;
    Button search;
    EditText searchtxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flipkart=(ImageButton)findViewById(R.id.imageflipkart);
        amazon=(ImageButton)findViewById(R.id.imageamazon);
        shpclus=(ImageButton)findViewById(R.id.imageshopclues);
        pagalworld=(ImageButton)findViewById(R.id.imagepagalworld);
        youtube=(ImageButton)findViewById(R.id.imageyt);
        google=(ImageButton)findViewById(R.id.imagesgoogle);
        news=(ImageButton)findViewById(R.id.imagenews);
        toptenyt=(ImageButton)findViewById(R.id.imagebigyoutube);
        facebook=(ImageButton)findViewById(R.id.imagefacebook);
        search=(Button) findViewById(R.id.search);
        searchtxt=(EditText)findViewById(R.id.searchTxt);



        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=searchtxt.getText().toString();
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH );
                intent.putExtra(SearchManager.QUERY, url);
                startActivity(intent);
            }
        });



        flipkart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value","http://www.flipkart.com");
                startActivity(in);

            }
        });


        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="http://www.amazon.in";
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value",url);
                startActivity(in);

            }
        });


        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="http://www.facebook.com";
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value",url);
                startActivity(in);

            }
        });
        toptenyt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(getApplicationContext(),toptenactivity.class);

                startActivity(in);
            }
        });

        pagalworld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="http://www.pagalworld.com";
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value",url);
                startActivity(in);

            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="http://www.mastinewshindi.blogspot.in";
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value",url);
                startActivity(in);

            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="http://www.youtube.com";
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value",url);
                startActivity(in);

            }
        });
        shpclus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="http://www.shopclues.com";
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value",url);
                startActivity(in);

            }
        });



        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="http://www.google.com";
                Intent in=new Intent(getApplicationContext(),WebViewActivity.class);
                in.putExtra("Value",url);
                startActivity(in);

            }
        });

    }
}
