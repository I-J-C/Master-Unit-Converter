package net.androidbootcamp.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton btnDistance = (RadioButton) findViewById(R.id.radDistance);
        final RadioButton btnTime = (RadioButton) findViewById(R.id.radTime);
        final RadioButton btnVolume = (RadioButton) findViewById(R.id.radVolume);
        final RadioButton btnWeight = (RadioButton) findViewById(R.id.radWeight);
        Button start = (Button) findViewById(R.id.btnStart);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnDistance.isChecked()){
                    startActivity(new Intent(MainActivity.this, DistanceActivity.class));
                }else if(btnTime.isChecked()){
                    startActivity(new Intent(MainActivity.this, TimeActivity.class));
                }else if(btnVolume.isChecked()){
                    startActivity(new Intent(MainActivity.this, VolumeActivity.class));
                }else if(btnWeight.isChecked()){
                    startActivity(new Intent(MainActivity.this, WeightActivity.class));
                }
            }
        });


    }
}
