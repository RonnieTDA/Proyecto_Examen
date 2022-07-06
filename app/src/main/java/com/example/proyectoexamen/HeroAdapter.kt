package com.example.proyectoexamen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_superhero.view.*


class HeroAdapter(val superhero:List<SuperHero>):RecyclerView.Adapter<HeroAdapter.HeroHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layouInflater=LayoutInflater.from(parent.context)
        return HeroHolder(layouInflater.inflate(R.layout.item_superhero,parent,false))
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
      holder.render(superhero[position])
    }

    override fun getItemCount(): Int {
       return superhero.size;
    }


    class HeroHolder(val view: View):RecyclerView.ViewHolder(view){
        fun render(superhero: SuperHero){
  view.tvRealName.text=superhero.realName
  view.tvsuperheroName.text=superhero.superHeroName
  view.tvpublisher.text=superhero.publisher
            Picasso.get().load(superhero.image).into(view.ivHero)
        }
    }

}