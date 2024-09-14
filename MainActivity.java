package com.example.nasheedtube;

import static androidx.fragment.app.FragmentManager.TAG;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {


    private VideoView videoView;
    private Button playButton;

    LinearLayout about, about2;

    ImageView notification, search;
    Button button1, button1A, button2, button2A, button3, button3A, button4, button4A, button5, button5A, button6, button6A, button7, button7A;

    WebView webview1, webview2, webview3, webview4, webview5, webview6, webview7, webview8, webview9, webview10, webview11, webview12;

    WebView f_webview1, f_webview2, f_webview3, f_webview4, f_webview5, f_webview6, f_webview7, f_webview8, f_webview9, f_webview10, f_webview11, f_webview12, f_webview13;


    WebView a_webview1, a_webview2, a_webview3, a_webview4, a_webview5, a_webview6, a_webview7, a_webview8, a_webview9, a_webview10, a_webview11, a_webview12, a_webview13;


    WebView b_webview1, b_webview2, b_webview3, b_webview4, b_webview5, b_webview6, b_webview7, b_webview8, b_webview9, b_webview10;


    ScrollView scroll_all, scroll_favourites, scroll_arabic, scroll_bengali, scroll_urdu, scroll_english, scroll_mixed;


    //:::::::::::::::::::::::::::::::::::::::::::::::::::::::;;:::::::::::


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);








        videoView = findViewById(R.id.videoView);
        playButton = findViewById(R.id.playButton);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.allahu_allahu;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        playButton.setOnClickListener(v -> {
            if (videoView.isPlaying()) {
                videoView.pause();
                playButton.setText("Play");
            } else {
                videoView.start();
                playButton.setText("Pause");
            }
        });

        videoView.setOnCompletionListener(mp -> playButton.setText("Play"));


















        about = findViewById(R.id.about);
        about2 = findViewById(R.id.about2);


        scroll_all = findViewById(R.id.scroll_all);
        scroll_favourites = findViewById(R.id.scroll_favourites);
        scroll_arabic = findViewById(R.id.scroll_arabic);
        scroll_bengali = findViewById(R.id.scroll_bengali);
        scroll_english = findViewById(R.id.scroll_english);
        scroll_urdu = findViewById(R.id.scroll_urdu);
        scroll_mixed = findViewById(R.id.scroll_mixed);


        webview1 = findViewById(R.id.webview1);
        webview2 = findViewById(R.id.webview2);
        webview3 = findViewById(R.id.webview3);
        webview4 = findViewById(R.id.webview4);
        webview5 = findViewById(R.id.webview5);
        webview6 = findViewById(R.id.webview6);
        webview7 = findViewById(R.id.webview7);
        webview8 = findViewById(R.id.webview8);
        webview9 = findViewById(R.id.webview9);
        webview10 = findViewById(R.id.webview10);
        webview11 = findViewById(R.id.webview11);
        webview12 = findViewById(R.id.webview12);


        f_webview1 = findViewById(R.id.f_webview1);
        f_webview2 = findViewById(R.id.f_webview2);
        f_webview3 = findViewById(R.id.f_webview3);
        f_webview4 = findViewById(R.id.f_webview4);
        f_webview5 = findViewById(R.id.f_webview5);
        f_webview6 = findViewById(R.id.f_webview6);
        f_webview7 = findViewById(R.id.f_webview7);
        f_webview8 = findViewById(R.id.f_webview8);
        f_webview9 = findViewById(R.id.f_webview9);
        f_webview10 = findViewById(R.id.f_webview10);
        f_webview11 = findViewById(R.id.f_webview11);
        f_webview12 = findViewById(R.id.f_webview12);
        f_webview13 = findViewById(R.id.f_webview13);


        a_webview1 = findViewById(R.id.a_webview1);
        a_webview2 = findViewById(R.id.a_webview2);
        a_webview3 = findViewById(R.id.a_webview3);
        a_webview4 = findViewById(R.id.a_webview4);
        a_webview5 = findViewById(R.id.a_webview5);
        a_webview6 = findViewById(R.id.a_webview6);
        a_webview7 = findViewById(R.id.a_webview7);
        a_webview8 = findViewById(R.id.a_webview8);
        a_webview9 = findViewById(R.id.a_webview9);
        a_webview10 = findViewById(R.id.a_webview10);
        a_webview11 = findViewById(R.id.a_webview11);
        a_webview12 = findViewById(R.id.a_webview12);
        a_webview13 = findViewById(R.id.a_webview13);


        b_webview1 = findViewById(R.id.b_webview1);
        b_webview2 = findViewById(R.id.b_webview2);
        b_webview3 = findViewById(R.id.b_webview3);
        b_webview4 = findViewById(R.id.b_webview4);
        b_webview5 = findViewById(R.id.b_webview5);
        b_webview6 = findViewById(R.id.b_webview6);
        b_webview7 = findViewById(R.id.b_webview7);
        b_webview8 = findViewById(R.id.b_webview8);
        b_webview9 = findViewById(R.id.b_webview9);
        b_webview10 = findViewById(R.id.b_webview10);


        //:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
        // exit with double click


















//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


        // WebViewClient allows you to handle
        b_webview1.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        b_webview1.loadUrl("https://www.youtube.com/embed/qljb32sxBwo");

        // this will enable the javascript.
        b_webview1.getSettings().setJavaScriptEnabled(true);


        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

        // WebViewClient allows you to handle
        a_webview1.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        a_webview1.loadUrl("https://www.youtube.com/embed/m_tjxz4yS_U");

        // this will enable the javascript.
        a_webview1.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        a_webview2.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        a_webview2.loadUrl("https://www.youtube.com/embed/4yWLofNagy8");

        // this will enable the javascript.
        a_webview2.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        a_webview3.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        a_webview3.loadUrl("https://www.youtube.com/embed/vfNI24pIEBY");

        // this will enable the javascript.
        a_webview3.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        a_webview4.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        a_webview4.loadUrl("https://www.youtube.com/embed/lRNHaFAZqhc");

        // this will enable the javascript.
        a_webview4.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        a_webview5.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        a_webview5.loadUrl("https://www.youtube.com/embed/slkyMimmb1M");

        // this will enable the javascript.
        a_webview5.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        a_webview6.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        a_webview6.loadUrl("https://www.youtube.com/embed/bVQ2V7y3plc");

        // this will enable the javascript.
        a_webview6.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        a_webview7.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        a_webview7.loadUrl("https://www.youtube.com/embed/bVQ2V7y3plc");

        // this will enable the javascript.
        a_webview7.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        a_webview8.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        a_webview8.loadUrl("https://www.youtube.com/embed/bVQ2V7y3plc");

        // this will enable the javascript.
        a_webview8.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        a_webview8.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        a_webview8.loadUrl("https://www.youtube.com/embed/bVQ2V7y3plc");

        // this will enable the javascript.
        a_webview8.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        a_webview9.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        a_webview9.loadUrl("https://www.youtube.com/embed/bVQ2V7y3plc");

        // this will enable the javascript.
        a_webview9.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        a_webview10.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        a_webview10.loadUrl("https://www.youtube.com/embed/bVQ2V7y3plc");

        // this will enable the javascript.
        a_webview10.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        a_webview11.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        a_webview11.loadUrl("https://www.youtube.com/embed/bVQ2V7y3plc");

        // this will enable the javascript.
        a_webview11.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        a_webview12.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        a_webview12.loadUrl("https://www.youtube.com/embed/bVQ2V7y3plc");

        // this will enable the javascript.
        a_webview12.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        a_webview13.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        a_webview13.loadUrl("https://www.youtube.com/embed/bVQ2V7y3plc");

        // this will enable the javascript.
        a_webview13.getSettings().setJavaScriptEnabled(true);


        //:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


        // WebViewClient allows you to handle
        f_webview1.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        f_webview1.loadUrl("https://www.youtube.com/embed/bVQ2V7y3plc");

        // this will enable the javascript.
        f_webview1.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        f_webview2.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        f_webview2.loadUrl("https://www.youtube.com/embed/2RqRuTULrng");

        // this will enable the javascript.
        f_webview2.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        f_webview3.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        f_webview3.loadUrl("https://www.youtube.com/embed/bh5dGdbHCVc");

        // this will enable the javascript.
        f_webview3.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        f_webview4.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        f_webview4.loadUrl("https://www.youtube.com/embed/SS-47_WrjiQ");

        // this will enable the javascript.
        f_webview4.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        f_webview5.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        f_webview5.loadUrl("https://www.youtube.com/embed/6mttwIBcig0");

        // this will enable the javascript.
        f_webview5.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        f_webview6.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        f_webview6.loadUrl("https://www.youtube.com/embed/uPRwl-wuO7A");

        // this will enable the javascript.
        f_webview6.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        f_webview7.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        f_webview7.loadUrl("https://www.youtube.com/embed/YvqopEYMnMw");

        // this will enable the javascript.
        f_webview7.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        f_webview8.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        f_webview8.loadUrl("https://www.youtube.com/embed/1wiOX5QpTRM");

        // this will enable the javascript.
        f_webview8.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        f_webview9.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        f_webview9.loadUrl("https://www.youtube.com/embed/bgIC-s1FWUg");

        // this will enable the javascript.
        f_webview9.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        f_webview10.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        f_webview10.loadUrl("https://www.youtube.com/embed/ciGkpKtkOow");

        // this will enable the javascript.
        f_webview10.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        f_webview11.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        f_webview11.loadUrl("https://www.youtube.com/embed/EdR6s-4TIkk");

        // this will enable the javascript.
        f_webview11.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        f_webview12.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        f_webview12.loadUrl("https://www.youtube.com/embed/SIaGZ1X2eqk");

        // this will enable the javascript.
        f_webview12.getSettings().setJavaScriptEnabled(true);


        f_webview13.setWebViewClient(new WebViewClient());
        f_webview13.loadUrl("https://www.youtube.com/embed/dUyaD0WC8oE");
        f_webview13.getSettings().setJavaScriptEnabled(true);


        // WebViewClient allows you to handle
        webview1.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        webview1.loadUrl("https://www.youtube.com/embed/m_tjxz4yS_U");

        // this will enable the javascript.
        webview1.getSettings().setJavaScriptEnabled(true);


        //....................


        // WebViewClient allows you to handle
        webview2.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        webview2.loadUrl("https://www.youtube.com/embed/Jy4opxA2Yrs");

        // this will enable the javascript.
        webview2.getSettings().setJavaScriptEnabled(true);


        //........................................


        // WebViewClient allows you to handle
        webview3.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        webview3.loadUrl("https://www.youtube.com/embed/1KviEqtohqQ");

        // this will enable the javascript.
        webview3.getSettings().setJavaScriptEnabled(true);


        //.............................................


        // WebViewClient allows you to handle
        webview4.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        webview4.loadUrl("https://www.youtube.com/embed/vfNI24pIEBY");

        // this will enable the javascript.
        webview4.getSettings().setJavaScriptEnabled(true);


        //.................................


        // WebViewClient allows you to handle
        webview5.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        webview5.loadUrl("https://www.youtube.com/embed/yJ7Ao3e76ho");

        // this will enable the javascript.
        webview5.getSettings().setJavaScriptEnabled(true);


        //...................................


        // WebViewClient allows you to handle
        webview6.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        webview6.loadUrl("https://www.youtube.com/embed/hSzbldhSobA");

        // this will enable the javascript.
        webview6.getSettings().setJavaScriptEnabled(true);


        //...................................................


        // WebViewClient allows you to handle
        webview7.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        webview7.loadUrl("https://www.youtube.com/embed/1DxLXL-_cL8");

        // this will enable the javascript.
        webview7.getSettings().setJavaScriptEnabled(true);


        //...............................


        // WebViewClient allows you to handle
        webview8.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        webview8.loadUrl("https://www.youtube.com/embed/NrsCej6SVxM");

        // this will enable the javascript.
        webview8.getSettings().setJavaScriptEnabled(true);


        //..................


        // WebViewClient allows you to handle
        webview9.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        webview9.loadUrl("https://www.youtube.com/embed/58ybZBaaOVs");

        // this will enable the javascript.
        webview9.getSettings().setJavaScriptEnabled(true);
//..............................


        // WebViewClient allows you to handle
        webview10.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        webview10.loadUrl("https://www.youtube.com/embed/Myksd-l0j1I");

        // this will enable the javascript.
        webview10.getSettings().setJavaScriptEnabled(true);


        //...............................


        // WebViewClient allows you to handle
        webview11.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        webview11.loadUrl("https://www.youtube.com/embed/5RCyAVqdYjs");

        // this will enable the javascript.
        webview11.getSettings().setJavaScriptEnabled(true);


        //................................


        // WebViewClient allows you to handle
        webview12.setWebViewClient(new WebViewClient());

        // onPageFinished and override Url loading.
        webview12.loadUrl("https://www.youtube.com/embed/iaWZ_3D6vOQ");

        // this will enable the javascript.
        webview12.getSettings().setJavaScriptEnabled(true);

































        //                 These ARe Buttons                              //

        //........................Involving to main xml id........................................//

        notification = findViewById(R.id.notification);
        search = findViewById(R.id.search);
        button1 = findViewById(R.id.button1);
        button1A = findViewById(R.id.button1A);
        button2 = findViewById(R.id.button2);
        button2A = findViewById(R.id.button2A);
        button3 = findViewById(R.id.button3);
        button3A = findViewById(R.id.button3A);
        button4 = findViewById(R.id.button4);
        button4A = findViewById(R.id.button4A);
        button5 = findViewById(R.id.button5);
        button5A = findViewById(R.id.button5A);
        button6 = findViewById(R.id.button6);
        button6A = findViewById(R.id.button6A);
        button7 = findViewById(R.id.button7);
        button7A = findViewById(R.id.button7A);


        //...........................................................


        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Search.class);
                //এটা notification.java হবে , ভুলে search.java diye ক্লাস খুলে ফেলেছি!
                startActivity(myIntent);
            }
        });


        //............................................................

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Search2.class);

                startActivity(myIntent);
            }
        });























        ///..........................:::::::::::::::::::::::::::::...........................///


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button1.setVisibility(View.GONE);
                button1A.setVisibility(View.VISIBLE);

                button2.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                button6.setVisibility(View.VISIBLE);
                button7.setVisibility(View.VISIBLE);

                button2A.setVisibility(View.GONE);
                button3A.setVisibility(View.GONE);
                button4A.setVisibility(View.GONE);
                button5A.setVisibility(View.GONE);
                button6A.setVisibility(View.GONE);
                button7A.setVisibility(View.GONE);


                scroll_all.setVisibility(View.VISIBLE);
                scroll_favourites.setVisibility(View.GONE);
                scroll_arabic.setVisibility(View.GONE);
                scroll_bengali.setVisibility(View.GONE);
                scroll_english.setVisibility(View.GONE);
                scroll_urdu.setVisibility(View.GONE);
                scroll_mixed.setVisibility(View.GONE);


            }
        });


        ///...............................................................


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button2.setVisibility(View.GONE);
                button2A.setVisibility(View.VISIBLE);

                button1.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                button6.setVisibility(View.VISIBLE);
                button7.setVisibility(View.VISIBLE);

                button1A.setVisibility(View.GONE);
                button3A.setVisibility(View.GONE);
                button4A.setVisibility(View.GONE);
                button5A.setVisibility(View.GONE);
                button6A.setVisibility(View.GONE);
                button7A.setVisibility(View.GONE);


                scroll_all.setVisibility(View.GONE);
                scroll_favourites.setVisibility(View.VISIBLE);
                scroll_arabic.setVisibility(View.GONE);
                scroll_bengali.setVisibility(View.GONE);
                scroll_english.setVisibility(View.GONE);
                scroll_urdu.setVisibility(View.GONE);
                scroll_mixed.setVisibility(View.GONE);


            }
        });


        //...................................................................


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button3.setVisibility(View.GONE);
                button3A.setVisibility(View.VISIBLE);

                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                button6.setVisibility(View.VISIBLE);
                button7.setVisibility(View.VISIBLE);

                button1A.setVisibility(View.GONE);
                button2A.setVisibility(View.GONE);
                button4A.setVisibility(View.GONE);
                button5A.setVisibility(View.GONE);
                button6A.setVisibility(View.GONE);
                button7A.setVisibility(View.GONE);


                scroll_all.setVisibility(View.GONE);
                scroll_favourites.setVisibility(View.GONE);
                scroll_arabic.setVisibility(View.VISIBLE);
                scroll_bengali.setVisibility(View.GONE);
                scroll_english.setVisibility(View.GONE);
                scroll_urdu.setVisibility(View.GONE);
                scroll_mixed.setVisibility(View.GONE);


            }
        });


        //....................................................


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4.setVisibility(View.GONE);
                button4A.setVisibility(View.VISIBLE);

                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                button6.setVisibility(View.VISIBLE);
                button7.setVisibility(View.VISIBLE);

                button1A.setVisibility(View.GONE);
                button2A.setVisibility(View.GONE);
                button3A.setVisibility(View.GONE);
                button5A.setVisibility(View.GONE);
                button6A.setVisibility(View.GONE);
                button7A.setVisibility(View.GONE);


                scroll_all.setVisibility(View.GONE);
                scroll_favourites.setVisibility(View.GONE);
                scroll_arabic.setVisibility(View.GONE);
                scroll_bengali.setVisibility(View.VISIBLE);
                scroll_english.setVisibility(View.GONE);
                scroll_urdu.setVisibility(View.GONE);
                scroll_mixed.setVisibility(View.GONE);


            }
        });


        //............................................................


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button5.setVisibility(View.GONE);
                button5A.setVisibility(View.VISIBLE);

                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                button6.setVisibility(View.VISIBLE);
                button7.setVisibility(View.VISIBLE);

                button1A.setVisibility(View.GONE);
                button2A.setVisibility(View.GONE);
                button3A.setVisibility(View.GONE);
                button4A.setVisibility(View.GONE);
                button6A.setVisibility(View.GONE);
                button7A.setVisibility(View.GONE);


                scroll_all.setVisibility(View.GONE);
                scroll_favourites.setVisibility(View.GONE);
                scroll_arabic.setVisibility(View.GONE);
                scroll_bengali.setVisibility(View.GONE);
                scroll_english.setVisibility(View.VISIBLE);
                scroll_urdu.setVisibility(View.GONE);
                scroll_mixed.setVisibility(View.GONE);


            }
        });


        //.................................................................................//


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6.setVisibility(View.GONE);
                button6A.setVisibility(View.VISIBLE);

                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                button7.setVisibility(View.VISIBLE);


                button1A.setVisibility(View.GONE);
                button2A.setVisibility(View.GONE);
                button3A.setVisibility(View.GONE);
                button4A.setVisibility(View.GONE);
                button5A.setVisibility(View.GONE);
                button7A.setVisibility(View.GONE);


                scroll_all.setVisibility(View.GONE);
                scroll_favourites.setVisibility(View.GONE);
                scroll_arabic.setVisibility(View.GONE);
                scroll_bengali.setVisibility(View.GONE);
                scroll_english.setVisibility(View.GONE);
                scroll_urdu.setVisibility(View.VISIBLE);
                scroll_mixed.setVisibility(View.GONE);


            }
        });


//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                button7.setVisibility(View.GONE);
                button7A.setVisibility(View.VISIBLE);

                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                button5.setVisibility(View.VISIBLE);
                button6.setVisibility(View.VISIBLE);

                button1A.setVisibility(View.GONE);
                button2A.setVisibility(View.GONE);
                button3A.setVisibility(View.GONE);
                button4A.setVisibility(View.GONE);
                button5A.setVisibility(View.GONE);
                button6A.setVisibility(View.GONE);


                scroll_all.setVisibility(View.GONE);
                scroll_favourites.setVisibility(View.GONE);
                scroll_arabic.setVisibility(View.GONE);
                scroll_bengali.setVisibility(View.GONE);
                scroll_english.setVisibility(View.GONE);
                scroll_urdu.setVisibility(View.GONE);
                scroll_mixed.setVisibility(View.VISIBLE);


            }
        });


        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::;

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(myIntent);
            }
        });


        about2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(myIntent);
            }
        });


    }
}














































