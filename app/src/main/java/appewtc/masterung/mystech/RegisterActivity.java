package appewtc.masterung.mystech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEditText,surnameEditText,addressEditText,userEditText,
            passEditText;
    private Button button;
    private  String nameString,surnameString,addressString,userString,
            passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        initView();

        controller();


    } // Main Method

    private void controller() {
        button.setOnClickListener(RegisterActivity.this);


    }

    private void initView() {
        nameEditText = (EditText) findViewById(R.id.edtName);
        surnameEditText = (EditText) findViewById(R.id.edtSername);
        addressEditText = (EditText) findViewById(R.id.edtAddress);
        userEditText = (EditText) findViewById(R.id.edtUser);
        passEditText = (EditText) findViewById(R.id.edtPassword);
        button = (Button) findViewById(R.id.btnSave);

    }

    @Override
    public void onClick(View view) {

        if (view == button) {

            // Get Value Form EditText
            nameString = nameEditText.getText().toString().trim();
            surnameString = surnameEditText.getText().toString().trim();
            addressString = addressEditText.getText().toString().trim();
            userString = userEditText.getText().toString().trim();
            passwordString = passEditText.getText().toString().trim();


            // Check Space
            if (nameString.equals("") ||surnameString.equals("") ||
            addressString.equals("")|| userString.equals("")||
                    passwordString.equals("")){

                // Have Space
                MyAlert myAlrt = new MyAlert(RegisterActivity.this);
                myAlrt.myDialog("Have Space" , "Please Fill All Blank");
            } else {
                // No Space
            }

        }

    } // OnClick
}  // Main Class
