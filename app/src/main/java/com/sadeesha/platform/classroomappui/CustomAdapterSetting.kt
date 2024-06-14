package com.sadeesha.platform.classroomappui

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CustomAdapterSetting(var context: Activity, var name: Array<String>, var num: Array<String>) :
    ArrayAdapter<String?>(
        context, R.layout.setting, name
    ) {
    var medium_text: TextView? = null
    var small_text: TextView? = null

    override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val v = inflater.inflate(R.layout.setting, null, true)
        medium_text = v.findViewById<View>(R.id.medium_text) as TextView
        small_text = v.findViewById<View>(R.id.small_text) as TextView
        medium_text!!.text = name[position]
        small_text!!.text = num[position]
        return v
    }
}
