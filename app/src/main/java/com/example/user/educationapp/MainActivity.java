

package com.example.user.educationapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int count=0;

    private RadioGroup RadioGroup_2;
    private RadioGroup RadioGroup_3;
    private RadioGroup RadioGroup_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup_2 = (RadioGroup) findViewById(R.id.radioGroup2);
        RadioGroup_3 = (RadioGroup) findViewById(R.id.radioGroup3);
        RadioGroup_4 = (RadioGroup) findViewById(R.id.radioGroup4);
    }
    public void onCheckBoxClicked1(View view) {

        CheckBox checkbox1A = (CheckBox) findViewById(R.id.checkbox_1A);
        boolean hascheckbox1A = checkbox1A.isChecked();
        CheckBox checkbox1B = (CheckBox) findViewById(R.id.checkbox_1B);
        boolean hascheckbox1B = checkbox1B.isChecked();
        CheckBox checkbox1C = (CheckBox) findViewById(R.id.checkbox_1C);
        boolean hascheckbox1C = checkbox1C.isChecked();
        CheckBox checkbox1D = (CheckBox) findViewById(R.id.checkbox_1D);
        boolean hascheckbox1D = checkbox1D.isChecked();

        if ((hascheckbox1A) && (hascheckbox1B) && (hascheckbox1C) && (hascheckbox1D))

        {
            // Show information message as a toast
            count=0;
        }
        else if ((hascheckbox1A) && (hascheckbox1B) && (hascheckbox1C) ){

            count=count+1;
        }
        else if ((hascheckbox1A) && (hascheckbox1B) && (hascheckbox1D)) {
            count=0;

        } else if ((hascheckbox1A) && (hascheckbox1B)) {

            count=0;
        }
        else {
            count=0;

        }



    }


 //function to select radio button
    public void onRadioButtonClicked2(View v){

        // Is the current Radio Button checked?
        boolean checked = ((RadioButton) v).isChecked();

        switch(v.getId()){
            case R.id.radio_2A:
                if(checked)
                    count=0;

                break;

            case R.id.radio_2B:
                if(checked)
                    count=0;
                break;
            case R.id.radio_2C:
                if(checked)
                count=count+1;
                break;
            case R.id.radio_2D:
                if(checked)
                    count=0;
                break;
        }
    }

    public void onRadioButtonClicked3(View v){
        // Is the current Radio Button checked?
        boolean checked = ((RadioButton) v).isChecked();
        switch(v.getId()){
            case R.id.radio_3A:
                if(checked)
                count=count+1;
                break;

            case R.id.radio_3B:
                if(checked)
                    count=0;
                break;
            case R.id.radio_3C:
                if(checked)
                    count=0;
                break;
            case R.id.radio_3D:
                if(checked)
                    count=0;
                break;
        }
    }
    public void onRadioButtonClicked4(View v){
        // Is the current Radio Button checked?
        boolean checked = ((RadioButton) v).isChecked();
        switch(v.getId()){
            case R.id.radio_4A:
                if(checked)
                count=count+1;
                break;

            case R.id.radio_4B:
                if(checked)
                    count=0;
                break;
            case R.id.radio_4C:
                if(checked)
                    count=0;

                break;
            case R.id.radio_4D:
                if(checked)
                    count=0;

                break;

        }

    }

//function to call gotten scores
    public void scoresGotten(View view){
        Toast.makeText(this, "you have finished", Toast.LENGTH_SHORT).show();
        displayTotal(count);
    }
    private void displayTotal(int totalScores) {
        TextView totalScoresTextView = (TextView) findViewById(R.id.totalSores_text_view);
        totalScoresTextView.setText("" + totalScores);
    }
    public void onReset(View view){
        count=0;
        displayTotal(count);
        CheckBox checkbox1A = (CheckBox) findViewById(R.id.checkbox_1A);
        //boolean hascheckbox1A = checkbox1A.isChecked();
        CheckBox checkbox1B = (CheckBox) findViewById(R.id.checkbox_1B);
        // boolean hascheckbox1B = checkbox1B.isChecked();
        CheckBox checkbox1C = (CheckBox) findViewById(R.id.checkbox_1C);
        // boolean hascheckbox1C = checkbox1C.isChecked();
        CheckBox checkbox1D = (CheckBox) findViewById(R.id.checkbox_1D);
        //  boolean hascheckbox1D = checkbox1D.isChecked();

        if (checkbox1A.isChecked()) {
            checkbox1A.toggle();
        }
        if (checkbox1B.isChecked()) {
            checkbox1B.toggle();
        }
        if (checkbox1C.isChecked()) {
            checkbox1C.toggle();
        }
        if (checkbox1D.isChecked()) {
            checkbox1D.toggle();
        }

        RadioGroup_2.clearCheck();
        RadioGroup_3.clearCheck();
        RadioGroup_4.clearCheck();

    }



}
