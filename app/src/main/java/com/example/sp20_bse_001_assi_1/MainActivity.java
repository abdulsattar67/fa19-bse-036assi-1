package com.example.sp20_bse_001_assi_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAddRecord,btnSearchRecord;

        btnAddRecord = findViewById(R.id.add_btn);
        btnSearchRecord = findViewById(R.id.search_btn);

        btnAddRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction fgTx =  manager.beginTransaction();
                fgTx.add(R.id.frameContainer, new AddFragment());
                fgTx.commit();
            }
        });

        btnSearchRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction fgTx =  manager.beginTransaction();
                fgTx.add(R.id.frameContainer, new SearchFragment());
                fgTx.commit();
            }
        });




    }
}