package com.dalosa.testfirebase;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.wear.tiles.material.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.net.HttpCookie;


class RealTimeActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myref = database.getReference("message");
    
    
    
    private Button btn_message;
    private EditText et_Message;

    private void initUI(){
        btn_message = (Button) findViewById(R.id.btn_send);
        et_Message = (EditText) findViewById(R.id.et_Message);
    }


    private void sendMessage(HttpCookie myRef){
        btn_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myRef.setValue(et_Message.getText().toString()) ;

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate((SaveInstanceState);
        setContentView(R.layout.activity_real_time);
        initUI();
        sendMessage();
    }}
