package com.example.myapplication.utils

import com.example.myapplication.utils.Constants.OPEN_GOOGLE
import com.example.myapplication.utils.Constants.OPEN_SEARCH

object BotResponse {

    fun basicResponses(_message: String): String{
        val random = (0..2).random()
        val message = _message.toLowerCase()

        return when{
            //Hola
            message.contains("hola") -> {
                when (0){
                    0 -> "Hola mi nombre es Kitabu, ¿en que puedo ayudarte?"
                    else -> "error"
                }
            }

            //Buenos dia
            message.contains("buen día") -> {
                when (0){
                    0 -> "Buen día, mi nombre es Kitabu, ¿en qué puedo ayudarte?"
                    else -> "error"
                }
            }

            message.contains("buen dia") -> {
                when (0){
                    0 -> "Buen día, mi nombre es Kitabu, ¿en qué puedo ayudarte?"
                    else -> "error"
                }
            }

            //Buenos días
            message.contains("buenos días") -> {
                when (0){
                    0 -> "Buenos días, mi nombre es Kitabu, ¿en qué puedo ayudarte?"
                    else -> "error"
                }
            }
            //Buenos días 2
            message.contains("buenos dias") -> {
                when (0){
                    0 -> "Buenos días, mi nombre es Kitabu, ¿en qué puedo ayudarte?"
                    else -> "error"
                }
            }

            //Buenas tardes
            message.contains("buenas tardes") -> {
                when (0){
                    0 -> "Buenas tardes, mi nombre es Kitabu, ¿en qué puedo ayudarte?"
                    else -> "error"
                }
            }

            //Buenas noches
            message.contains("buenas noches") -> {
                when (0){
                    0 -> "Buenas noches, mi nombre es Kitabu, ¿en qué puedo ayudarte?"
                    else -> "error"
                }
            }

            //Primaria
            message.contains("como estas?") -> {
                when (0){
                    0 -> "Muy bien, gracias por preguntar."
                    else -> "error"
                }
            }
            message.contains("cómo estás?") -> {
                when (0){
                    0 -> "Muy bien, gracias por preguntar."
                    else -> "error"
                }
            }

            message.contains("qué es kitabu?") -> {
                when (0){
                    0 -> "Kitabu es una biblioteca digital, en la cual podras econtrar una gran variedad libros, especialmente de grados academicos como priamaria y secundaria."
                    else -> "error"
                }
            }

            message.contains("qué es kitabu?") -> {
                when (0){
                    0 -> "Kitabu es una biblioteca digital, en la cual podras econtrar una gran variedad libros, especialmente de grados academicos como priamaria y secundaria."
                    else -> "error"
                }
            }

            message.contains("que es kitabu?") -> {
                when (0){
                    0 -> "Kitabu es una biblioteca digital, en la cual podras econtrar una gran variedad libros, especialmente de grados academicos como priamaria y secundaria."
                    else -> "error"
                }
            }

            message.contains("¿que es kitabu?") -> {
                when (0){
                    0 -> "Kitabu es una biblioteca digital, en la cual podras econtrar una gran variedad libros, especialmente de grados academicos como priamaria y secundaria."
                    else -> "error"
                }
            }




            //Tirar moneda
            message.contains("tirar") && message.contains("moneda") -> {
                var r = (0..1).random()
                val result = if (r==0) "Aguila" else "Sol"

                "Tire la moneda y callo $result"
            }


            //Resorver Operaciones
            message.contains("resolver") -> {
                val equation: String = message.substringAfter("Resolver")

                return try {
                    val aswer = SolveMath.solveMath(equation ?: "0")
                    aswer.toString()

                }catch (e: Exception){
                    "Lo siento, no pude resolver lo anterior"
                }
            }


            //Decir la hora
            message.contains("hora") && message.contains("?") ->{
                Time.timeStamp()
            }

            message.contains("abrir") && message.contains("google") -> {
                OPEN_GOOGLE
            }

            message.contains("buscar") -> {
                OPEN_SEARCH
            }

            //Error de teclado
            else->{
                when (random){
                    0 -> "No entendi, Lo siento.."
                    1 -> "Intenta otra vez"
                    2 -> "No lo se..."
                    else -> "error"
                }
            }


        }
    }

}