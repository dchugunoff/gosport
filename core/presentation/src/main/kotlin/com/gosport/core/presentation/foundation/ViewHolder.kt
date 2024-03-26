package com.gosport.core.presentation.foundation

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class ViewHolder<out Binding : ViewBinding, in Item : Any>(open val binding: Binding) :
    RecyclerView.ViewHolder(binding.root) {

    abstract fun onBind(model: Item)
}