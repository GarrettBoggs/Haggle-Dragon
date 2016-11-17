package com.example.guest.mybusiness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DragonPage extends AppCompatActivity {
    @Bind(R.id.dragonList) ListView mDragonList;
    @Bind(R.id.forSaleTitle) TextView mForSaleTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragon_page);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String[] mDragonsArray = intent.getStringArrayExtra("dragonArray");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mDragonsArray);
        mDragonList.setAdapter(adapter);

        if (mDragonsArray[0].equals("Flames")) {
            mForSaleTitle.setText("Fire Dragons For Sale");

        } else if (mDragonsArray[0].equals("Frostbite")) {
            mForSaleTitle.setText("Ice Dragons For Sale");

        } else if (mDragonsArray[0].equals("Shadow")) {
            mForSaleTitle.setText("Shadow Dragons For Sale");

        }
    }
}
