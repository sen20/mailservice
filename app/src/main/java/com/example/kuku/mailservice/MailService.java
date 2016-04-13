package com.example.kuku.mailservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MailService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_service);

//        Button sendEmail=(Button) findViewById(R.id.announcements);
//        final mail m=new mail("senteam20@gmail.com","senteam20@gmail.com","Testing","Your password is 123","<b>HtmlBody</b>");
//        assert sendEmail!=null;
//
//        sendEmail.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                try {
//                    m.sendAuthenticated();
//                }catch (Exception e){
//
//                }
//            }
//        });

        Spinner spinner=(Spinner) findViewById(R.id.clubs);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.clubs,android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
