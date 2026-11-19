package com.healthapp.login
object LoginValidator {
    fun esCorreoValido(c: String) = c.contains("@") && c.contains(".")
    fun esContrasenaValida(p: String) = p.length >= 8
}
