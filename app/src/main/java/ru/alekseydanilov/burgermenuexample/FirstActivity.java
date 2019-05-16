package ru.alekseydanilov.burgermenuexample;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Обязательное наследование от BaseActivity для того чтобы работало боковое меню
 */
public class FirstActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        setTitle("First Activity");

        // Устанавливаем разметку данного экрана ниже
        View contentView = inflater.inflate(R.layout.activity_first, null, false);
        drawer.addView(contentView, 0);


        // Далее уже пишем код, для работы с данным экраном
        Button button = (Button) findViewById(R.id.button_first);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "Кнопка нажата", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
