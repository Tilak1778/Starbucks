package tluck.raj.starbucks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView options_listView =findViewById(R.id.List_Options);

        AdapterView.OnItemClickListener Listner = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){

                    Intent intent=new Intent(MainActivity.this,DrinkCatagoryActivity.class);
                    startActivity(intent);
                }

            }
        };

        options_listView.setOnItemClickListener(Listner);



    }
}
