package com.example.lr_3

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.lr_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var vm: MainVm
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm = ViewModelProvider (this).get(MainVm::class.java)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val list = mutableListOf<Laptop>()
        for (i in 0..< vm.item_list.value!!.size) {
            list.add(Laptop(
                model=vm.item_list.value!![i].model,
                cpu=vm.item_list.value!![i].cpu,
                ram=vm.item_list.value!![i].ram))
        }
        binding.recycler.adapter = LaptopListAdapter(list, applicationContext)

        findViewById<Button>(R.id.button).setOnClickListener {
            vm.updateQuery(findViewById<TextView>(R.id.model_input_edit_text).text.toString())
            recreate()
        }

        vm.query.observe(this) {
            findViewById<TextView>(R.id.model_input_edit_text).text = it.toString()
        }

    }

    fun onClickCalled(newValue: String?) {
        Log.d("test!!! new val is:", newValue.toString())
        vm.updateQuery(newValue!!)
    }

}