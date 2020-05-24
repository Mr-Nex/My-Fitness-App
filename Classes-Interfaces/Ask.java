package generator.nex.rexx.completefitness;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.rexx.completefitness.R;
import com.rengwuxian.materialedittext.MaterialEditText;

public class Ask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask);

        FloatingActionButton send = (FloatingActionButton)findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String subject = ((MaterialEditText)findViewById(R.id.sub)).getText().toString();
                String message = ((EditText)findViewById(R.id.mssg)).getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{"rexxxgen@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);
                email.setType("message/rfc822");  // this is a Multipurpose Internet Mail Extension(MIME), used to exchange data via email
                startActivity(Intent.createChooser(email, "Send email via: "));

            }
        });
    }
}
