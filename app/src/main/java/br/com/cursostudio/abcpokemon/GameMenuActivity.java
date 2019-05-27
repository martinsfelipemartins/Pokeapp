package br.com.cursostudio.abcpokemon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import java.util.zip.Inflater;

public class GameMenuActivity extends AppCompatActivity {
    private Button btnCampaign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_menu);

        initViews();
        btnCampaign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(GameMenuActivity.this,LogActivity.class);
                startActivity(intent);

            }
        });

    }

    private void initViews() {
        btnCampaign = findViewById(R.id.btnCampaing);
    }


}
