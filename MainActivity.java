package com.example.sravanreddy.d20roll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String inputString="";
    String output="";
    int loopValue;
    int rMax=0;
   int values[];
    int result=0;
    boolean dPressed=false;
    private Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,d4,d6,d8,d12,d20,d10,clear,roll;
    private TextView tv, outputtext,resultString;
    Random rand=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tv=(TextView)this.findViewById(R.id.textView10);
        this.button0=(Button)this.findViewById(R.id.button0);
        this.button1=(Button)this.findViewById(R.id.button1);
        this.button2=(Button)this.findViewById(R.id.button2);
        this.button3=(Button)this.findViewById(R.id.button3);
        this.button4=(Button)this.findViewById(R.id.button4);
        this.button5=(Button)this.findViewById(R.id.button5);
        this.button6=(Button)this.findViewById(R.id.button6);
        this.button7=(Button)this.findViewById(R.id.button7);
        this.button8=(Button)this.findViewById(R.id.button8);
        this.button9=(Button)this.findViewById(R.id.button9);
        this.d4=(Button)this.findViewById(R.id.d4);
        this.d6=(Button)this.findViewById(R.id.d6);
        this.d8=(Button)this.findViewById(R.id.d8);
        this.d12=(Button)this.findViewById(R.id.d12);
        this.d20=(Button)this.findViewById(R.id.d20);
        this.d10=(Button)this.findViewById(R.id.d10);
        this.clear=(Button)this.findViewById(R.id.clear);
        this.roll=(Button)this.findViewById(R.id.rollButton);
        this.outputtext = (TextView)this.findViewById(R.id.textView8);
        this.resultString=(TextView)this.findViewById(R.id.textView9);
    }

    public void buttonPressed(View sender)
    {
        if(sender==this.button0)
        {
           inputString=inputString+"0";
            this.tv.setText(inputString);
        }
        else if(sender==this.button1)
        {
            inputString=inputString+"1";
            loopValue=1;
            this.tv.setText(inputString);
        }
        else if(sender==this.button2)
        {
            inputString=inputString+"2";
            loopValue=2;
            this.tv.setText(inputString);
        }
        else if(sender==this.button3)
        {
            inputString=inputString+"3";
            loopValue=3;
            this.tv.setText(inputString);
        }
        else if(sender==this.button4)
        {
            inputString=inputString+"4";
            loopValue=4;
            this.tv.setText(inputString);
        }
       else  if(sender==this.button5)
        {
            inputString=inputString+"5";
            loopValue=5;
            this.tv.setText(inputString);
        }
       else  if(sender==this.button6)
        {
            inputString=inputString+"6";
            loopValue=6;
            this.tv.setText(inputString);
        }
       else  if(sender==this.button7)
        {
            inputString=inputString+"7";
            loopValue=7;
            this.tv.setText(inputString);
        }
        else if(sender==this.button8)
        {
            inputString=inputString+"8";
            loopValue=8;
            this.tv.setText(inputString);
        }
        else if(sender==this.button9)
        {
            inputString=inputString+"9";
            loopValue=9;
            this.tv.setText(inputString);
        }

        if(sender==this.clear)
        {inputString="";
            output="";
            this.tv.setText(inputString);
            this.outputtext.setText(output);
            result=0;
            this.resultString.setText("");

        }
        if(sender==this.d4)
        {
            inputString=inputString+"D4";
            rMax=4;
            this.tv.setText(inputString);
            inputString="";
            dPressed=true;
        }
        else if(sender==this.d6)
        {
            inputString=inputString+"D6";
            rMax=6;
            this.tv.setText(inputString);
            inputString="";
            dPressed=true;
        }
        else if(sender==this.d8)
        {
            inputString=inputString+"D8";
            rMax=8;
            this.tv.setText(inputString);
            inputString="";
            dPressed=true;
        }
        else if(sender==this.d10)
        {
            inputString=inputString+"D10";
            rMax=10;
            this.tv.setText(inputString);
            inputString="";
            dPressed=true;
        }
        else if(sender==this.d12)
        {
            inputString=inputString+"D12";
            this.rMax=12;
            this.tv.setText(inputString);
            inputString="";
            dPressed=true;
        }
        else if(sender==this.d20)
        {
            inputString=inputString+"D20";
            this.rMax=20;
            this.tv.setText(inputString);
            inputString="";
            dPressed=true;
        }

        if(sender==this.roll)
        {
            if(dPressed==false)
            {
                this.outputtext.setText("Please select number of dimensions");
                this.resultString.setText("");
            }
            else {
                this.values = new int[loopValue];
                for (int i = 0; i < loopValue; i++) {
                    values[i] = rand.nextInt(rMax) + 1;
                    if (i == loopValue - 1) {
                        output = output + values[i];
                    } else {
                        output = output + values[i];
                        output = output + " + ";
                    }
                }
                for (int i = 0; i < loopValue; i++) {
                    this.result = this.result + values[i];
                }
                this.outputtext.setText(output);
                this.resultString.setText(Integer.toString(result));
            }
        }

    }

    }
