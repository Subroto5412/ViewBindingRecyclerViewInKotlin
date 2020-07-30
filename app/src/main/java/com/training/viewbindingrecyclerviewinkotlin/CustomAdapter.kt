package com.training.viewbindingrecyclerviewinkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.training.viewbindingrecyclerviewinkotlin.databinding.EntityNewsBinding


class CustomAdapter(entitNewsArrayList: ArrayList<EntitNews>, context: Context) :
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
    internal var entitNewsArrayList: ArrayList<EntitNews>
    internal var context: Context

    init {
        this.entitNewsArrayList = entitNewsArrayList
        this.context = context
    }

    override fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType: Int): MyViewHolder {
        val li = LayoutInflater.from(context)
        return MyViewHolder(EntityNewsBinding.inflate(li))
    }

    override fun getItemCount(): Int {
        return entitNewsArrayList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.binding.tvCountry.setText(entitNewsArrayList.get(position).country + "")
        holder.binding.tvHeadline.setText(entitNewsArrayList.get(position).headlines + "")
    }

    class MyViewHolder internal constructor(b: EntityNewsBinding) :
        RecyclerView.ViewHolder(b.getRoot()) {
        internal var binding: EntityNewsBinding

        init {
            binding = b
        }
    }
}