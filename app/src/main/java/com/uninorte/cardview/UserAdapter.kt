package com.uninorte.k_recycleview_video

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.uninorte.cardview.R
import com.uninorte.cardview.data.User
import com.uninorte.cardview.databinding.TarjetaBinding

class UserAdapter(private val mValues: List<User>)
    : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UserAdapter.ViewHolder {
        var binder: TarjetaBinding
        binder = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.tarjeta, parent, false)
        return ViewHolder(binder)
    }

    override fun getItemCount(): Int = mValues.size

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        val item = mValues[position]
        holder.mView.user = item
        holder.mView.executePendingBindings()
    }

    public fun updateData(){
        notifyDataSetChanged()
    }

    inner class ViewHolder(val mView: TarjetaBinding): RecyclerView.ViewHolder(mView.root){

    }


}