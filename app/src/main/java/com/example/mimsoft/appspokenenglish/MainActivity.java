package com.example.mimsoft.appspokenenglish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.example.mimsoft.appspokenenglish.models.WordDetail;
import com.example.mimsoft.appspokenenglish.models.WordGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();
    int flag = -1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Init top level data
        List<String> letters = new ArrayList<>();
        String[] lettersArr = getResources().getStringArray(R.array.items_array_expandable_level_one);
        Collections.addAll(letters, lettersArr);
        final ExpandableListView mExpandableListView = (ExpandableListView) findViewById(R.id.expandableListView_Parent);

        if (mExpandableListView != null) {
/*
            ParentLevelAdapter parentLevelAdapter = new ParentLevelAdapter(this, listDataHeader);
            mExpandableListView.setAdapter(parentLevelAdapter);


            // display only one expand item
//            mExpandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
//                int previousGroup = -1;
//                @Override
//                public void onGroupExpand(int groupPosition) {
//                    if (groupPosition != previousGroup)
//                        mExpandableListView.collapseGroup(previousGroup);
//                    previousGroup = groupPosition;
//                }
//            });
*/
            Log.i(TAG, "onCreate:size: " + lettersArr.length);
            List<WordGroup> list = new ArrayList<>();
            for (String letter : lettersArr) {
                WordGroup wordGroup = new WordGroup();
                wordGroup.title = letter;
                list.add(wordGroup);
                Log.i(TAG, "onCreate: " + letter);
                String[] wordsOfLetterArr,wordmean = new String[10];
                switch (letter) {
                    case "A":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_one_child);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one2);
                        break;
                    case "B":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child1);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_two2);
                        break;
                    case "C":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child2);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_two3);  break;
                    case "D":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child3);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_two4);
                        break;
                    case "E":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child4);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_two5);
                        break;
                    case "F":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child5);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_two6);
                        break;
                    case "G":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child6);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two7);
                        break;
                    case "H":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child7);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two8);
                        break;
                    case "I":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child8);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two9);
                        break;
                    case "J":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child9);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two10);
                        break;
                    case "K":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child10);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two11);
                        break;
                    case "L":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child11);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two12);
                        break;
                    case "M":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child12);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two13);
                        break;
                    case "N":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child13);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two14);
                        break;
                    case "O":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child14);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two15);
                        break;
                    case "P":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child15);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two16);
                        break;
                    case "Q":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child16);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two17);
                        break;
                    case "R":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child17);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two18);
                        break;
                    case "S":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child18);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two19);
                        break;
                    case "T":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child19);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two20);
                        break;
                    case "U":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child20);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two21);
                        break;
                    case "v":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child21);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two22);
                        break;
                      case "W":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child22);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two23);
                        break;
                    case "Y":
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_one_two_child23);
                        wordmean=getResources().getStringArray(R.array.items_array_expandable_level_one_two24);
                        break;
                    default:
                        wordsOfLetterArr = getResources().getStringArray(R.array.items_array_expandable_level_two2);
                }
                List<WordDetail> wordDetails = new ArrayList<>();
                for (int i = 0; i < wordsOfLetterArr.length-1; i++) {
                    WordDetail detail = new WordDetail();
                    detail.word = wordsOfLetterArr[i];
                    detail.meaning = wordmean[i];
                    wordDetails.add(detail);
                }    wordGroup.wordDetails = wordDetails;
            }


            AnotherAdapter anotherAdapter = new AnotherAdapter(this, list);
            mExpandableListView.setAdapter(anotherAdapter);

            mExpandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
                @Override
                public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                    if (flag == groupPosition){
                        mExpandableListView.collapseGroup(groupPosition);
                        flag = -1;
                        return true;
                    }
                    if (flag != -1
                            && groupPosition != flag) {
                        mExpandableListView.collapseGroup(flag);
                    }
                    flag = groupPosition;
                    mExpandableListView.expandGroup(groupPosition);
                    mExpandableListView.setSelectedGroup(groupPosition);
                    return true;
                }
            });

//            mExpandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
//
//                @Override
//                public void onGroupExpand(int groupPosition) {
//                    if (flag != -1
//                            && groupPosition != flag) {
//                        mExpandableListView.collapseGroup(flag);
//                    }
//                    flag = groupPosition;
//                    mExpandableListView.setSelected(true);
//                }
//            });        mExpandableListView.smoothScrollToPositionFromTop(mExpandableListView.getCount()*2, 10, 5000);


        }


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


    }

    public void onClick(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);


    }


    public void about(View v) {
        Intent i = new Intent(this, about.class);
        startActivity(i);
    }


    public void work(View v) {
        Intent i = new Intent(this, web_key_solution.class);
        startActivity(i);

    }

    /*@Override
    public  void onListItemClick(ListView parent, View v,
                                 int position, long id) {
        Toast.makeText(this, "You have selected " + name[position],
                Toast.LENGTH_SHORT).show();

        TextView textView = (TextView) findViewById(R.id.textView);

        textView.setText(p[position]);
    }
*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}


