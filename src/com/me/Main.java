package com.me;

import k.l.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btPlus = (Button) findViewById(R.id.buttonPlus);
        Button btMinus = (Button) findViewById(R.id.buttonMinus);
        Button btMultiply = (Button) findViewById(R.id.buttonMultiply);
        Button btDivide = (Button) findViewById(R.id.buttondivide);
        
        btPlus.setOnClickListener(this);
        btMinus.setOnClickListener(this);
        btMultiply.setOnClickListener(this);
        btDivide.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		EditText etFirstNumber = (EditText) findViewById(R.id.editTextFirstNumber);
        EditText etSecondNumber = (EditText) findViewById(R.id.editTextSecondNumber);
        EditText etResult = (EditText) findViewById(R.id.editTextResult);
        int firstNumber = 0;
        int secondNumber = 0;
        int result = 0;
		
        switch (v.getId()) {
		case R.id.buttonPlus:
			firstNumber = Integer.parseInt(etFirstNumber.getText().toString());
			secondNumber = Integer.parseInt(etSecondNumber.getText().toString());
			result = firstNumber + secondNumber;
			etResult.setText(String.valueOf(result));
			break;
			
		case R.id.buttonMinus:
			firstNumber = Integer.parseInt(etFirstNumber.getText().toString());
			secondNumber = Integer.parseInt(etSecondNumber.getText().toString());
			result = firstNumber - secondNumber;
			etResult.setText(String.valueOf(result));
			break;
			
		case R.id.buttonMultiply:
			firstNumber = Integer.parseInt(etFirstNumber.getText().toString());
			secondNumber = Integer.parseInt(etSecondNumber.getText().toString());
			result = firstNumber * secondNumber;
			etResult.setText(String.valueOf(result));
			break;
	
		case R.id.buttondivide:
			firstNumber = Integer.parseInt(etFirstNumber.getText().toString());
			secondNumber = Integer.parseInt(etSecondNumber.getText().toString());
			result = firstNumber / secondNumber;
			etResult.setText(String.valueOf(result));
			break;

		default:
			break;
		}
		
	}
}