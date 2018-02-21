package com.example.jake.dnd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button new_character_button;
    private Button character_profile_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("App Home Page");

        new_character_button = (Button) findViewById(R.id.new_character_button);

        //New character button creates a new character sheet that redirects to the character profile after completing the initial sheet
        //More functionality needed to accomplish this.
        new_character_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity(CharacterSheetActivity.class);
            }
        });

        character_profile_button = (Button) findViewById(R.id.character_profile_button);

        character_profile_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity(CharacterProfileActivity.class);
            }
        });
    }

    private void launchActivity(Class activity_class) {
        Intent intent = new Intent(this, activity_class);
        startActivity(intent);
    }
}
