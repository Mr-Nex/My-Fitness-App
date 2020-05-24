package generator.nex.rexx.completefitness;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.rexx.completefitness.R;

public class StopWatch extends AppCompatActivity {

    TextView timeText;
    TextView msText;

    Button GoButton;
    Button StopButton;
    Button ResetButton;

    int seconds = 0;
    boolean startRun;

    public void go(View view){
        startRun = true;
    }

    public void stop(View view){
        startRun = false;
    }

    public void reset(View view){
        startRun = false;
        seconds = 0;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("seconds", seconds);
        outState.putBoolean("startRun", startRun);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        Intent intenttt = getIntent();

        timeText = (TextView)findViewById(R.id.heading);
        msText = (TextView)findViewById(R.id.msText);
        GoButton = (Button)findViewById(R.id.GoButton);
        StopButton = (Button)findViewById(R.id.StopButton);
        ResetButton = (Button)findViewById(R.id.ResetButton);

        if (savedInstanceState != null){
            seconds = savedInstanceState.getInt("seconds");
            startRun = savedInstanceState.getBoolean("startRun");
        }
        Timerr();
    }

    public void Timerr(){

        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;

                String time = String.format("%02d:%02d", hours, minutes);
                String msTime = String.format("%02d", secs);

                timeText.setText(time);
                msText.setText(msTime);
                if(startRun){
                    seconds++;
                }
                handler.postDelayed(this, 1);
            }
        });
    }
}
