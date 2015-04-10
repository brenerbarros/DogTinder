package com.example.dogtinder2;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText confirmPass, textPass, textName;
	private TextView textInfo;
	
	String name, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    	textName = (EditText)findViewById(R.id.registerName);
    	textPass = (EditText)findViewById(R.id.registerPass);
    	confirmPass = (EditText)findViewById(R.id.confirmPass);
    	textInfo = (TextView)findViewById(R.id.textView2);
    }
    
    public void confirm_register (View view)
    {
    	if(!textName.getText().toString().equals("") &&
    		textPass.getText().toString().equals(confirmPass.getText().toString()) &&
    		!textPass.getText().toString().equals(""))
    	{
    		name = textName.getText().toString();
    		pass = textPass.getText().toString();
    		
    		textName.setText("");
    		textPass.setText("");
    		confirmPass.setText("");
    		
    		Intent intent = new Intent(this, PageLogin.class);
        	startActivity(intent);
    	}
    	
    	else if(textName.getText().toString().equals(""))
    	{
    		textInfo.setText("Nome inválido");
    	}
    	
    	else if(!textPass.getText().toString().equals(confirmPass.getText().toString()) || textPass.getText().toString().equals(""))
    	{
    		textInfo.setText("As senhas não estão combinando");
    	}
    }
    
    public void click_textLogin (View view)
    {
    	Intent intent = new Intent(this, PageLogin.class);
    	startActivity(intent);
    }
    
}
