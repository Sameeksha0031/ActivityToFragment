package com.example.activitytofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.activitytofragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.button.setOnClickListener {
            val firstFragment = FirstFragment()
            val fragment : Fragment ?=

            supportFragmentManager.findFragmentByTag(FirstFragment::class.java.simpleName)
            if(fragment !is Fragment){
                supportFragmentManager.beginTransaction()
                    .add(R.id.linearfragment_container,firstFragment,FirstFragment::class.java.simpleName)
                    .commit()
            }
        }
    }

}