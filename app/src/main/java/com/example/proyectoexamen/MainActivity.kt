package com.example.proyectoexamen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var superheroes:List<SuperHero> = listOf(

        SuperHero(superHeroName="Spiderman",realName="Peter Parker",publisher="Marvel",image= "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"),



   // /(Superhero(superHeroName="Spiderman", realName="Marvel", "Peter Parker",))
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()
    }

    fun initRecycler(){
        rvSuperHero.layoutManager=LinearLayoutManager(this)
        val adapter=HeroAdapter(superheroes)
        rvSuperHero.adapter=adapter

    }
}