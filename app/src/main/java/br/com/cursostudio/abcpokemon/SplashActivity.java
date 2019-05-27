package br.com.cursostudio.abcpokemon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    private ImageView imageSplash;
    private Timer timerSplash = new Timer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageSplash = findViewById(R.id.imageSplash);
        imageSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump();

            }
        });

        timerSplash.schedule(new TimerTask() {
            @Override
            public void run() {
                jump();

            }
        }, 3000);

    }


    public void jump() {
        timerSplash.cancel();
        Intent intent = new Intent(SplashActivity.this, GameMenuActivity.class);
        startActivity(intent);
        finish();

    }
}
