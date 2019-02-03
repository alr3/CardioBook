package com.example.blast.cardiobook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Measurement[] measurementArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populateListView();

        final Button button = findViewByID(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View add_view){
                Intent intent = new Intent(this, Add_Measurement.class);
                startActivity(intent);
            }
        });

        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick (View edit_view){
                Intent intent = new Intent(this, edit_measurement.class);
                startActivity(intent);
            }
        });

    }







    public void populateListView() {
        ArrayAdapter<Measurement> adapter = new ArrayAdapter<Measurement>
                (this, R.layout.arraylayout, measurementArray);
        ListView list = (ListView) findViewById(R.id.measurements);
        list.setAdapter(adapter);
    };
}
