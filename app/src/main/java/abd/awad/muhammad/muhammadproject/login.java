package abd.awad.muhammad.muhammadproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity
{
    private EditText etName;
    private EditText etAge;
    private EditText etPhone;
    private TextView tvPlayed;
    private Button btnYes;
    private Button btnNo;
    private Button btnWait;
    private Button btnSearch;

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
    }
}
