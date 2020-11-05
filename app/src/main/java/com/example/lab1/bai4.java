package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class bai4 extends AppCompatActivity {
    int [] img = {R.drawable.b1,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,R.drawable.b6,R.drawable.b7,R.drawable.b8,
            R.drawable.b9,R.drawable.b10,R.drawable.b11,R.drawable.b12,R.drawable.b13,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        FrameLayout fam = findViewById(R.id.fram);

        int i = 0 ;
        for (int id:img){
            ImageView iv = new ImageView(this);
            iv.setImageResource(id);

            FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
            params.leftMargin = (int)(i* 20 * this.getResources().getDisplayMetrics().density);
            params.width = (int)(100 * this.getResources().getDisplayMetrics().density);
            params.height = (int)(150 * this.getResources().getDisplayMetrics().density);
            iv.setLayoutParams(params);
            fam.addView(iv );
            i++;
        }
    }
}