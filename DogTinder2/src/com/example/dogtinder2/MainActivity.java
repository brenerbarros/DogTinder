package com.example.dogtinder2;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
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
    //poooo
    public void confirm_register (View view)
    {
    	if(!textName.getText().toString().equals("") &&
    		textPass.getText().toString().equals(confirmPass.getText().toString()) &&
    		!textPass.getText().toString().equals(""))
    	{
    		name = textName.getText().toString();
    		pass = textPass.getText().toString();
    		
    		Intent intent = new Intent(this, PageLogin.class);
    		intent.putExtra("login", name);
    		intent.putExtra("password", pass);
        	startActivity(intent);
    	}
    	
    	else if(textName.getText().toString().equals(""))
    	{
    		textInfo.setText("Nome inv�lido");
    	}
    	
    	else if(!textPass.getText().toString().equals(confirmPass.getText().toString()) || textPass.getText().toString().equals(""))
    	{
    		textInfo.setText("As senhas n�o est�o combinando");
    	}
    }
    
    public void click_textLogin (View view)
    {
    	Intent intent = new Intent(this, PageLogin.class);
    	startActivity(intent);
    }
    
    public void click_textCredits(View view)
    {
    	Intent intent = new Intent(this, PageCredits.class);
    	startActivity(intent);
    }
    
}
