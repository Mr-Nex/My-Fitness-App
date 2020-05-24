package generator.nex.rexx.completefitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rexx.completefitness.R;

public class MainActivity extends AppCompatActivity{

    Button button;

    public void getStarted(View view){

        Intent getstarted = new Intent(MainActivity.this, Home.class);
        startActivity(getstarted);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.getStarted);

    }
}