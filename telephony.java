import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText num;
    Button callbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = findViewById(R.id.dail_number);
        callbtn = findViewById(R.id.call_btn);

        callbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String number = num.getText().toString();

        Intent i = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", number, null));
        startActivity(i);
    }
}
