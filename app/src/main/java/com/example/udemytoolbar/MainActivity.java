package com.example.udemytoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //set icon back in toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }//The last method onCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.manu_main,menu);
        return true;
    }//The last method onCreateOptionsMenu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id==R.id.item1_id){
            Toast.makeText(this, "item1 is selected", Toast.LENGTH_SHORT).show();
        }else if (id==R.id.item2_id){
            Toast.makeText(this, "item2 is selected", Toast.LENGTH_SHORT).show();
        }else if (id==R.id.item3_id){
            Toast.makeText(this, "item3 is selected", Toast.LENGTH_SHORT).show();
        }else if (id==R.id.search_id){
            Toast.makeText(this, "search icon is selected", Toast.LENGTH_SHORT).show();
        }else if (id==R.id.shopping_cart_id){
            Toast.makeText(this, "shopping_cart icon is selected", Toast.LENGTH_SHORT).show();
        }else if (id==android.R.id.home){
            Toast.makeText(this, "By BY :)", Toast.LENGTH_SHORT).show();
            finish();
        }

        return super.onOptionsItemSelected(item);
    }//The last method onOptionsItemSelected

}//The last Class MainActivity
