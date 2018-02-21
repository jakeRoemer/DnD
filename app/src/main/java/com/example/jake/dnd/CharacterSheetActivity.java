package com.example.jake.dnd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class CharacterSheetActivity extends AppCompatActivity {

    private EditText character_name_edit;
    private EditText race_edit;
    private EditText class_edit;
    private EditText level_edit;
    private EditText xp_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_sheet);

        setTitle("Character Sheet");

        character_name_edit = (EditText) findViewById(R.id.character_name_edit);
        character_name_edit.setText("Character Name");

        race_edit = (EditText) findViewById(R.id.race_edit);
        race_edit.setText("Race");

        class_edit = (EditText) findViewById(R.id.class_edit);
        class_edit.setText("Class");

        level_edit = (EditText) findViewById(R.id.level_edit);
        level_edit.setText("Level");

        xp_edit = (EditText) findViewById(R.id.xp_edit);
        xp_edit.setText("XP");
    }
}
