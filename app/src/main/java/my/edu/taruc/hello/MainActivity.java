package my.edu.taruc.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMsg; //TextView = class, textViewMsg = instances

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate() = main function
        super.onCreate(savedInstanceState);
        //Display UI
        //R = resource
        //layout = folder
        setContentView(R.layout.activity_main);
        //Link UI to program
        textViewMsg = findViewById(R.id.textViewMessage);
    }

    public void showMessage(View view) {
        textViewMsg.setText("Hello, Tan Wil Son");
    }
}
