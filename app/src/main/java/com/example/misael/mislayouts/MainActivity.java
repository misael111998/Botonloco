package com.example.misael.mislayouts;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                FrameLayout.LayoutParams lp= new FrameLayout.LayoutParams(-2,-2);


                Random rdm= new Random();
                int n=rdm.nextInt(9)+1;
                switch (n){
                    case 1:{
                        lp.gravity= Gravity.TOP|Gravity.LEFT;
                    }break;
                    case 2:{
                        lp.gravity= Gravity.TOP|Gravity.CENTER;
                    }break;
                    case 3:{
                        lp.gravity= Gravity.TOP|Gravity.RIGHT;
                    }break;
                    case 4:{
                        lp.gravity= Gravity.CENTER|Gravity.LEFT;
                    }break;
                    case 5:{
                        lp.gravity= Gravity.CENTER|Gravity.CENTER;
                    }break;
                    case 6:{
                        lp.gravity= Gravity.CENTER|Gravity.RIGHT;
                    }break;
                    case 7:{
                        lp.gravity= Gravity.BOTTOM|Gravity.LEFT;
                    }break;
                    case 8:{
                        lp.gravity= Gravity.BOTTOM|Gravity.CENTER;
                    }break;
                    case 9:{
                        lp.gravity= Gravity.BOTTOM|Gravity.RIGHT;
                    }break;
                }



                btn1.setLayoutParams(lp);
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}
