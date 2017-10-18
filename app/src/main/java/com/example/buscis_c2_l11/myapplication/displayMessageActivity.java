package com.example.buscis_c2_l11.myapplication;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class displayMessageActivity extends AppCompatActivity implements OnClickListener {

    private static final String TAG = "CalendarActivity";
    private CalendarView calendarView;
    private Toast toast;
    private RadioButton radio1_id;
    private RadioButton radio2_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();

        calendarView = (CalendarView) findViewById(R.id.calendarView);
        radio1_id = (RadioButton) findViewById(R.id.radio1_Id);
        radio2_id = (RadioButton) findViewById(R.id.radio2_Id);

        radio1_id.setOnClickListener(this);
        radio2_id.setOnClickListener(this);}

        public void onClick(View view) {
            if (view.getid() == R.id.radio1_Id) {
                // enter convert to english string
               // setLocale{"en");
            }

            if (view.getid() == R.id.radio2_Id) {
                // enter convert to spanish string
                //setLocale("es");
            }

        calendarView.setOnDateChangeListener(new OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                Toast.makeText(getApplicationContext(), ""+dayOfMonth, 0).show();// TODO Auto-generated method stub

            }
        });

    }
}
      //  String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

     //   TextView textView = (TextView) findViewById(R.id.textView);
       // textView.setText(message);
 //   }
//}
