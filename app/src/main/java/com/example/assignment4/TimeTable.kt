package com.example.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class TimeTable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_table)

//Reads faculty list from items in strings.xml file
        val timetableList: Array<String> = resources.getStringArray(R.array.timetable)
//Creates adapter that sets list type and list item
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, timetableList)

        val listView: ListView = findViewById(R.id.lvTime_Table)
//ListView control populated with list items
        listView.adapter = adapter



    }
}