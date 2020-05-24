package generator.nex.rexx.completefitness;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.rexx.completefitness.R;

public class StWatch extends AppCompatActivity {

    SeekBar seekBarTimer;
    TextView timeTextView;
    TextView timeHeading;
    Button buttonGo;
    CountDownTimer countDownTimer;
    Boolean counterisActive = false;

    public void controlTime(View view) {

        if (counterisActive == false) {
            counterisActive = true;
            seekBarTimer.setEnabled(false);
            timeHeading.animate().alpha(0);

            buttonGo.setBackgroundResource(android.R.drawable.ic_media_pause);

            countDownTimer = new CountDownTimer(seekBarTimer.getProgress() * 1000 + 100, 1000) {
                @Override
                public void onTick(long l) {

                    updateTime((int) l / 1000);
                }

                @Override
                public void onFinish() {
                    resetTime();

                    MediaPlayer mediaPlayer = MediaPlayer.create(StWatch.this, R.raw.horn);
                    mediaPlayer.start();
                }
            }.start();
        }else{
            resetTime();
        }
    }

    public void updateTime(int secondLeft){
        int minute = (int) secondLeft/60;
        int second = secondLeft - minute * 60;

        String secondsString = Integer.toString(second);

        if (second <=9){
            secondsString = "0" + secondsString;
        }
        timeTextView.setText(Integer.toString(minute) + ":" + secondsString);
    }

    public void resetTime(){
        timeTextView.setText("00:00");
        seekBarTimer.setProgress(0);
        countDownTimer.cancel();
        buttonGo.setBackgroundResource(android.R.drawable.ic_media_play);
        seekBarTimer.setEnabled(true);
        counterisActive = false;
        timeHeading.animate().alpha(1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st_watch);

        Intent stopIntent = getIntent();

        seekBarTimer = (SeekBar)findViewById(R.id.seekBarTimer);
        timeTextView = (TextView)findViewById(R.id.timeTextView);
        timeHeading = (TextView)findViewById(R.id.timeHeading);
        buttonGo = (Button)findViewById(R.id.buttonGo);

        seekBarTimer.setMax(1800);
        seekBarTimer.setProgress(0);

        seekBarTimer.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                updateTime(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
