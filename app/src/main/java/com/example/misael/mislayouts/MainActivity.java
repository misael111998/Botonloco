package com.example.misael.mislayouts;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.util.Log;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    TextView lbl1;
    int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn);
        lbl1=findViewById(R.id.lbl1);


        View.OnClickListener clickbtn=new View.OnClickListener(){
            @Override
            public void onClick(View v){
                contador++;
                lbl1.setText(String.valueOf(contador));
            }
        };
        btn1.setOnClickListener(clickbtn);
        /**/
        new CountDownTimer(20000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                FrameLayout.LayoutParams lp=new FrameLayout.LayoutParams(-2,-2);
                lp.gravity=Gravity.CENTER;
                btn1.setLayoutParams(lp);
                Random aleatorio =new Random();
                int x= aleatorio.nextInt(9)+1;
                Log.i("num",String.valueOf(x));
                switch (x){
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
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this,"Se terminó",Toast.LENGTH_LONG).show();
            }
        }.start();
    }
}
