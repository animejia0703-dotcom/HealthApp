package com.healthapp.pacientes
data class Paciente(val nombre: String, val edad: Int)
class RegistroPaciente { val lista = mutableListOf<Paciente>() }
