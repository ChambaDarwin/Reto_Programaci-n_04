package app.aplicacion.retoprogramacin_03.util

sealed class CategoryM(var isSelectedFalse: Boolean = false) {

    object Drama : CategoryM()
    object Suspenso : CategoryM()
    object Accion : CategoryM()
    object Comedia : CategoryM()
    object Terror : CategoryM()
    object Fantasia : CategoryM()
}
