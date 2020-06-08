package com.example.calculadorapro;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public EditText pantalla;
    public double ope1, ope2, res;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla=(EditText)findViewById(R.id.tw);
    }

    public void bt0 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"0";
        pantalla.setText(cap);
    }

    public void bt1 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"1";
        pantalla.setText(cap);
    }

    public void bt2 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"2";
        pantalla.setText(cap);
    }

    public void bt3 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"3";
        pantalla.setText(cap);
    }

    public void bt4 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"4";
        pantalla.setText(cap);
    }

    public void bt5 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"5";
        pantalla.setText(cap);
    }

    public void bt6 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"6";
        pantalla.setText(cap);
    }

    public void bt7 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"7";
        pantalla.setText(cap);
    }

    public void bt8 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"8";
        pantalla.setText(cap);
    }

    public void bt9 (View v){
        String cap=pantalla.getText().toString();
        cap=cap+"9";
        pantalla.setText(cap);
    }

    public void btpunto (View v){
        String cap=pantalla.getText().toString();
        cap=cap+".";
        pantalla.setText(cap);
    }

    public void btsuma (View v){
        try{
            String aux1= pantalla.getText().toString();
            ope1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pantalla.setText("");
        ope=1;
    }

    public void btresta (View v){
        try{
            String aux1= pantalla.getText().toString();
            ope1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pantalla.setText("");
        ope=2;
    }

    public void btmulti (View v){
        try{
            String aux1= pantalla.getText().toString();
            ope1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pantalla.setText("");
        ope=3;
    }

    public void btdiv (View v){
        try{
            String aux1= pantalla.getText().toString();
            ope1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pantalla.setText("");
        ope=4;
    }

    public void btsin (View v){
        try{ String aux1= pantalla.getText().toString();
            ope1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pantalla.setText("Sin (" +ope1+")");
        ope=5;
    }


    public void btcos (View v){
        try{
            String aux1= pantalla.getText().toString();
            ope1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pantalla.setText("Cos (" +ope1+")");
        ope=6;
    }


    public void bttan (View v){
        try{ String aux1= pantalla.getText().toString();
            ope1= Double.parseDouble(aux1);
        }catch(NumberFormatException nfe){};
        pantalla.setText("Tan (" +ope1+")");
        ope=7;

    }

    public void btigual (View v){
        try{
            String aux2= pantalla.getText().toString();
            ope2= Double.parseDouble(aux2);
        }catch(NumberFormatException nfe){};
        pantalla.setText("");

        if (ope==1){
            res=ope1+ope2;

        }else if (ope==2){
            res=ope1-ope2;

        }else if (ope==3){
            res=ope1*ope2;

        }else if (ope==4){
            if(ope2==0){
                pantalla.setText("No existe la división para 0");
            }else{
                res= ope1/ope2;
            }

        }else if(ope==5){
            double angle = (Math.asin(ope1));
            res=Math.toDegrees(angle);

        }else if(ope==6){
            double angle = (Math.acos(ope1));
            res=Math.toDegrees(angle);

        }else if(ope==7){
            double angle = (Math.atan(ope1));
            res=Math.toDegrees(angle);

        }
        pantalla.setText(""+res);
        ope1=res;
    }

    public void bttodo (View v){
        pantalla.setText("");
        ope1=0.0;
        ope2=0.0;
        res=0.0;
    }

    public void btborrar (View v){
        if (!pantalla.getText().toString().equals("")){
            pantalla.setText(pantalla.getText().subSequence(0,pantalla.getText().length()-1)+"");
        }
    }

}