package abd.awad.muhammad.muhammadproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class login extends AppCompatActivity implements View.OnClickListener
{
    private EditText etName;
    private EditText etAge;
    private EditText etPhone;
    private TextView tvPlayed;
    private Button btnYes;
    private Button btnNo;
    private Button btnWait;
    private Button btnSearch;
    private FirebaseAuth auth;
    private FirebaseUser firebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etName = (EditText) findViewById(R.id.etName);
        etAge = (EditText) findViewById(R.id.etAge);
        etPhone = (EditText) findViewById(R.id.etPhone);
        tvPlayed = (TextView) findViewById(R.id.tvPlayed);
        btnYes = (Button) findViewById(R.id.btnYes);
        btnNo = (Button) findViewById(R.id.btnNo);
        btnWait = (Button) findViewById(R.id.btnWait);
        btnSearch = (Button) findViewById(R.id.btnSearch);
        auth = FirebaseAuth.getInstance();
        firebaseUser = auth.getCurrentUser();
    }

    @Override
    public void onClick(View view)
    {
        if (btnYes==view)
        {
            Intent i = new Intent(this, IfYesActivity.class);
            startActivity(i);
        }

        if (btnNo==view)
        {
            Intent i = new Intent(this,IfNoActivity.class);
            startActivity(i);
        }
    }
}
