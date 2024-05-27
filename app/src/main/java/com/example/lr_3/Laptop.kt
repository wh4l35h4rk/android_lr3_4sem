package com.example.lr_3

class Laptop (
    val model: String,
    val cpu: String,
    val ram: String
) {
    companion object {
        val item_list2 = listOf(
            Laptop(model="Acer Swift Go 14", cpu="Intel Core Ultra 9", ram="DRAM LPDDR5X-6400"),
            Laptop(model="ASUS Zenbook 14 OLED", cpu="Intel Core Ultra 7", ram="idk"))
        val item_list = listOf(
            mapOf(
                "model" to "Acer Swift Go 14",
                "ram" to "DRAM LPDDR5X-6400",
                "cpu" to "Intel Core Ultra 9"
            ), mapOf(
                "model" to "ASUS Zenbook 14 OLED",
                "cpu" to "Intel Core Ultra 7",
                "ram" to "idk"
            ), mapOf(
                "model" to "Acer Swift Go 14",
                "ram" to "DRAM LPDDR5X-6400",
                "cpu" to "Intel Core Ultra 9"
            ), mapOf(
                "model" to "ASUS Zenbook 14 OLED",
                "cpu" to "Intel Core Ultra 7",
                "ram" to "idk"
            ), mapOf(
                "model" to "Acer Swift Go 14",
                "ram" to "DRAM LPDDR5X-6400",
                "cpu" to "Intel Core Ultra 9"
            ), mapOf(
                "model" to "ASUS Zenbook 14 OLED",
                "cpu" to "Intel Core Ultra 7",
                "ram" to "idk"
            ), mapOf(
                "model" to "Acer Swift Go 14",
                "ram" to "DRAM LPDDR5X-6400",
                "cpu" to "Intel Core Ultra 9"
            ), mapOf(
                "model" to "ASUS Zenbook 14 OLED",
                "cpu" to "Intel Core Ultra 7",
                "ram" to "idk"
            )
        )

        fun set_item(i: Int): Map<String, String> {
            return item_list[i]
        }
    }
}
