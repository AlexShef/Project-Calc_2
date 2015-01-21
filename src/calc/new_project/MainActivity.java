package calc.new_project;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements  OnClickListener{
	
	final int MENU_RESET_ID = 1;
	final int MENU_QUIT_ID = 2;
	
	Button bt_Add;
	Button bt_Sub;
	Button bt_Mul;
	Button bt_Div;
	
	Button bt_Num1;
	
	Button bt_Result;
	
	TextView tv_Result;
	EditText et_Display;
	
	String s = new String();
	
	// Переменные
	double a = 0;
	double b = 0;
	double result = 0;
	
	int Point = 0; 
	
	enum Operand {Add,Sub,Mul,Div};
	Operand Oper = null;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Определяю обьекты по их id
        bt_Add = (Button) findViewById(R.id.bt_Add);
        bt_Sub = (Button) findViewById(R.id.bt_Sub);
        bt_Mul = (Button) findViewById(R.id.bt_Mul);
        bt_Div = (Button) findViewById(R.id.bt_Div);
        bt_Result = (Button) findViewById(R.id.bt_Result);
        
        bt_Num1 = (Button) findViewById(R.id.bt_Num1);
        
        tv_Result = (TextView) findViewById(R.id.tv_Result);
        et_Display = (EditText) findViewById(R.id.et_Display);
        
        // Присваиваю обработчик кнопкам
        bt_Add.setOnClickListener(this);
        bt_Sub.setOnClickListener(this);
        bt_Mul.setOnClickListener(this);
        bt_Div.setOnClickListener(this);
        
        bt_Result.setOnClickListener(this);
        
    }
      
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       //getMenuInflater().inflate(R.menu.main, menu);
       menu.add(0, MENU_RESET_ID, 0, "Reset");
       menu.add(0, MENU_QUIT_ID, 0, "Quit");
       return super.onCreateOptionsMenu(menu);
    }
  
    public boolean  onOptionsItemSelected (MenuItem item) {
    	switch (item.getItemId()) {
    		case MENU_RESET_ID:
    			// очищаем поля
    			et_Display.setText("0");
    			tv_Result.setText("");
    			break;
    		case MENU_QUIT_ID:
    			// выход из приложения
    			finish();
    			break;
    	}
    	return super.onOptionsItemSelected(item);
	}
    
   ////////////////////////////////////////////////////////////////////////////////////////
    // Button Num0 click
    public void bt_Num0_Click(View v){    
    	double value = 0;
    	
    	if (TextUtils.isEmpty(et_Display.getText().toString())){
    		et_Display.setText("0");
    	} else {
    		value = Double.parseDouble(et_Display.getText().toString());
     		if (value == 0) {
     			et_Display.setText("0");
			} else {
				et_Display.setText(et_Display.getText().toString() + "0");
			}
    		
    	}
    	
    } 
    // Button Num1 click
    public void bt_Num1_Click(View v){    
    	double value = 0;
    	
    	if (TextUtils.isEmpty(et_Display.getText().toString())){
    		et_Display.setText("1");
    	} else {
    		value = Double.parseDouble(et_Display.getText().toString());
     		if (value == 0) {
     			et_Display.setText("1");
			} else {
				et_Display.setText(et_Display.getText().toString() + "1");
			}
    		
    	}
    	
    }
    // Button Num2 click
    public void bt_Num2_Click(View v){    
    	double value = 0;
    	
    	if (TextUtils.isEmpty(et_Display.getText().toString())){
    		et_Display.setText("2");
    	} else {
    		value = Double.parseDouble(et_Display.getText().toString());
     		if (value == 0) {
     			et_Display.setText("2");
			} else {
				et_Display.setText(et_Display.getText().toString() + "2");
			}
    		
    	}
    }
    // Button Num3 click
    public void bt_Num3_Click(View v){    
    	double value = 0;
    	
    	if (TextUtils.isEmpty(et_Display.getText().toString())){
    		et_Display.setText("3");
    	} else {
    		value = Double.parseDouble(et_Display.getText().toString());
     		if (value == 0) {
     			et_Display.setText("3");
			} else {
				et_Display.setText(et_Display.getText().toString() + "3");
			}
    		
    	}
    } 
    // Button Num4 click
    public void bt_Num4_Click(View v){    
    	double value = 0;
    	
    	if (TextUtils.isEmpty(et_Display.getText().toString())){
    		et_Display.setText("4");
    	} else {
    		value = Double.parseDouble(et_Display.getText().toString());
     		if (value == 0) {
     			et_Display.setText("4");
			} else {
				et_Display.setText(et_Display.getText().toString() + "4");
			}
    		
    	}
    } 
    // Button Num5 click
    public void bt_Num5_Click(View v){    
    	double value = 0;
    	
    	if (TextUtils.isEmpty(et_Display.getText().toString())){
    		et_Display.setText("5");
    	} else {
    		value = Double.parseDouble(et_Display.getText().toString());
     		if (value == 0) {
     			et_Display.setText("5");
			} else {
				et_Display.setText(et_Display.getText().toString() + "5");
			}
    		
    	}
    } 
    // Button Num6 click
    public void bt_Num6_Click(View v){    
    	double value = 0;
    	
    	if (TextUtils.isEmpty(et_Display.getText().toString())){
    		et_Display.setText("6");
    	} else {
    		value = Double.parseDouble(et_Display.getText().toString());
     		if (value == 0) {
     			et_Display.setText("6");
			} else {
				et_Display.setText(et_Display.getText().toString() + "6");
			}
    		
    	}
    	
    } 
    // Button Num7 click
    public void bt_Num7_Click(View v){    
    	double value = 0;
    	
    	if (TextUtils.isEmpty(et_Display.getText().toString())){
    		et_Display.setText("7");
    	} else {
    		value = Double.parseDouble(et_Display.getText().toString());
     		if (value == 0) {
     			et_Display.setText("7");
			} else {
				et_Display.setText(et_Display.getText().toString() + "7");
			}
    		
    	}
    } 
    // Button Num8 click
    public void bt_Num8_Click(View v){    
    	double value = 0;
    	
    	if (TextUtils.isEmpty(et_Display.getText().toString())){
    		et_Display.setText("8");
    	} else {
    		value = Double.parseDouble(et_Display.getText().toString());
     		if (value == 0) {
     			et_Display.setText("8");
			} else {
				et_Display.setText(et_Display.getText().toString() + "8");
			}
    		
    	}
    	
    } 
    
    // Button Num9 click
    public void bt_Num9_Click(View v){    
    	double value = 0;
    	
    	if (TextUtils.isEmpty(et_Display.getText().toString())){
    		et_Display.setText("9");
    	} else {
    		value = Double.parseDouble(et_Display.getText().toString());
     		if (value == 0) {
     			et_Display.setText("9");
			} else {
				et_Display.setText(et_Display.getText().toString() + "9");
			}
    		
    	}
    } 
 // Button Point click
    public void bt_Point_Click(View v){    
    	
    	
    	if (TextUtils.isEmpty(et_Display.getText().toString())){
    		et_Display.setText("0.");
    	} else {
    		if(Point == 0){
     			et_Display.setText(".");
			}     		
    	}
    } 
    
    
    @Override
    public void onClick(View v){    	
        
		// Определяю id нажатой кнопки	
    	
    	switch (v.getId()){
     	// нажата кнопка сложения
     	case(R.id.bt_Add):
     		// проверка на пустоту
     		if (TextUtils.isEmpty(et_Display.getText().toString())) {
   		      return;
   		    }
     		
     		a = Double.parseDouble(et_Display.getText().toString());
     		
     		et_Display.setText("0");
     		tv_Result.setText(a + "+");
     		
     		Oper = Operand.Add;
     		
     		break;
     	// нажата кнопка вычетание
     	case(R.id.bt_Sub):
     		
     		if (TextUtils.isEmpty(et_Display.getText().toString())) {
     		      return;
     		}
     		
     		a = Double.parseDouble(et_Display.getText().toString());
 			
     		et_Display.setText("0");
 			tv_Result.setText(a + "-");
 			
 			Oper = Operand.Sub;
    		
     		break;
     	// нажата кнопка умножения
     	case(R.id.bt_Mul):
     		
     		if (TextUtils.isEmpty(et_Display.getText().toString())) {
     		      return;
  		    }
     		
     		a = Double.parseDouble(et_Display.getText().toString());
     		
     		et_Display.setText("0");
     		tv_Result.setText(a + "*");
     		
     		Oper = Operand.Mul;
     		
     		break;
     	// нажата кнопка деления
     	case(R.id.bt_Div):
     		
     		if (TextUtils.isEmpty(et_Display.getText().toString())) {
     		      return;
     		}
     		
     		a = Double.parseDouble(et_Display.getText().toString());
 			
     		et_Display.setText("0");
 			tv_Result.setText(a + "/");
 			
 			Oper = Operand.Div;
    		
     		break;
     	case(R.id.bt_Result):
     		
     		if (TextUtils.isEmpty(et_Display.getText().toString())) {
     		      return;
     		}
     		
     		b =  Double.parseDouble(et_Display.getText().toString());
     	
     	    tv_Result.setText(a + "  " + b);
     	    // в соответствии со значением переменной Oper
     		switch (Oper){
     		case Add:
     			
     			result = a + b;
     			tv_Result.setText(a + "+" + b + "=" + result);
     			
     			break;
     		case Sub:
     			
     			result = a - b;
     			tv_Result.setText(a + "-" + b + "=" + result);
     			
     			break;
     		case Mul:
     			
     			result = a * b;
     			tv_Result.setText(a + "*" + b + "=" + result);
     			
     			break;
     		case Div:
     			
     			if ((b != 0) && (b > 0)){
     				result = a / b;
         			tv_Result.setText(a + "/" + b + "=" + result);	
     			}
     			else{
     				Toast.makeText(this, "На ноль делить нельзя",Toast.LENGTH_LONG).show();
     			}
     				
     			
     			break;
     			
     		}
       		et_Display.setText(""+result);
     		break;
     		
    	}
    }

}
