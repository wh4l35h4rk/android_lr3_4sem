package com.example.lr_3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainVm : ViewModel() {

    val query =  MutableLiveData<String>("")
    val item_list = MutableLiveData<List<Laptop>>(Laptop.item_list2)

    fun updateQuery(newValue: String) {
        query.value = newValue
        if (query.value != "") {
            item_list.value = Laptop.item_list2.filter { it.model.contains(newValue) }
        } else {
            item_list.value = Laptop.item_list2
        }

    }

}