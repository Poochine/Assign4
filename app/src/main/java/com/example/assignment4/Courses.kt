package com.example.assignment4

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import java.util.ArrayList


class Courses : AppCompatActivity() {
    // creating variables for our list view.
    private var coursesLV: ListView? = null


    // creating a new array list.
    var coursesArrayList: ArrayList<String?>? = null

    // creating a variable for database reference.
    private var reference: DatabaseReference? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        // initializing variables for listviews.
        coursesLV = findViewById(R.id.Rv_courselist)

        // initializing our array list
        coursesArrayList = ArrayList()

        // calling a method to get data from
        // Firebase and set data to list view
        initializeListView()
    }

    private fun initializeListView() {
        // creating a new array adapter for our list view.
        val adapter =ArrayAdapter<String?>(this, android.R.layout.simple_dropdown_item_1line,)

        // below line is used for getting reference
        // of our Firebase Database.
        reference = FirebaseDatabase.getInstance().getReference("Courses")

        // in below line we are calling method for add child event
        // listener to get the child of our database.
        reference!!.addChildEventListener(object : ChildEventListener {
            override fun onChildAdded(snapshot: DataSnapshot, previousChildName: String?) {
                // this method is called when new child is added to
                // our data base and after adding new child
                // we are adding that item inside our array list and
                // notifying our adapter that the data in adapter is changed.
                coursesArrayList!!.add(snapshot.getValue(String::class.java))
                adapter.notifyDataSetChanged()
            }

            override fun onChildChanged(snapshot: DataSnapshot, previousChildName: String?) {
                // this method is called when the new child is added.
                // when the new child is added to our list we will be
                // notifying our adapter that data has changed.
                adapter.notifyDataSetChanged()
            }

            override fun onChildRemoved(snapshot: DataSnapshot) {
                // below method is called when we remove a child from our database.
                // inside this method we are removing the child from our array list
                // by comparing with it's value.
                // after removing the data we are notifying our adapter that the
                // data has been changed.
                coursesArrayList!!.remove(snapshot.getValue(String::class.java))
                adapter.notifyDataSetChanged()
            }

            override fun onChildMoved(snapshot: DataSnapshot, previousChildName: String?) {
                // this method is called when we move our
                // child in our database.
                // in our code we are note moving any child.
            }

            override fun onCancelled(error: DatabaseError) {
                // this method is called when we get any
                // error from Firebase with error.
            }
        })
        // below line is used for setting
        // an adapter to our list view.
        coursesLV!!.adapter = adapter
    }
}


