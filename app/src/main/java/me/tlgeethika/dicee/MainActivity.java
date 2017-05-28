package me.tlgeethika.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.R.attr.button;
import static android.R.attr.drawable;
import static android.R.attr.right;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        define a button for our roll button and assign rollButton we used in layouts

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

//        do the same with left and right imageviews.i.e., refer the element in xml with id image_leftDice as leftDice in java.We will later put some image in that varibale.

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

//        create an array to hold dice images
      final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

//        set and define a listener for rollButton
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "The button is clicked");
                Random randomNumGenerator = new Random();
                int number = randomNumGenerator.nextInt(6);

//               Log.d("Dicee", "the number generated is " + leftNumber);
                leftDice.setImageResource(diceArray[number]);
//                So we can either generate a new variable for using rightImage or store another random number in existing "number" varibale.
                number = randomNumGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);




            }
        });



    }
}
