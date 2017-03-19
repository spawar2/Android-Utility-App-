package com.example.gsu.final_project_sp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    ArrayList<String> arrayList = new ArrayList<String>();
    String string = "";
    String string1 = "";

    public void onClick1(View v) {
        TextView textView = (TextView) findViewById(R.id.textView);
        Button button = (Button) v;
        string = (String) button.getText().toString();
        if (!string.contains("+") && !string.contains("-") && !string.contains("*") && !string.contains("/")) {
            string1 = string + string1;

            if (arrayList.size() > 0) {
                arrayList.remove((arrayList.size() - 1));
            }
            arrayList.add(string1);
        } else {
            arrayList.add(string);
            arrayList.add(string);
            string1="";
        }

        textView.setText(textView.getText().toString()+string);
        //textView.setText(arrayList.toString());
    }

    public void onClick (View v){
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        int calc = 0;
        int c = arrayList.size();

        while (c!=1) {
            if (c>3) {
                if(arrayList.get(3).contains("*") || arrayList.get(3).contains("/")){
                    if (arrayList.get(3).contains("*")) {calc = Integer.parseInt(arrayList.get(2))*Integer.parseInt(arrayList.get(4));}
                    if (arrayList.get(3).contains("/")) {calc = Integer.parseInt(arrayList.get(2))/Integer.parseInt(arrayList.get(4));}
                    arrayList.remove(2);
                    arrayList.remove(2);
                    arrayList.remove(2);
                    arrayList.add(2, Integer.toString(calc));
                    c=arrayList.size();
                }
                else {
                    if (arrayList.get(1).contains("+")) {calc = Integer.parseInt(arrayList.get(0))+Integer.parseInt(arrayList.get(2 ));}
                    if (arrayList.get(1).contains("-")) {calc = Integer.parseInt(arrayList.get(0))-Integer.parseInt(arrayList.get(2 ));}
                    if (arrayList.get(1).contains("*")) {calc = Integer.parseInt(arrayList.get(0))*Integer.parseInt(arrayList.get(2 ));}
                    if (arrayList.get(1).contains("/")) {calc = Integer.parseInt(arrayList.get(0))/Integer.parseInt(arrayList.get(2 ));}
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.add(0, Integer.toString(calc));
                    c=arrayList.size();
                }

            }

else {          if (arrayList.get(1).contains("+")) {calc = Integer.parseInt(arrayList.get(0))+Integer.parseInt(arrayList.get(2 ));}
                if (arrayList.get(1).contains("-")) {calc = Integer.parseInt(arrayList.get(0))-Integer.parseInt(arrayList.get(2 ));}
                if (arrayList.get(1).contains("*")) {calc = Integer.parseInt(arrayList.get(0))*Integer.parseInt(arrayList.get(2 ));}
                if (arrayList.get(1).contains("/")) {calc = Integer.parseInt(arrayList.get(0))/Integer.parseInt(arrayList.get(2 ));}
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.add(0, Integer.toString(calc));
                c=arrayList.size();

            }

        }

        textView2.setText(Integer.toString(calc));

    }

    public void clear (View v){
        TextView textView1 = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        string1 = "";
        string = "";
        textView2.setText("0");
        textView1.setText("");
        arrayList.clear();
    }


}
