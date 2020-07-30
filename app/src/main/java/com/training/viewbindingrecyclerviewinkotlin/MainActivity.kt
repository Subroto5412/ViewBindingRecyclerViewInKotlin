package com.training.viewbindingrecyclerviewinkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.training.viewbindingrecyclerviewinkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var entitNewsArrayList: ArrayList<EntitNews>
    lateinit var x: ArrayList<EntitNews>
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(getLayoutInflater())
        setContentView(binding.getRoot())
        layoutManager = LinearLayoutManager(this@MainActivity)
        binding.myRecyclerView.setLayoutManager(layoutManager)

        val customAdapter = CustomAdapter(data(), this)
        binding.myRecyclerView.setAdapter(customAdapter)
    }

    fun data(): ArrayList<EntitNews> {
        entitNewsArrayList = ArrayList()
        entitNewsArrayList.add(
            EntitNews(
                "Australia",
                ("Coronavirus: Australia's Victoria records huge case jump")
            )
        )
        entitNewsArrayList.add(
            EntitNews(
                "USA",
                "Donald Trump suggests delay to 2020 US presidential election"
            )
        )
        entitNewsArrayList.add(
            EntitNews(
                "Asia",
                "Domino's New Zealand drops 'free pizza for Karen' offer after backlash"
            )
        )
        entitNewsArrayList.add(
            EntitNews(
                "Tokyo",
                "Tokyo 2020: Olympics and Paralympics may have 'limited spectators'"
            )
        )
        entitNewsArrayList.add(
            EntitNews(
                "Africa",
                "Killer of Rafiki, Uganda's rare silverback mountain gorilla, jailed"
            )
        )
        entitNewsArrayList.add(
            EntitNews(
                "China",
                "Hong Kong bars 12 opposition candidates from election"
            )
        )
        entitNewsArrayList.add(
            EntitNews(
                "Canada",
                "Herman Cain, US ex-presidential candidate, dies after contracting Covid"
            )
        )
        return entitNewsArrayList
    }
}


