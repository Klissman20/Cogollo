package com.cannabis.cogollo

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.cannabis.cogollo.fragments.GrowFragment
import com.cannabis.cogollo.fragments.HuntFragment
import com.cannabis.cogollo.fragments.SeekFragment
import com.cannabis.cogollo.fragments.ShopFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity(){

    lateinit var bottomNavigation: BottomNavigationView
    lateinit var myToolbar: Toolbar
    lateinit var layout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myToolbar = findViewById(R.id.toolbar)
        setSupportActionBar(myToolbar)
        layout = findViewById(R.id.ly_main)
        bottomNavigation = findViewById(R.id.bottomNavigationView)

        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        layout.background = ContextCompat.getDrawable(applicationContext, R.drawable.bg_main_green)
        myToolbar.logo = ContextCompat.getDrawable(
            applicationContext,
            R.drawable.logo_green
        )
        bottomNavigation.setBackgroundColor(
            ContextCompat.getColor(
                applicationContext,
                R.color.bg_nav_green
            )
        )
        val growFragment = GrowFragment.newInstance()
        openFragment(growFragment)
    }


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {

            R.id.buscar_item -> {
                layout.background = ContextCompat.getDrawable(applicationContext, R.drawable.bg_main_yellow)
                myToolbar.logo = ContextCompat.getDrawable(applicationContext, R.drawable.logoo)
                bottomNavigation.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                R.color.bg_nav_yellow
                )
                )
                val seekFragment = GrowFragment.newInstance()
                openFragment(seekFragment)
                return@OnNavigationItemSelectedListener true
            }

            R.id.cazar_item -> {
                layout.background = ContextCompat.getDrawable(applicationContext, R.drawable.bg_main_red)
                myToolbar.logo = ContextCompat.getDrawable(applicationContext, R.drawable.logo_red)
                bottomNavigation.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.bg_nav_red
                    )
                )
                val huntFragment = HuntFragment.newInstance()
                openFragment(huntFragment)
                return@OnNavigationItemSelectedListener true
            }

            R.id.grow_item -> {
                layout.background = ContextCompat.getDrawable(applicationContext, R.drawable.bg_main_green)
                myToolbar.logo = ContextCompat.getDrawable(
                    applicationContext,
                    R.drawable.logo_green
                )
                bottomNavigation.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.bg_nav_green
                    )
                )
                val growFragment = GrowFragment.newInstance()
                openFragment(growFragment)
                return@OnNavigationItemSelectedListener true
            }

            R.id.shop_item -> {
                layout.background = ContextCompat.getDrawable(applicationContext, R.drawable.bg_main_blue)
                myToolbar.logo = ContextCompat.getDrawable(applicationContext, R.drawable.logoo)
                bottomNavigation.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.bg_nav_blue
                    )
                )
                val shopFragment = ShopFragment.newInstance()
                openFragment(shopFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }


    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}