package com.nick.quiz;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;


public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.question_text_view));



            Question.questions = getResources().getStringArray(R.array.questions);




        Question question = new Question();
        textView.setText(Question.questions[question.currentIndex]);


        View.OnClickListener listenerAnswer = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean ans;
                if(v == findViewById(R.id.btn_true)){
                    ans = true;
                }
                if(v == findViewById(R.id.btn_false)){
                    ans = false;
                }



            }
        };
    }
}