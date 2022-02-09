package com.example.myapplication

sealed class NavigationItem(var route:String,var icon: Int,var title:String,var selected:Boolean){
    object Home : NavigationItem("home", R.drawable.ic_home, "होम",true)
    object Parivar : NavigationItem("parivar", R.drawable.ic_customer, "परिवार",false)
    object Orders : NavigationItem("orders", R.drawable.ic_order, "ऑर्डर्स",false)
    object Customers : NavigationItem("customers", R.drawable.ic_customers, "कस्टमर्स",false)
    object Gullak : NavigationItem("gullak", R.drawable.ic_gullak_svg, "गुल्लक",false)
}
