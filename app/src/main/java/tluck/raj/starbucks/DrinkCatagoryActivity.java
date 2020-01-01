package tluck.raj.starbucks;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCatagoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ListView listDrinks =getListView();

        ArrayAdapter<Drink> adapter=new ArrayAdapter<Drink>(this,android.R.layout.simple_list_item_1,Drink.drinks);

        listDrinks.setAdapter(adapter);


       
    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        Intent intent=new Intent(DrinkCatagoryActivity.this,DrinkActivity.class);
        intent.putExtra("drinkid",id);
        startActivity(intent);

    }
}
