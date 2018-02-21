package com.example.jake.dnd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CharacterProfileActivity extends AppCompatActivity {

    private Button character_sheet_button;
    private Button ability_sheet_button;
    private Button encounter_sheet_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_profile);

        setTitle("Character Profile");

        character_sheet_button = (Button) findViewById(R.id.character_sheet_button);

        character_sheet_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity(CharacterSheetActivity.class);
            }
        });

        ability_sheet_button = (Button) findViewById(R.id.ability_sheet_button);

        encounter_sheet_button = (Button) findViewById(R.id.encounter_sheet_button);
    }

    private void launchActivity(Class activity_class) {
        Intent intent = new Intent(this, activity_class);
        startActivity(intent);
    }
}
