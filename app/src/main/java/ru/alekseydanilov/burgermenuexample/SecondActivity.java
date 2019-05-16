package ru.alekseydanilov.burgermenuexample;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class SecondActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        setTitle("Second Activity");

        // Устанавливаем разметку данного экрана ниже
        View contentView = inflater.inflate(R.layout.activity_second, null, false);
        drawer.addView(contentView, 0);

        // Далее уже пишем код, для работы с данным экраном
    }
}
