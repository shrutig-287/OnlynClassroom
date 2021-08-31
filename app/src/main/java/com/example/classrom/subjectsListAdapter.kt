package com.example.classrom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar


class subjectsListAdapter: RecyclerView.Adapter<subjectsListAdapter.subjectViewholder>() {


    private val subCodes = arrayOf("Physics (PH - 100) ", "Mathematics (MA - 110)", "Chemistry(CH - 120)","Computer Science(CS - 150)")
    private val subTeach = arrayOf("Dr. Prakash", "Dr. Yashpreet", "Dr. Jagdeep","Dr. Urvashi ")




    inner class subjectViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        var subjectCode: TextView
        var subjectTeacher: TextView

        init {
            subjectCode = itemView.findViewById(R.id.subCode)
            subjectTeacher = itemView.findViewById(R.id.subTeacher)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): subjectViewholder {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.subject_list,parent,false)
return subjectViewholder(view)
    }

    override fun onBindViewHolder(holder: subjectViewholder, position: Int) {
      holder.subjectCode.text = subCodes[position]
        holder.subjectTeacher.text = subTeach[position]



    }

    override fun getItemCount(): Int {
        return subCodes.size

    }
}