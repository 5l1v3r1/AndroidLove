package com.blogspot.chunkingz.androidlove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
    }

    public void show(View view){
        //textView.setVisibility(View.VISIBLE);
        assert textView != null;
        textView.animate().alpha(1f).setDuration(1000);
    }

    public void hide(View view){
        //textView.setVisibility(View.INVISIBLE);
        assert textView != null;
        textView.animate().alpha(0f).setDuration(1000);
    }

}
