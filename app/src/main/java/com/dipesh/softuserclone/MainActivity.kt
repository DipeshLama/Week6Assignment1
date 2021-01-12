package com.dipesh.softuserclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.dipesh.softuserclone.fragments.AboutFragment
import com.dipesh.softuserclone.fragments.AddStudentFragment
import com.dipesh.softuserclone.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigation:BottomNavigationView
    lateinit var homeFragment:HomeFragment
    lateinit var addStudentFragment:AddStudentFragment
    lateinit var aboutUsFragment:AboutFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        homeFragment=HomeFragment()
        addStudentFragment=AddStudentFragment()
        aboutUsFragment=AboutFragment()

        makeCurrentFragment(homeFragment)
        bottomNavigation=findViewById(R.id.bottomNavigation)

        bottomNavigation.setOnNavigationItemSelectedListener {item->
            when(item.itemId){
                R.id.icHome ->makeCurrentFragment(homeFragment)
                R.id.icAddStudent ->makeCurrentFragment(addStudentFragment)
                R.id.icAbout ->makeCurrentFragment(aboutUsFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flWrapper,fragment)
            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            commit()
        }

}