package com.myschool.tp2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SignupActivity extends ActionBarActivity {

    private Button btn_validation = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btn_validation = (Button) findViewById(R.id.btn_signup_send);
        btn_validation.setOnClickListener(signupValidation);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_signup, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private OnClickListener signupValidation = new OnClickListener() {

        private EditText username = null;
        private EditText email = null;
        private EditText password = null;

        @Override
        public void onClick(View v) {

            username = (EditText) findViewById(R.id.username);
            email = (EditText) findViewById(R.id.email);
            password = (EditText) findViewById(R.id.password);

            String vUsername = username.getText().toString();
            String vEmail = email.getText().toString();
            String vPassword = password.getText().toString();

            if (vUsername.equals("") || vEmail.equals("") || vPassword.equals("")) {
                Toast.makeText(SignupActivity.this, "Remplissez tous les champs", Toast.LENGTH_SHORT).show();
                return;
            }

        }
    };
}
