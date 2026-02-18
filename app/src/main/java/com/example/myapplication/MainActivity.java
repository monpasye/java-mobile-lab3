package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ImageButton btnNext;

    // Массив с нашими картинками
    private int[] images = {
            R.drawable.ic_image1,
            R.drawable.ic_image2,
            R.drawable.ic_image3
    };

    private int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image_view);
        btnNext = findViewById(R.id.btn_next);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeImage();
            }
        });
    }

    private void changeImage() {
        int randomIndex = (int) (Math.random() * images.length);
        imageView.setImageResource(images[randomIndex]);
    }
}