package tluck.raj.starbucks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    public  String EXTRA_DRINKID="drinkid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);


        Intent intent=getIntent();

        String drinkNo=intent.getExtras().get("drinkid").toString();

        int no=Integer.parseInt(drinkNo);

        Drink drink=Drink.drinks[no];

        ImageView photo=findViewById(R.id.photo);
        TextView name=findViewById(R.id.name);
        TextView des=findViewById(R.id.description);

        photo.setImageResource(drink.getImageRes());
        name.setText(drink.getName());
        des.setText(drink.getDescription());


    }
}
