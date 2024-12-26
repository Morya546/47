package com.example.colorindicator;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView colorTextView;
    private Button changeColorButton;
    private String[] colors = {"RED", "GREEN", "BLUE", "YELLOW", "MAGENTA", "CYAN"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorTextView = findViewById(R.id.colorTextView);
        changeColorButton = findViewById(R.id.changeColorButton);

        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColor();
            }
        });
    }

    private void changeColor() {
        Random random = new Random();
        int colorIndex = random.nextInt(colors.length);
        String selectedColor = colors[colorIndex];

        switch (selectedColor) {
            case "RED":
                colorTextView.setTextColor(Color.RED);
                break;
            case "GREEN":
                colorTextView.setTextColor(Color.GREEN);
                break;
            case "BLUE":
                colorTextView.setTextColor(Color.BLUE);
                break;
            case "YELLOW":
                colorTextView.setTextColor(Color.YELLOW);
                break;
            case "MAGENTA":
                colorTextView.setTextColor(Color.MAGENTA);
                break;
            case "CYAN":
                colorTextView.setTextColor(Color.CYAN);
                break;
        }

        colorTextView.setText("Текущий цвет: " + selectedColor);
        Toast.makeText(this, "Цвет изменен на " + selectedColor, Toast.LENGTH_SHORT).show();
    }
}
