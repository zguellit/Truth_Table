package com.zguellit.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // defining all buttons
        val true1 = findViewById<Button>(R.id.true1)
        val false1 = findViewById<Button>(R.id.false1)
        val or = findViewById<Button>(R.id.or)
        val and = findViewById<Button>(R.id.and)
        val true2 = findViewById<Button>(R.id.true2)
        val false2 = findViewById<Button>(R.id.false2)
        val result = findViewById<Button>(R.id.result)

        //defining boolean variables
        var flagFirstRow = true
        var flagSecondRow = true
        var flagThirdRow = true
        var firstRawBoolean: Boolean = true
        var secondRawBoolean: Boolean = false
        var booleanResult: Boolean = false
        var logicOperator: String = ""

        true1.setOnClickListener {
            firstRawBoolean = true
            if (flagFirstRow) {
                true1.setBackgroundColor(getColor(R.color.myGreen))
                false1.setBackgroundColor(getColor(R.color.myPink))
            } else
                true1.setBackgroundColor(getColor(R.color.myPink))
                flagFirstRow = !flagFirstRow
        }

        false1.setOnClickListener {
            firstRawBoolean = false
            flagFirstRow = !flagFirstRow
            if (flagFirstRow) {
                true1.setBackgroundColor(getColor(R.color.myPink))
                false1.setBackgroundColor(getColor(R.color.myGreen))
            } else {
                false1.setBackgroundColor(getColor(R.color.myPink))
            }

        }

        true2.setOnClickListener {
            secondRawBoolean = true
            if (flagThirdRow) {
                true2.setBackgroundColor(getColor(R.color.myGreen))
                false2.setBackgroundColor(getColor(R.color.myPink))
            }
            else
                true2.setBackgroundColor(getColor(R.color.myPink))
                flagThirdRow = !flagThirdRow
        }

        false2.setOnClickListener {
            secondRawBoolean = false

            flagThirdRow = !flagThirdRow
            if (flagThirdRow) {
                false2.setBackgroundColor(getColor(R.color.myGreen))
                true2.setBackgroundColor(getColor(R.color.myPink))
            }
            else
                false2.setBackgroundColor(getColor(R.color.myPink))
        }


        and.setOnClickListener {
            logicOperator = " && "
            if (flagSecondRow) {
                and.setBackgroundColor(getColor(R.color.myGreen))
                or.setBackgroundColor(getColor(R.color.myPink))
            }
            else
                and.setBackgroundColor(getColor(R.color.myPink))
                flagSecondRow = !flagSecondRow
        }

        or.setOnClickListener {

            logicOperator = " || "

            flagSecondRow = !flagSecondRow
            if (flagSecondRow) {
                or.setBackgroundColor(getColor(R.color.myGreen))
                and.setBackgroundColor(getColor(R.color.myPink))
            }
            else
                or.setBackgroundColor(getColor(R.color.myPink))


        }

        result.setOnClickListener {
            // it.setBackgroundColor(getColor(R.color.myGreen))
            if (logicOperator == " && ") {
                booleanResult = firstRawBoolean && secondRawBoolean
            } else if (logicOperator == " || ") {
                booleanResult = firstRawBoolean || secondRawBoolean
            }
            result.text = booleanResult.toString()
        }


    }
}