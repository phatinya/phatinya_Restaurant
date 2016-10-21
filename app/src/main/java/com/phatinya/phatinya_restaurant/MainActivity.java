package com.phatinya.phatinya_restaurant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
//Explicit
    private  UserTABLE objUserTABLE;
    private  FoodTABLE objFoodTABLE;
    private  OrderTABLE objOrderTABLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connectted SQLite
        connectedSQLite();
    }//onCreate
    private void connectedSQLite(){
        objUserTABLE = new UserTABLE(this);
        objFoodTABLE = new FoodTABLE(this);
        objOrderTABLE = new OrderTABLE(this);
    } //connectedSQLite
} // Main class
