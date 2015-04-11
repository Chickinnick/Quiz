package com.nick.quiz;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;


public class MainActivity extends Activity {

    private int currentIndex;

    private Button buttonNext;
    private Button buttonPrew;

    private Button buttonTrue;
    private Button buttonFalse;

    private TextView textView;


    Question[] questions = new Question[]{
            new Question(R.string.q1, true),
            new Question(R.string.q2, true),
            new Question(R.string.q3, true),
            new Question(R.string.q4, true),
            new Question(R.string.q5, true),
            new Question(R.string.q6, true)

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNext = ((Button) findViewById(R.id.btn_next));
        buttonPrew = ((Button) findViewById(R.id.btn_prewiew));

        buttonTrue = ((Button) findViewById(R.id.btn_true));
        buttonFalse = ((Button) findViewById(R.id.btn_false));

    }



}