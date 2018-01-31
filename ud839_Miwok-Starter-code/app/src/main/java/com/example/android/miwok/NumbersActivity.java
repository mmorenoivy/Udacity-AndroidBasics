package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
/**
        String[] words = new String[10];
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "eight";
        words[8] = "nine";
        words[9] = "ten";**/


        //  ArrayList<String> words = new ArrayList<String>();
        //since we created a Generic class called Word, let us use it as a type
        ArrayList<Word> words = new ArrayList<Word>();

        //words.add("one");
        words.add(new Word(R.drawable.number_one, "one","lutti"));
        words.add(new Word(R.drawable.number_two, "two", "otiiko"));
        words.add(new Word(R.drawable.number_three,"three", "tolookosu"));
        words.add(new Word(R.drawable.number_four,"four", "oyyisa"));
        words.add(new Word(R.drawable.number_five,"five", "massokka"));
        words.add(new Word(R.drawable.number_six,"six", "temmokka"));
        words.add(new Word(R.drawable.number_seven,"seven", "kenekaku"));
        words.add(new Word(R.drawable.number_eight,"eight", "kawinta"));
        words.add(new Word(R.drawable.number_nine,"nine", "wo’e"));
        words.add(new Word(R.drawable.number_ten,"ten", "na’aacha"));
        /**
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
       **/

        //switch to arrayadapter and list view for recycler view
        //this adapter knows how to create the list items for each item in the list
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        //android.R.layout.simple_list_item_1 when creating an arrayadapter, this is the default layout android has created

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

      /**  LinearLayout rootview = (LinearLayout) findViewById(R.id.rootView); //parentview
       TextView word = new TextView(this); //childview
        word.setText(words.get(0));
        //add the childview to parent
        rootview.addView(word);

        TextView word2 = new TextView(this); //childview - this kind of setup is going to create redundant codes
        word2.setText(words.get(1));
        //add the childview to parent
        rootview.addView(word2);**/

       //Instead of repeating and initializing textview over an over, use a loop to display the words
/**        int x = 0;

        while(x < words.size())
        {
            TextView word = new TextView(this); //childview
            word.setText(words.get(x));
            //add the childview to parent
            rootview.addView(word);
            x++;
        }**/



    }
}
