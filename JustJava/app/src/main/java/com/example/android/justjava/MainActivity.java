/**
 * IMPORTANT: Make sure you are using the correct package name. 
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.sql.Struct;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment(View view)
    {
        if (quantity == 100) {
            // Show an error message as a toast
            Toast.makeText(this, "You cannot have more than 100 coffees", Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
        //int quantity = 3;
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view)
    {
        if (quantity == 1) {
            // Show an error message as a toast
            Toast.makeText(this, "You cannot have less than 1 coffee", Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
       // int quantity = 1;
        quantity=quantity-1;
        TextView mError = (TextView) findViewById(R.id.error);
        if(quantity <=0)
        {
            mError.setText("Cannot select 0 or below");
        }
        display(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
      //  display(quantity);

        EditText nameField = (EditText) findViewById(R.id.name_text);
        String nameValue = nameField.getText().toString();

        CheckBox whippedCream = (CheckBox) findViewById(R.id.whipped_cream);

        CheckBox chocolate = (CheckBox) findViewById(R.id.chocolate_checkbox);

        boolean hasWhippedCream = whippedCream.isChecked();
        boolean hasChocolate = chocolate.isChecked();

        int price = calculatePrice(hasWhippedCream, hasChocolate);
        String message =  createOrderSummary(nameValue, price, hasWhippedCream, hasChocolate); //"Total: $" + price +  "\nThank You!";
        //displayPrice(price);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "JustJava order for "+ nameValue);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

        displayMessage(message);
    }

    private int calculatePrice(boolean addWhippedCream, boolean addChocolate){
        int basePrice = 5;
        if(addWhippedCream)
        {
            basePrice = basePrice + 1;
        }
        if(addChocolate)
        {
            basePrice = basePrice + 2;
        }
        return quantity * basePrice;
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message)
    {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    private String createOrderSummary(String name, int price, boolean whippedCream, boolean chocolateCream)
    {
        String priceMessage = "Name: " + name;
        priceMessage +="\nAdd Whipped Cream? " + whippedCream;
        priceMessage +="\nAdd Chocolate? " + chocolateCream;
        priceMessage +="\nQuantity: " + quantity;
        priceMessage +="\nTotal Price: " + price;
        priceMessage +="\n" + getString(R.string.thank);
        return priceMessage;
    }

}