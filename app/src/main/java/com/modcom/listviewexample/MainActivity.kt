package com.modcom.listviewexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var array = arrayOf("Apples","Apricots","Avocado","Banana",
    "Blackberries","Blueberries","Breadfruit","Melon","Cherries",
        "Durian","Guava","Honeydew melon","Kiwifruit","Lemon",
        "Olives","Orange","Passion Fruit")

    //Create content for atleast 2 fruits
    //Use HTML to do content
    //Creates assets folder
    //right click on app - New - Folder - assest
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //create an array adapter to bring list_item and
        //your array items together
        val adapter = ArrayAdapter(this,
        R.layout.listview_item, array)
        //find listview and set adapter(17) to it
        val listView = findViewById(R.id.listview_1) as ListView
        listView.adapter =adapter

        listView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val itemValue = listView.getItemAtPosition(p2) as String
                Toast.makeText(applicationContext, "You pick $itemValue ",
                Toast.LENGTH_LONG).show()
                //create a new page/activity
                //right click on app, new activity - empty
                //we link to the new Page/Activity
                //Intents
                //Yypes
               // 1. Explicit - link within your app
               // 2. Implicit - link outside app - website,
                //we do explicit intent to HospitalDisplay
                val intent = Intent(applicationContext, HospitalDisplay::class.java)
                //as we go tyo hospital display , carry the postion,p2 carries position of clicked
                //item
                intent.putExtra("position",p2)
                startActivity(intent)
                //ImageView,WebViews - Implicit
                //
            }
        }
        //done

    }//end
}//end