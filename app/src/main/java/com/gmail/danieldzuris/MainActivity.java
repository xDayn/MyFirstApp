package com.gmail.danieldzuris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnTFi = (Button) findViewById(R.id.btnTFi);
        btnTFi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText dmgNum = (EditText) findViewById(R.id.dmgNum);
                EditText tierNum = (EditText) findViewById(R.id.tierNum);
                EditText dstrNum = (EditText) findViewById(R.id.dstrNum);
                TextView resNum = (TextView) findViewById(R.id.resNum);
                double TFi = 0, tKoef, tDmg, aDmg, kKoef, dKoef, aKoef, eKoef;

                int dmg = Integer.parseInt(dmgNum.getText().toString());
                int tier = Integer.parseInt(tierNum.getText().toString());
                int dstr = Integer.parseInt(dstrNum.getText().toString());

                if(dstr <= 5)   {
                    kKoef = dstr * 0.2;
                } else if(dstr == 6) {
                    kKoef = 1.5;
                } else {
                    kKoef = 2;
                }

                switch(tier) {
                    case 5:
                        tKoef = 0.6;
                        tDmg = 1000;
                        aDmg = 640;

                        if(dmg >= 3000) {
                            eKoef = 1;
                        }   else {
                            eKoef = 0;
                        }
                        dKoef = dmg / tDmg;
                        aKoef = aDmg / dmg;
                        TFi = dKoef + tKoef - aKoef + kKoef + eKoef;
                        break;


                    case 6:
                        tKoef = 0.8;
                        tDmg = 1500;
                        aDmg = 820;

                        if(dmg >= 3500) {
                            eKoef = 1;
                        }   else {
                            eKoef = 0;
                        }
                        dKoef = dmg / tDmg;
                        aKoef = aDmg / dmg;
                        TFi = dKoef + tKoef - aKoef + kKoef + eKoef;
                        break;


                    case 7:
                        tKoef = 1;
                        tDmg = 2000;
                        aDmg = 1060;

                        if(dmg >= 4000) {
                            eKoef = 1;
                        }   else {
                            eKoef = 0;
                        }
                        dKoef = dmg / tDmg;
                        aKoef = aDmg / dmg;
                        TFi = dKoef + tKoef - aKoef + kKoef + eKoef;
                        break;


                    case 8:
                        tKoef = 1.2;
                        tDmg = 2500;
                        aDmg = 1250;

                        if(dmg >= 4500) {
                            eKoef = 1;
                        }   else {
                            eKoef = 0;
                        }
                        dKoef = dmg / tDmg;
                        aKoef = aDmg / dmg;
                        TFi = dKoef + tKoef - aKoef + kKoef + eKoef;
                        break;


                    case 9:
                        tKoef = 1.4;
                        tDmg = 3000;
                        aDmg = 1600;

                        if(dmg >= 5000) {
                            eKoef = 1;
                        }   else {
                            eKoef = 0;
                        }
                        dKoef = dmg / tDmg;
                        aKoef = aDmg / dmg;
                        TFi = dKoef + tKoef - aKoef + kKoef + eKoef;
                        break;


                    case 10:
                        tKoef = 1.5;
                        tDmg = 3500;
                        aDmg = 1900;

                        if(dmg >= 5500) {
                            eKoef = 1;
                        }   else {
                            eKoef = 0;
                        }
                        dKoef = dmg / tDmg;
                        aKoef = aDmg / dmg;
                        TFi = dKoef + tKoef - aKoef + kKoef + eKoef;
                        break;
                }
                TFi = TFi*1000;
                TFi = Math.round(TFi);
                TFi = TFi/1000;
                resNum.setText(String.valueOf(TFi));
            }
        });
    }
}
