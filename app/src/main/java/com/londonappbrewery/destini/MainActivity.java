package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    Button mRedButton;
    Button mBlueButton;
    TextView mStoryText;
    // TODO: Steps 4 & 8 - Declare member variables here:
    int mIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = (TextView) findViewById(R.id.storyTextView);
        mRedButton = (Button) findViewById(R.id.buttonTop);
        mBlueButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIndex==1 || mIndex==2) {
                    mStoryText.setText(R.string.T3_Story);
                    mRedButton.setText(R.string.T3_Ans1);
                    mBlueButton.setText(R.string.T3_Ans2);
                    mIndex = 3;
                }
                else if (mIndex == 3) {
                        mStoryText.setText(R.string.T6_End);
                        mBlueButton.setVisibility(View.GONE);
                        mRedButton.setVisibility(View.GONE);
                }
                else if (mIndex==2){
                    mStoryText.setText(R.string.T3_Story);
                    mRedButton.setText(R.string.T3_Ans1);
                    mBlueButton.setText(R.string.T3_Ans2);
                    mIndex = 3;
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mIndex==1) {
                    mStoryText.setText(R.string.T2_Story);
                    mRedButton.setText(R.string.T2_Ans1);
                    mBlueButton.setText(R.string.T2_Ans2);
                    mIndex = 2;
                }
                else if (mIndex == 2) {
                    mStoryText.setText(R.string.T4_End);
                    mBlueButton.setVisibility(View.GONE);
                    mRedButton.setVisibility(View.GONE);
                    }
                    else if(mIndex ==3){
                    mStoryText.setText(R.string.T5_End);
                    mBlueButton.setVisibility(View.GONE);
                    mRedButton.setVisibility(View.GONE);

                }
                }


            });

    }
}
