package com.resistance1.erickcortez.resistancecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class BandResistor5 extends AppCompatActivity {
    Button buttonFirstNumber5;
    Button buttonSecondNumber5;
    Button buttonThirdNumber5;
    Button buttonMultiplier5;
    Button buttonTolerance5;
    String firstNumber5 = "0";
    String secondNumber5 = "0";
    String thirdNumber5 = "0";
    String tolerance5 = "";
    int multiplier5 = 1;
    TextView resultTextView;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_band_resistor5);
        resultTextView = (TextView) findViewById(R.id.resultTextView5);
        buttonFirstNumber5 = (Button) findViewById(R.id.button51);
        buttonSecondNumber5 = (Button) findViewById(R.id.button52);
        buttonThirdNumber5 = (Button) findViewById(R.id.button100);
        buttonMultiplier5 = (Button) findViewById(R.id.button53);
        buttonTolerance5 = (Button) findViewById(R.id.button54);
        mAdView = (AdView) findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void firstNumber (View view){
        buttonFirstNumber5.setAlpha(1f);
        buttonFirstNumber5 = null;
        buttonFirstNumber5 = (Button) view;
        buttonFirstNumber5.setAlpha(0.5f);
        firstNumber5 = (String) buttonFirstNumber5.getText();
        calculateTotal();
    }
    public void secondNumber (View view){
        buttonSecondNumber5.setAlpha(1f);
        buttonSecondNumber5 = null;
        buttonSecondNumber5 = (Button) view;
        buttonSecondNumber5.setAlpha(0.5f);
        secondNumber5 = (String) buttonSecondNumber5.getText();
        calculateTotal();
    }
    public void thirdNumber(View view){
        buttonThirdNumber5.setAlpha(1f);
        buttonThirdNumber5 = null;
        buttonThirdNumber5 = (Button) view;
        buttonThirdNumber5.setAlpha(0.5f);
        thirdNumber5 = (String) buttonThirdNumber5.getText();
        calculateTotal();
    }
    public void setMultiplier (View view){
        buttonMultiplier5.setAlpha(1f);
        buttonMultiplier5 = null;
        buttonMultiplier5 = (Button) view;
        buttonMultiplier5.setAlpha(0.5f);
        multiplier5 = Integer.parseInt((String) buttonMultiplier5.getTag());
        calculateTotal();

    }
    public void setTolerance(View view){
        buttonTolerance5.setAlpha(1f);
        buttonTolerance5 = null;
        buttonTolerance5 = (Button) view;
        buttonTolerance5.setAlpha(0.5f);
        tolerance5 = (String) buttonTolerance5.getText();
        calculateTotal();
    }
    public void calculateTotal(){
        //int totalInt = firstNumber + secondNumber;
        String totalTwo = firstNumber5 + secondNumber5 + thirdNumber5;
        int totalIntTwo = Integer.parseInt(totalTwo);
        String total;
        if(multiplier5 == 21){
            double multiplierDouble = 0.1;
            double totalInt = totalIntTwo * multiplierDouble;
            total = Double.toString(totalInt);
        }else if(multiplier5 ==201){
            double multiplierDouble = 0.01;
            double totalInt = totalIntTwo * multiplierDouble;
            total = Double.toString(totalInt);
        }else if(multiplier5 == 10000000){
            total = firstNumber5 + secondNumber5 + thirdNumber5 + "0" + "M";
        }else {
            int totalInt = totalIntTwo * multiplier5;
            total = Integer.toString(totalInt);
            if(total.length() == 4 ){
                total = total.substring(0,1) + "." + total.substring(1,3) + "K";
            }else if(total.length() == 5){
                total = total.substring(0,2) + "." + total.substring(2,3) + "K";
            }else if(total.length() == 6){
                total = total.substring(0,3) + "K";
            }else if(total.length() == 7){
                total = total.substring(0,1)+ "." + total.substring(1,3) + "M";
            }else if(total.length() == 8){
                total = total.substring(0,2)+ "." + total.substring(2,3) + "M";
            }else if(total.length() == 9){
                total = total.substring(0,3)+ "M";
            }
        }
        if (total.length() > 6){
            total = total.substring(0,5);
        }


        resultTextView.setText(total + "Ω" + " " + tolerance5);
    }
    public void fourBandResistor(View view){
        finish();
    }
}
