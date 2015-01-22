package calc.new_project;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	final int MENU_RESET_ID = 1;
	final int MENU_QUIT_ID = 2;
	
	TextView tv_Result;
	TextView tv_Display;
	
	String s = new String();
	
	// Переменные
	double a = 0;
	double b = 0;
	double result = 0;
	
	boolean Point = false; 
	
	enum Operand {Add,Sub,Mul,Div};
	Operand Oper = null;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Определяю обьекты по их id
             
        tv_Result = (TextView) findViewById(R.id.tv_Result);
        tv_Display = (TextView) findViewById(R.id.tv_Display);
        
        // Присваиваю обработчик кнопкам
               
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
    			tv_Display.setText("0");
    			tv_Result.setText("");
    			Point = false;
    			break;
    		case MENU_QUIT_ID:
    			// выход из приложения
    			finish();
    			break;
    	}
    	return super.onOptionsItemSelected(item);
	}
    
   ///////////////////////////////////////////////
    public void Output_Value(String s){
    /*	if (TextUtils.isEmpty(et_Display.getText().toString())){
    		et_Display.setText("0");
    	} else 
    	et_Display.setText(et_Display.getText().toString() + s);
     				Point = true;
    		value = Double.parseDouble(et_Display.getText().toString());*/
    	
    	if ((s.equals(".")) && (Point == false)){
    			tv_Display.setText(tv_Display.getText().toString() + s);
 				Point = true;
     	} else {
     		if (s.equals(".")){
     			return;
     		} else {
     			if (tv_Display.getText().toString().equals("0")) {
     				tv_Display.setText(s);
    			} else {
    				tv_Display.setText(tv_Display.getText().toString() + s);
    			}
     		}
     	}
    }
    //////////////////////////////////////////////   
    // Button Num0 click
    public void onNum0Click(View v){    
    	Output_Value("0");
    } 
    // Button Num1 click
    public void onNum1Click(View v){    
    	Output_Value("1");
    }
    // Button Num2 click
    public void onNum2Click(View v){    
    	Output_Value("2");
    }
    // Button Num3 click
    public void onNum3Click(View v){    
    	Output_Value("3");   	
    } 
    // Button Num4 click
    public void onNum4Click(View v){    
    	Output_Value("4");    	
    } 
    // Button Num5 click
    public void onNum5Click(View v){    
    	Output_Value("5");   	
    } 
    // Button Num6 click
    public void onNum6Click(View v){    
    	Output_Value("6");   	
    } 
    // Button Num7 click
    public void onNum7Click(View v){    
    	Output_Value("7");   
    } 
    // Button Num8 click
    public void onNum8Click(View v){    
    	Output_Value("8");   	
    } 
    // Button Num9 click
    public void onNum9Click(View v){    
    	Output_Value("9");  	
    } 
    // Button Point click
    public void onPointClick(View v){    
    	Output_Value(".");  	
    } 
      
    // Button Add click
    public void onAddClick(View v){
     		// проверка на пустоту
     		if (TextUtils.isEmpty(tv_Display.getText().toString())) {
   		      return;
   		    }
     		
     		a = Double.parseDouble(tv_Display.getText().toString());
     		
     		tv_Display.setText("0");
     		tv_Result.setText(a + "+");
     		
     		Oper = Operand.Add;
     		
    }
    // Button Sub click
    public void onSubClick(View v){
     		
     		if (TextUtils.isEmpty(tv_Display.getText().toString())) {
     		      return;
     		}
     		
     		a = Double.parseDouble(tv_Display.getText().toString());
 			
     		tv_Display.setText("0");
 			tv_Result.setText(a + "-");
 			
 			Oper = Operand.Sub;
    		
    }
    // Button Sub click
    public void onMulClick(View v){
     		
     		if (TextUtils.isEmpty(tv_Display.getText().toString())) {
     		      return;
  		    }
     		
     		a = Double.parseDouble(tv_Display.getText().toString());
     		
     		tv_Display.setText("0");
     		tv_Result.setText(a + "*");
     		
     		Oper = Operand.Mul;
     		
    }
    // Button Sub click
    public void onDivClick(View v){
     		
     		if (TextUtils.isEmpty(tv_Display.getText().toString())) {
     		      return;
     		}
     		
     		a = Double.parseDouble(tv_Display.getText().toString());
 			
     		tv_Display.setText("0");
 			tv_Result.setText(a + "/");
 			
 			Oper = Operand.Div;
    		
    }		
    // Button Result click  		
 	public void	onResultClick(View v){
        		
     		if (TextUtils.isEmpty(tv_Display.getText().toString())) {
     		      return;
     		}
     		
     		b =  Double.parseDouble(tv_Display.getText().toString());
     	
     	    tv_Result.setText(a + "  " + b);
     	    
     	    Point = false;
     	    
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
     		tv_Display.setText(""+result);
     		
     		
    }
}


