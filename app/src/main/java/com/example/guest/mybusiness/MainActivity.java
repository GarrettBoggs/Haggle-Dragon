package com.example.guest.mybusiness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Bind(R.id.fireButton) Button mFireButton;
    @Bind(R.id.iceButton) Button mIceButton;
    @Bind(R.id.shadowButton) Button mShadowButton;

    private String[] fireDragons = new String[] {"Flames", "Smoky", "Scales", "FireClaws"};
    private String[] iceDragons = new String[] {"Frostbite", "Snowball", "Avalanche"};
    private String[] shadowDragons = new String[] {"Shadow", "Shuriken", "Shade"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFireButton.setOnClickListener(this);
        mIceButton.setOnClickListener(this);
        mShadowButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, DragonPage.class);

        if(v == mFireButton){
            intent.putExtra("dragonArray" , fireDragons);
            startActivity(intent);
        }

        if(v == mIceButton){
            intent.putExtra("dragonArray" , iceDragons);
            startActivity(intent);
        }

        if(v == mShadowButton){
            intent.putExtra("dragonArray" , shadowDragons);
            startActivity(intent);
        }



    }
}
