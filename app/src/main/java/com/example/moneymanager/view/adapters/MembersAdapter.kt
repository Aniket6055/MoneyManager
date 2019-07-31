package com.example.moneymanager.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.moneymanager.R


class MembersAdapter(private val list: ArrayList<String>)
    : RecyclerView.Adapter<MemberViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MemberViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        val name: String = list[position]
        holder.bind(name)
    }

    override fun getItemCount(): Int = list.size

}


class MemberViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.member_list_item, parent, false)) {
    private var tvMemberName: TextView? = null

    init {
        tvMemberName = itemView.findViewById(R.id.tvMemberName)
    }

    fun bind(name: String) {
        tvMemberName?.text = name
    }

}