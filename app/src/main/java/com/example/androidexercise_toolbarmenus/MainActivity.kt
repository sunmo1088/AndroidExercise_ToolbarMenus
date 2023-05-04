package com.example.androidexercise_toolbarmenus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.androidexercise_toolbarmenus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val toolbar = binding.myToolbar
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when(item.itemId) {
//            R.id.miContact -> Toast.makeText(this, "You clicked on Add Contact", Toast.LENGTH_LONG).show()
//            R.id.miFavorite -> Toast.makeText(this, "You clicked on Favorites", Toast.LENGTH_LONG).show()
//            R.id.miSettings -> Toast.makeText(this, "You clicked on Settings", Toast.LENGTH_LONG).show()
//            R.id.miClose -> finish()
//            R.id.miFeedback -> Toast.makeText(this, "You clicked on Feedback", Toast.LENGTH_LONG).show()
//        }
//        return true
//    }
}