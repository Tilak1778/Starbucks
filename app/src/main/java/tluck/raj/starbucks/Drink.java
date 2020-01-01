package tluck.raj.starbucks;

public class Drink {

    private String name;
    private String description;
    private int imageRes;

 private Drink(String name,String description,int imageRes){

     this.imageRes=imageRes;
     this.description=description;
     this.name=name;
 }

 public static Drink drinks[]={

         new Drink("latte","A couple of espresso shots with steamed milk",R.drawable.latte),
         new Drink("cappuccino","Espresso, hot milk, and a steamed milk foam",R.drawable.cappuccino),
         new Drink("filter","Highest quality beans roasted and brewed fresh",R.drawable.filter)
 };

 public String toString(){

     return this.name;
 }

 public String getName(){

     return this.name;
 }

 public String getDescription(){

     return  this.description;
 }

 public int getImageRes(){

     return this.imageRes;
 }


}
