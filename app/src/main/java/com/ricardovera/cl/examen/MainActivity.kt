package com.ricardovera.cl.examen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager: ViewPager = findViewById(R.id.viewPager)
        val tabLayout: TabLayout = findViewById(R.id.tabLayout)

        val pagerAdapter = OnboardingPagerAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter
        tabLayout.setupWithViewPager(viewPager)

        val btnIngreso: Button = findViewById(R.id.ingreso)
        btnIngreso.setOnClickListener {
            // Abre pantalla  login al hacer clic en el botón "Ingresar"
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }



    }
}
