package cm.allinone.allinonesocial;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class WebViewActivity extends AppCompatActivity {
   WebView flipkart,googlewv,youtubewv,shopclueswv,bigyoutubewv,newswv,amazonwv,pagalwv,facebookwv;
    String dataflipkart,datafacebook,datashopclues,datayoutube,datanews,datamazon,databigyoutube,datagoogle,datapagal;

    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
          dataflipkart=getIntent().getExtras().getString("Value");
       flipkart=(WebView)findViewById(R.id.Webview1);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        flipkart.setWebViewClient(new MyWebClient());
        flipkart.getSettings().setJavaScriptEnabled(true);
         flipkart.loadUrl(dataflipkart);

     flipkart.setWebChromeClient(new WebChromeClient(){

         @Override
         public void onProgressChanged(WebView view, int newProgress) {
             super.onProgressChanged(view, newProgress);
             progressBar.setProgress(newProgress);
             if(newProgress==100)
                 progressBar.setVisibility(View.GONE);
             else
                 progressBar.setVisibility(View.VISIBLE);
         }
     });


    }


    public class MyWebClient extends WebViewClient
    {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            progressBar.setVisibility(View.VISIBLE);

        }




        @Override
        public void onPageFinished(WebView view, String url) {


            super.onPageFinished(view, url);

            progressBar.setVisibility(View.GONE);
        }

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
      if((keyCode==KeyEvent.KEYCODE_BACK) && flipkart.canGoBack()){
            flipkart.goBack();
          return true;

        }
        else
      {
          finish();
          return true;
      }

    }
}
