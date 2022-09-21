package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        Button buttonEmail = (Button) findViewById(R.id.buttonEmail);
        Button buttonPhone = (Button) findViewById(R.id.buttonPhone);
        Button buttonAddress = (Button) findViewById(R.id.buttonAddress);


    buttonEmail.setOnClickListener(new View.OnClickListener() {
        @Override
                public void onClick(View v) {
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);

            intent.setData(Uri.parse("mailto:611202100020@mhs.dinus.ac.id"));
            startActivity(intent);
        }
    });


    buttonPhone.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);

            intent.setData(Uri.parse("http://wa.me/6285232022020"));
            startActivity(intent);
        }
    });

    buttonAddress.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);

            intent.setData(Uri.parse("https://goo.gl/maps/87G9oB5yfUz1gJf79"));
            startActivity(intent);
        }
    });
}
}