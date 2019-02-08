package com.example.buttoncolorchange;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

// ***************************************************************************************************************
//    Programmer - Ethan Yu
//    Course - CS 211D
//    Assignment #2
//    This application produces four buttons, labeled different colors, and a line of text to display.
//    When a button is clicked on, the color of the text displayed changes to the color pertaining to the button.
// ***************************************************************************************************************

public class ButtonColorChange extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_color_change);
    }

    // Master onClick method
    public void onClickBtnAction(View v)
    {
        switch(v.getId())
        {
            case R.id.blueBtn: changeColorBlue();
            break;
            case R.id.redBtn: changeColorRed();
            break;
            case R.id.greenBtn: changeColorGreen();
            break;
            case R.id.yellowBtn: changeColorYellow();
            break;
        }
    }

    // Four methods for changing color of text display
    public void changeColorBlue()
    {
        TextView displayText = (TextView) findViewById(R.id.displayText);
        displayText.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.blue));
    }

    public void changeColorRed()
    {
        TextView displayText = (TextView) findViewById(R.id.displayText);
        displayText.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.red));
    }

    public void changeColorGreen()
    {
        TextView displayText = (TextView) findViewById(R.id.displayText);
        displayText.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.green));
    }

    public void changeColorYellow()
    {
        TextView displayText = (TextView) findViewById(R.id.displayText);
        displayText.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.yellow));
    }

}
