package com.example.OTrail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class BerryActivity extends AppCompatActivity {

    public static final String POST_GAME_INV = "com.example.OTrail.POST_GAME_INV";

    private static final int GAME_RESULT = 4;

    private Event event;
    private Inventory inv;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.berry_picking_title);
        Button startGame = (Button)findViewById(R.id.startGame);

        event = (Event) getIntent().getSerializableExtra("passEvent");
        inv = (Inventory) getIntent().getSerializableExtra("Inventory object");



        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if(i == 1) {
                    startGame.setText("To trail");
                    Intent intent = new Intent(BerryActivity.this, BerryPickingMinigame.class);
                    intent.putExtra("passEvent", event);
                    intent.putExtra("Inventory object", inv);
                    startActivityForResult(intent, GAME_RESULT);
                }
                else {
                    System.out.println("Berryactivity food 1= " + inv.getFoodCount());
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra(POST_GAME_INV, inv);
                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GAME_RESULT){
            if (resultCode == RESULT_OK){
                inv = (Inventory) data.getSerializableExtra(BerryPickingMinigame.RESULT);
                System.out.println("Berryactivity food 2= " + inv.getFoodCount());
            }
        }
    }
}