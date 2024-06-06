package com.example.lr_3

class Laptop (
    val model: String,
    val cpu: String,
    val ram: String
) {
    companion object {
        val item_list2 = listOf(
            Laptop(model="Acer Swift Go 14", cpu="Intel Core Ultra 9", ram="16 GB"),
            Laptop(model="ASUS Zenbook 14", cpu="Intel Core Ultra 7", ram="idk"),
            Laptop("Acer Aspire 3", "Ryzen 7 3700U", "8 GB"),
            Laptop("Acer Nitro 5", "AMD Ryzen 7 5800H", "16 GB"))
    }
}
