package com.linhnguyen.calculatorop;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorOp extends Activity {
	EditText edtResult;
	Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix,
			btnSeven, btnEight, btnNine, btnAdd, btnSub, btnMul, btnDiv,
			btnEqual, btnDel;

	int op = 0;
	int result = 0;
	int mem = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator_op);

		edtResult = (EditText) findViewById(R.id.edtResult);
		btnZero = (Button) findViewById(R.id.btnZero);
		btnOne = (Button) findViewById(R.id.btnOne);
		btnTwo = (Button) findViewById(R.id.btnTwo);
		btnThree = (Button) findViewById(R.id.btnThree);
		btnFour = (Button) findViewById(R.id.btnFour);
		btnFive = (Button) findViewById(R.id.btnFive);
		btnSix = (Button) findViewById(R.id.btnSix);
		btnSeven = (Button) findViewById(R.id.btnSeven);
		btnEight = (Button) findViewById(R.id.btnEight);
		btnNine = (Button) findViewById(R.id.btnNine);
		btnAdd = (Button) findViewById(R.id.btnAdd);
		btnSub = (Button) findViewById(R.id.btnSub);
		btnMul = (Button) findViewById(R.id.btnMul);
		btnDiv = (Button) findViewById(R.id.btnDiv);
		btnEqual = (Button) findViewById(R.id.btnEqual);
		btnDel = (Button) findViewById(R.id.btnDel);
		btnZero.setOnClickListener(myClick);
		btnOne.setOnClickListener(myClick);
		btnTwo.setOnClickListener(myClick);
		btnThree.setOnClickListener(myClick);
		btnFour.setOnClickListener(myClick);
		btnFive.setOnClickListener(myClick);
		btnSix.setOnClickListener(myClick);
		btnSeven.setOnClickListener(myClick);
		btnEight.setOnClickListener(myClick);
		btnNine.setOnClickListener(myClick);
		btnAdd.setOnClickListener(myClick);
		btnSub.setOnClickListener(myClick);
		btnMul.setOnClickListener(myClick);
		btnDiv.setOnClickListener(myClick);
		btnEqual.setOnClickListener(myClick);
		btnDel.setOnClickListener(myClick);

	}

	OnClickListener myClick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			Editable editable = edtResult.getText();
			switch (v.getId()) {
			case R.id.btnZero:

				break;
			case R.id.btnOne:

				break;
			case R.id.btnTwo:

				break;
			case R.id.btnThree:

				break;
			case R.id.btnFour:

				break;
			case R.id.btnFive:

				break;
			case R.id.btnSix:

				break;
			case R.id.btnSeven:

				break;
			case R.id.btnEight:

				break;
			case R.id.btnNine:

				break;
			case R.id.btnAdd:

				break;
			case R.id.btnSub:

				break;
			case R.id.btnMul:

				break;
			case R.id.btnDiv:

				break;
			case R.id.btnDel:

				break;
			case R.id.btnEqual:
				// gan mem = 0;
				break;

			default:
				break;
			}
		}
	};

	public int numberClick(int number) {
		return number;
	}

	public void backSpace() {

	}

	public void theOperator() {

	}

	public void showResult() {

	}

}
