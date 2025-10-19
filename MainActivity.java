package usman.l1f21bscs0840.iphonecalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


String currentInput="";
double number1=0;
String operator="";

Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMinus,btnEqual,btnMultiply,btnDivide,btnDot,btnOperatorChanger,btnMod,btnClear;
EditText editTextResults;

@Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

        editTextResults=findViewById(R.id.editTextResult);
        btnPlus=findViewById(R.id.btnplus);
        btnMinus=findViewById(R.id.btnMinus);
        btnEqual=findViewById(R.id.btnequal);
        btnDivide=findViewById(R.id.btnDivide);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDot=findViewById(R.id.btndot);
        btnMod=findViewById(R.id.btnMod);
        btnOperatorChanger=findViewById(R.id.btnOperatorChanger);
        btnClear=findViewById(R.id.btnClear);

        btn0.setOnClickListener(v->{
            currentInput+="0";
            editTextResults.setText(currentInput);
        });
        btn1.setOnClickListener(v->{
            currentInput+="1";
            editTextResults.setText(currentInput);
        });

         btn2.setOnClickListener(v->{
            currentInput+="2";
            editTextResults.setText(currentInput);
        });

        btn3.setOnClickListener(v->{
            currentInput+="3";
            editTextResults.setText(currentInput);
        });

        btn4.setOnClickListener(v->{
            currentInput+="4";
            editTextResults.setText(currentInput);
        });

        btn5.setOnClickListener(v->{
            currentInput+="5";
            editTextResults.setText(currentInput);
        });

        btn6.setOnClickListener(v->{
            currentInput+="6";
            editTextResults.setText(currentInput);
        });

        btn7.setOnClickListener(v->{
            currentInput+="7";
            editTextResults.setText(currentInput);
        });

        btn8.setOnClickListener(v->{
            currentInput+="8";
            editTextResults.setText(currentInput);
        });

        btn9.setOnClickListener(v->{
            currentInput+="9";
            editTextResults.setText(currentInput);
        });

        btnDot.setOnClickListener(v->{
           if(!currentInput.contains(".")){
               if(currentInput.isEmpty()){
                   currentInput="0.";
               } else {
                   currentInput+=".";
               }
               editTextResults.setText(currentInput);
           }
    });

        btnPlus.setOnClickListener(v->{
            number1 = Double.parseDouble(currentInput);
            editTextResults.setText(currentInput);
            operator="+";
            currentInput="";
        });


        btnMinus.setOnClickListener(v->{
            number1 = Double.parseDouble(currentInput);
            editTextResults.setText(currentInput);
            operator="-";
            currentInput="";
        });

        btnMultiply.setOnClickListener(v->{
            number1 = Double.parseDouble(currentInput);
            editTextResults.setText(currentInput);
            operator="*";
            currentInput="";
        });

        btnDivide.setOnClickListener(v->{
            number1 = Double.parseDouble(currentInput);
            editTextResults.setText(currentInput);
            operator="/";
            currentInput="";
        });

        btnMod.setOnClickListener(v->{
            number1 = Double.parseDouble(currentInput);
            editTextResults.setText(currentInput);
            operator="%";
            currentInput="";
        });

        btnEqual.setOnClickListener(v->{
            double number2 = Double.parseDouble(currentInput);
            double result=0;
            if(operator.equals("+")){
                result=number1+number2;
            }else if(operator.equals("-")){
                result=number1-number2;
            } else if(operator.equals("*")){
            result=number1*number2;
            }else if(operator.equals("/")){
                result=number1/number2;
            }else if(operator.equals("%")){
                result=number1%number2;


            editTextResults.setText(String.valueOf(result));
            currentInput = String.valueOf(result);
        });

}

}
