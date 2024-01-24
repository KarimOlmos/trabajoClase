package com.example.proyectoclase

sealed class Routes(val ruta: String){
    object pInicio : Routes("pInicio")
    object pCalc : Routes("pCalc")
    object pInfo : Routes("pInfo")

}
