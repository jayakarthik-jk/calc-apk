package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity //implements View.OnFocusChangeListener
{

    private EditText editText;
    private String data;    //Variable Used in the click() method below
    private Expression expression;
    private RelativeLayout one, two, three, four, five, six, seven, eight, nine, zero,
    add, minus, multiply, divide, modulo, dot, clear, delete, equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);



        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        dot = findViewById(R.id.dot);
        add = findViewById(R.id.add);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        modulo = findViewById(R.id.modulo);
        equal = findViewById(R.id.equal);
        clear = findViewById(R.id.clear);
        delete = findViewById(R.id.delete);

        
//        one.setOnFocusChangeListener(this);
//        two.setOnFocusChangeListener(this);
//        three.setOnFocusChangeListener(this);
//        four.setOnFocusChangeListener(this);
//        five.setOnFocusChangeListener(this);
//        six.setOnFocusChangeListener(this);
//        seven.setOnFocusChangeListener(this);
//        eight.setOnFocusChangeListener(this);
//        nine.setOnFocusChangeListener(this);
//        zero.setOnFocusChangeListener(this);
//        add.setOnFocusChangeListener(this);
//        minus.setOnFocusChangeListener(this);
//        multiply.setOnFocusChangeListener(this);
//        divide.setOnFocusChangeListener(this);
//        modulo.setOnFocusChangeListener(this);
//        clear.setOnFocusChangeListener(this);
//        delete.setOnFocusChangeListener(this);
//        equal.setOnFocusChangeListener(this);
//        dot.setOnFocusChangeListener(this);
//
//


    }

    public void click(View view) {
        switch (view.getId()){
            case R.id.one:
                editText.setText(editText.getText().toString() + 1);
                break;
            case R.id.two:
                editText.setText(editText.getText().toString() + 2);
                break;
            case R.id.three:
                editText.setText(editText.getText().toString() + 3);
                break;
            case R.id.four:
                editText.setText(editText.getText().toString() + 4);
                break;
            case R.id.five:
                editText.setText(editText.getText().toString() + 5);
                break;
            case R.id.six:
                editText.setText(editText.getText().toString() + 6);
                break;
            case R.id.seven:
                editText.setText(editText.getText().toString() + 7);
                break;
            case R.id.eight:
                editText.setText(editText.getText().toString() + 8);
                break;
            case R.id.nine:
                editText.setText(editText.getText().toString() + 9);
                break;
            case R.id.zero:
                editText.setText(editText.getText().toString() + 0);
                break;
            case R.id.dot:
                editText.setText(editText.getText().toString() + ".");
                break;
            case R.id.add:
                editText.setText(editText.getText().toString() + "+");
                break;
            case R.id.minus:
                editText.setText(editText.getText().toString() + "-");
                break;
            case R.id.multiply:
                editText.setText(editText.getText().toString() + "*");
                break;
            case R.id.divide:
                editText.setText(editText.getText().toString() + "/");
                break;
            case R.id.modulo:
                editText.setText(editText.getText().toString() + "%");
                break;
            case R.id.clear:
                editText.setText(R.string.empty);
                break;
            case R.id.delete:
                try {
                    data = editText.getText().toString();
                    editText.setText(
                            data.substring(0,data.length()-1)
                    );
                }catch (Exception e){
                    Toast.makeText(this, "Nothing to clear", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.equal:
                try {
                    expression = new ExpressionBuilder(editText.getText().toString()).build();
                    editText.setText(expression.evaluate()+"");
                }catch (Exception e){
                    Toast.makeText(this, R.string.invalid , Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
//
//    @Override
//    public void onFocusChange(View view, boolean b) {
//        view.setBackgroundColor(getResources().getColor(R.color.red,getTheme()));
//    }
}