package com.example.dogtinder2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class PageLogin extends Activity {

	MainActivity m = new MainActivity();
	private EditText textName, textPass;
	String name, pass;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_login);
        
        Bundle extras = getIntent().getExtras();
        	if (extras != null) {
        		name = extras.getString("login");
        		pass = extras.getString("password");
        	}
        
        textName = (EditText)findViewById(R.id.loginName);
        textPass = (EditText)findViewById(R.id.loginPass);
    }
    
    public void click_textRegister (View view)
    {
    	Intent intent = new Intent(this, MainActivity.class);
    	startActivity(intent);
    }
    
    public void click_buttonLogin(View view)
    {
    	if(textName.getText().toString().equals(name) && textPass.getText().toString().equals(pass))
    	{
    		Log.i("Teste de login", "Conectado");
    	}
    	
    	else
    		Log.i("Teste de login", "Não conectado");
    }
}