package com.example.dogtinder2;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class PageLogin extends Activity {

	MainActivity m = new MainActivity();
	private EditText textName, textPass;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_login);
        
        textName = (EditText)findViewById(R.id.loginName);
        textPass = (EditText)findViewById(R.id.loginPass);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void click_textRegister (View view)
    {
    	Intent intent = new Intent(this, MainActivity.class);
    	startActivity(intent);
    }
    
    public void click_buttonLogin(View view)
    {
    	if(textName.getText().toString().equals(m.name) && textPass.getText().toString().equals(m.pass))
    	{
    		
    	}
    }
}