package com.thecodepath.example.suzannetipscal;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TipsActivity extends Activity {
	
	public EditText etinput;
	public TextView tvresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        etinput=(EditText) findViewById(R.id.etinput);
        tvresult=(TextView) findViewById(R.id.tvresult);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tips, menu);
        return true;
    }
    
    
    public void onSubmit10 (View v) {
    	//fire tips calculation
    	String getresult = etinput.getText().toString();
    	Double tipresult = Double.valueOf(getresult);
    	Double output = 0.1 * tipresult;
    	
    	String finaloutput = "The tips is:" + String.valueOf(output);
    	
    	tvresult.setText(finaloutput);
    	
    }
    
    public void onSubmit15 (View v) {
    	//fire tips calculation
    	String getresult = etinput.getText().toString();
    	Double tipresult = Double.valueOf(getresult);
    	Double output = 0.15 * tipresult;
    	
    	String finaloutput = "The tips is:" + String.valueOf(output);
    	
    	tvresult.setText(finaloutput);
    	
    	
    }
    
    public void onSubmit20 (View v) {
    	//fire tips calculation
    	String getresult = etinput.getText().toString();
    	Double tipresult = Double.valueOf(getresult);
    	Double output = 0.2 * tipresult;
    	
    	String finaloutput = "The tips is:" + String.valueOf(output);
    	
    	tvresult.setText(finaloutput);
    	
    }
    
    
}
