package com.example.studentportal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.portal.view.*

class PortalAdapter(private val portals: List<Portal>) : RecyclerView.Adapter<PortalAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.portal, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return portals.size
    }

    /**
     * Displays the data requested
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(portals[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val tvTitle: TextView = itemView.tvTitle
        private val tvUrl: TextView = itemView.tvUrl

        fun bind(portal: Portal) {
            tvTitle.text = portal.title
            tvUrl.text = portal.url
        }
    }
}