package com.kotlintutorial

import java.util.*

fun main() {
    val text: String = "O'zgaruvchilar har qanday dasturlashning muhim qismidir. Ular kompyuter dasturida qiymatlarni saqlash uchun ishlatiladigan kompyuter xotirasi joylariga beradigan nomlar va keyinchalik siz saqlangan qiymatlarni olish va ularni dasturingizda ishlatish uchun ushbu nomlardan foydalanasiz.\n" +
            "\n" +
            "Kotlin o'zgaruvchilari var yoki val kalit so'zlari yordamida yaratiladi va keyin yaratilgan o'zgaruvchilarga qiymat belgilash uchun = teng belgisi ishlatiladi."
    println(text)
    println(text.replace("\n","111111"))
}