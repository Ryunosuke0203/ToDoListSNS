package xyz.ryujpn.mymessenger

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {



    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, HomeFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_talk -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, TalkFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_setting -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout,SettingFragment())
                    .commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, HomeFragment())
            .commit()

       navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}