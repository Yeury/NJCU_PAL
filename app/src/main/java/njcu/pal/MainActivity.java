
package njcu.pal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView pal_logo1;
    TextView pal_logo2;
    Button logIn;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pal_logo1 = (TextView) findViewById(R.id.home_logo1);
        pal_logo2 = (TextView) findViewById(R.id.home_logo2);
        logIn = (Button) findViewById(R.id.home_logIn);
        signUp = (Button) findViewById(R.id.home_signUp);

        logIn.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            //case R.id.home_logIn:

                //break;

            case R.id.home_signUp:
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);

                break;


        }

    }
}
