package ru.alekseydanilov.burgermenuexample;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class ThirdActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        setTitle("Third Activity");

        //inflate your activity layout here!
        View contentView = inflater.inflate(R.layout.activity_third, null, false);
        drawer.addView(contentView, 0);

        //Do the rest as you want for each activity
    }
}
