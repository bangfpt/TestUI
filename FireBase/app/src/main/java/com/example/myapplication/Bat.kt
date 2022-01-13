package com.example.myapplication

import com.example.myapplication.Interface.Animal
import com.example.myapplication.Interface.Bird

class Bat: Animal, Bird {

    override fun walk() {
        super.walk()
    }

    override fun eat() {
        super<Animal>.eat()
        super<Bird>.eat()

    }

    override fun fly() {
        super.fly()
    }
}

