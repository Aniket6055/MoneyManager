package com.example.moneymanager.view.activities

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moneymanager.R
import com.example.moneymanager.view.adapters.MembersAdapter
import kotlinx.android.synthetic.main.activity_add_group.*

class AddGroupActivity : AppCompatActivity() {


    private var memberList = ArrayList<String>()
    private var memberAdapter: MembersAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_group)
        rvMembers.layoutManager = LinearLayoutManager(this)
    }

    fun addMember(view: View) {
        if (!etAddMember.text.toString().isEmpty()) {
            memberList.add(etAddMember.text.toString())
            etAddMember.text.clear()
        }

        if (memberAdapter != null) {
            memberAdapter!!.notifyDataSetChanged()
        } else {
            memberAdapter = MembersAdapter(memberList)
            rvMembers.adapter = memberAdapter
        }
    }
}
