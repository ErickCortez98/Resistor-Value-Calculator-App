package com.resistance1.erickcortez.resistancecalculator;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {
    Button buttonFirstNumber;
    Button buttonSecondNumber;
    Button buttonMultiplier;
    Button buttonTolerance;
    String firstNumber = "0";
    String secondNumber = "0";
    String tolerance = "";
    int multiplier = 1;
    TextView resultTextView;
    ImageView firstBandImage;
    ImageView secondBandImage;
    ImageView thirdBandImage;
    ImageView fourthBandImage;
    int width;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextView = (TextView) findViewById(R.id.resultTextView5);
        buttonFirstNumber = (Button) findViewById(R.id.button);
        buttonSecondNumber = (Button) findViewById(R.id.button1);
        buttonMultiplier = (Button) findViewById(R.id.button2);
        buttonTolerance = (Button) findViewById(R.id.button3);
        firstBandImage = (ImageView) findViewById(R.id.blackfirstLine);
        secondBandImage = (ImageView) findViewById(R.id.blacksecondLine);
        thirdBandImage = (ImageView) findViewById(R.id.thirdLine);
        fourthBandImage = (ImageView) findViewById(R.id.fourthLine);
        WindowManager wm = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        width = metrics.widthPixels;
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
    public void firstNumber (View view){
        buttonFirstNumber.setAlpha(1f);
        buttonFirstNumber = null;
        firstBandImage.setVisibility(View.INVISIBLE);
        firstBandImage = null;
        buttonFirstNumber = (Button) view;
        buttonFirstNumber.setAlpha(0.5f);
        firstNumber = (String) buttonFirstNumber.getText();
        calculateTotal();
        setColorFirstBand();

    }
    public void setColorFirstBand(){
        ColorDrawable btnColor = (ColorDrawable) buttonFirstNumber.getBackground();
        switch (btnColor.getColor()){
            case 0xff000000:
                firstBandImage = (ImageView) findViewById(R.id.blackfirstLine);
                firstBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFF835C3B:
                firstBandImage = (ImageView) findViewById(R.id.brownfirstLine);
                firstBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFFF4444:
                firstBandImage = (ImageView) findViewById(R.id.redfirstLine);
                firstBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFFF8800:
                firstBandImage = (ImageView) findViewById(R.id.orangefirstLine);
                firstBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFFFEB53:
                firstBandImage = (ImageView) findViewById(R.id.yellowfirstLine);
                firstBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFF669900:
                firstBandImage = (ImageView) findViewById(R.id.greenfirstLine);
                firstBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFF303F9F:
                firstBandImage = (ImageView) findViewById(R.id.bluefirstLine);
                firstBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFAA66CC:
                firstBandImage = (ImageView) findViewById(R.id.violetfirstLine);
                firstBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFF808080:
                firstBandImage = (ImageView) findViewById(R.id.grayfirstLine);
                firstBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFFFFFFF:
                firstBandImage = (ImageView) findViewById(R.id.whitefirstLine);
                firstBandImage.setVisibility(View.VISIBLE);
                break;

        }
    }
    public void secondNumber (View view){
        buttonSecondNumber.setAlpha(1f);
        buttonSecondNumber = null;
        secondBandImage.setVisibility(View.INVISIBLE);
        secondBandImage = null;
        buttonSecondNumber = (Button) view;
        buttonSecondNumber.setAlpha(0.5f);
        secondNumber = (String) buttonSecondNumber.getText();
        calculateTotal();
        setColorSecondBand();
    }
    public void setColorSecondBand(){
        ColorDrawable btnColor = (ColorDrawable) buttonSecondNumber.getBackground();
        switch (btnColor.getColor()){
            case 0xff000000:
                secondBandImage = (ImageView) findViewById(R.id.blacksecondLine);
                secondBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFF835C3B:
                secondBandImage = (ImageView) findViewById(R.id.brownsecondLine);
                secondBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFFF4444:
                secondBandImage = (ImageView) findViewById(R.id.redsecondLine);
                secondBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFFF8800:
                secondBandImage = (ImageView) findViewById(R.id.orangesecondLine);
                secondBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFFFEB53:
                secondBandImage = (ImageView) findViewById(R.id.yellowsecondLine);
                secondBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFF669900:
                secondBandImage = (ImageView) findViewById(R.id.greensecondLine);
                secondBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFF303F9F:
                secondBandImage = (ImageView) findViewById(R.id.bluesecondLine);
                secondBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFAA66CC:
                secondBandImage = (ImageView) findViewById(R.id.violetsecondLine);
                secondBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFF808080:
                secondBandImage = (ImageView) findViewById(R.id.graysecondLine);
                secondBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFFFFFFF:
                secondBandImage = (ImageView) findViewById(R.id.whitesecondLine);
                secondBandImage.setVisibility(View.VISIBLE);
                break;

        }
    }
    public void setMultiplier (View view){
        buttonMultiplier.setAlpha(1f);
        buttonMultiplier = null;
        thirdBandImage.setVisibility(View.INVISIBLE);
        thirdBandImage.setImageResource(R.drawable.blacksecondline);
        buttonMultiplier = (Button) view;
        buttonMultiplier.setAlpha(0.5f);
        multiplier = Integer.parseInt((String) buttonMultiplier.getTag());
        calculateTotal();
        setColorMultiplier();
    }
    public void setColorMultiplier (){
        double trans;
        ImageView resistorView = (ImageView) findViewById(R.id.resistorView);
        trans = resistorView.getWidth()*0.08;
        /*if(width >= 600 && width < 800){
            trans = 50;
        }else if (width >= 800 && width < 1300){
            trans = 90;
        }else if(width <= 300){
            trans = 20;
        }else if(width >= 1300 && width < 1500){
            trans = 110;
        }else if (width >= 1500&&  width < 1800){
            trans = 120;
        }else if(width>=1800){
            trans = 250;
        }
        else {
            trans = 30;
        }*/
        ColorDrawable btnColor = (ColorDrawable) buttonMultiplier.getBackground();
        switch (btnColor.getColor()){
            case 0xff000000:
                thirdBandImage.setImageResource(R.drawable.blacksecondline);
                thirdBandImage.setTranslationX((float )trans);
                thirdBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFF835C3B:
                thirdBandImage.setImageResource(R.drawable.brownsecondline);
                thirdBandImage.setTranslationX((float )trans);
                thirdBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFFF4444:
                thirdBandImage.setImageResource(R.drawable.redsecondline);
                thirdBandImage.setTranslationX((float )trans);
                thirdBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFFF8800:
                thirdBandImage.setImageResource(R.drawable.orangesecondline);
                thirdBandImage.setTranslationX((float )trans);
                thirdBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFFFEB53:
                thirdBandImage.setImageResource(R.drawable.yellowsecondline);
                thirdBandImage.setTranslationX((float )trans);
                thirdBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFF669900:
                thirdBandImage.setImageResource(R.drawable.greensecondline);
                thirdBandImage.setTranslationX((float )trans);
                thirdBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFF303F9F:
                thirdBandImage.setImageResource(R.drawable.bluesecondline);
                thirdBandImage.setTranslationX((float )trans);
                thirdBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFAA66CC:
                thirdBandImage.setImageResource(R.drawable.violetsecondline);
                thirdBandImage.setTranslationX((float )trans);
                thirdBandImage.setVisibility(View.VISIBLE);
                break;
            case 0xFFDAA520:
                thirdBandImage.setTranslationX(0);
                thirdBandImage.setImageResource(R.drawable.goldensecondline);
                thirdBandImage.setVisibility(View.VISIBLE);
                break;
            case 0xFFC0C0C0:
                thirdBandImage.setTranslationX(0);
                thirdBandImage.setImageResource(R.drawable.silverthirdline);
                thirdBandImage.setVisibility(View.VISIBLE);
                break;

        }

    }
    public void setTolerance(View view){
        buttonTolerance.setAlpha(1f);
        buttonTolerance = null;
        buttonTolerance = (Button) view;
        buttonTolerance.setAlpha(0.5f);
        tolerance = (String) buttonTolerance.getText();
        calculateTotal();
        setColorTolerance();
    }
    public void setColorTolerance(){
        double trans;
        ImageView resistorView = (ImageView) findViewById(R.id.resistorView);
        trans = resistorView.getWidth()*0.38;
        /*if(width >= 600 && width < 800){
            //Factor of 3.7 roughly actually more on some
            //this one ready apparently
            if(width == 600){
                trans = 190;
            }else {
            trans = 255;
            }
        }else if (width >= 800 && width < 1300){
            trans = 385;
        }else if(width <= 300){
            trans = 80;
        }else if(width >= 1300 && width < 1500){
            trans = 515;
        }else if (width >= 1500&&  width < 1800){
            //This one apparently working too
            trans = 440;
        }else if(width>=1800){
            //Because there is only one device with that width it seems good on it
            trans = 600;
        } else if (width >= 300 && width <= 350 ){
            //For the device with 320 is ready
            trans = 115;
        }else {
            trans= 170;
        }*/

        ColorDrawable btnColor = (ColorDrawable) buttonTolerance.getBackground();
        switch (btnColor.getColor()){
            case  0xFF835C3B:
                fourthBandImage.setImageResource(R.drawable.firstlinetwo);
                fourthBandImage.setTranslationX((float) trans);
                fourthBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFFF4444:
                fourthBandImage.setImageResource(R.drawable.redfirstline);
                fourthBandImage.setTranslationX((float)trans);
                fourthBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFF669900:
                fourthBandImage.setImageResource(R.drawable.greenfirstline);
                fourthBandImage.setTranslationX((float)trans);
                fourthBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFF303F9F:
                fourthBandImage.setImageResource(R.drawable.bluefirstline);
                fourthBandImage.setTranslationX((float)trans);
                fourthBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFFAA66CC:
                fourthBandImage.setImageResource(R.drawable.violetfirstline);
                fourthBandImage.setTranslationX((float)trans);
                fourthBandImage.setVisibility(View.VISIBLE);
                break;
            case  0xFF808080:
                fourthBandImage.setImageResource(R.drawable.grayfirstline);
                fourthBandImage.setTranslationX((float)trans);
                fourthBandImage.setVisibility(View.VISIBLE);
                break;
            case 0xFFDAA520:
                fourthBandImage.setTranslationX(0);
                fourthBandImage.setImageResource(R.drawable.goldenlastline);
                fourthBandImage.setVisibility(View.VISIBLE);
                break;
            case 0xFFC0C0C0:
                fourthBandImage.setTranslationX(0);
                fourthBandImage.setImageResource(R.drawable.silverlastline);
                fourthBandImage.setVisibility(View.VISIBLE);
                break;
        }

    }
    public void calculateTotal(){
        String totalTwo = firstNumber + secondNumber;
        int totalIntTwo = Integer.parseInt(totalTwo);
        String total;
        if(multiplier == 21){
            double multiplierDouble = 0.1;
            double totalInt = totalIntTwo * multiplierDouble;
            total = Double.toString(totalInt);
        }else if(multiplier ==201){
            double multiplierDouble = 0.01;
            double totalInt = totalIntTwo * multiplierDouble;
            total = Double.toString(totalInt);
        }else {
            int totalInt = totalIntTwo * multiplier;
            total = Integer.toString(totalInt);
            if (total.length() == 4 && total.substring(1,2) == "0"){
                total = total.substring(0,1) + "K";
            }else if(total.length() == 4 && total.substring(1,2) != "0"){
                total = total.substring(0,1) + "K" + total.substring(1,2);
            }else if(total.length()== 5 ){
                total = total.substring(0,2) + "K";
            }else if(total.length()== 6 ){
                total = total.substring(0,3) + "K";
            }else if(total.length()== 7 && total.substring(1,2) != "0"){
                total = total.substring(0,1) + "M" + total.substring(1,2);
            }else if(total.length()== 7 && total.substring(1,2) == "0"){
                total = total.substring(0,1) + "M";
            }else if(total.length()== 8){
                total = total.substring(0,2) + "M";
            }else if (total.length() == 9){
                total = total.substring(0,3) + "M";
            }
        }
        if (total.length() > 5){
            total = total.substring(0,4);
        }
        resultTextView.setText(total + "Ω" + " " + tolerance);
    }
    public void fiveBandResistor (View view){
        Intent intent1 = new Intent(MainActivity.this,BandResistor5.class);
        startActivity(intent1);
    }
}
