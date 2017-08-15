package com.example.mussabaheenmalik.assignment;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
   Button b2;

    Button b1;
    String res;
    int num=0;
    int a;
    TextView txt;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView)findViewById(R.id.textView2);
        b1=(Button)findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button3);

        txt2=(TextView)findViewById(R.id.textView3);
        if(savedInstanceState!=null)
        {
            String s1=savedInstanceState.getString("color1");
            if(s1!=null)
            {
                b1.setBackgroundColor(Integer.parseInt(s1));
            }
        }
        if(savedInstanceState!=null)
        {
            String s1=savedInstanceState.getString("count");
            if(txt!=null)
            {
                num=Integer.parseInt(s1);
                txt.setText(s1);
            }
        }
    }



    public void count(View view) {



        num++;
        txt.setText(Integer.toString(num));
        Random ran= new Random();
        String colorName = "papa";
        int colorResourceName = getResources().getIdentifier(colorName,"color", getApplicationContext().getPackageName());
        int colorres=getResources().getColor(colorResourceName);
        b1.setBackgroundColor(colorres);
        String colorName1 = "grey";
        int colorResourceName1 = getResources().getIdentifier(colorName1,"color", getApplicationContext().getPackageName());
        int colorres2=getResources().getColor(colorResourceName1);
        b2.setBackgroundColor(colorres2);





    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        a=num;
        res=Integer.toString(num);
        outState.putString("count", res);

    }

    public void toast(View view) {
        Toast a=Toast.makeText(this,"TOAST",Toast.LENGTH_LONG);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void zero(View view) {
        String colorName = "grey";
        int colorResourceName = getResources().getIdentifier(colorName,"color", getApplicationContext().getPackageName());
        int colorres=getResources().getColor(colorResourceName);
        b1.setBackgroundColor(colorres);
        String colorName1 = "papa";
        int colorResourceName1 = getResources().getIdentifier(colorName1,"color", getApplicationContext().getPackageName());
        int colorres2=getResources().getColor(colorResourceName1);
        b2.setBackgroundColor(colorres2);
        num=0;
        txt.setText(String.valueOf(num));
    }


}