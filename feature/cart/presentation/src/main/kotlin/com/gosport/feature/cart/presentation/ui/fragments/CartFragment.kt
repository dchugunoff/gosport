package com.gosport.feature.cart.presentation.ui.fragments

import by.kirich1409.viewbindingdelegate.viewBinding
import com.gosport.core.presentation.foundation.fragments.withoutViewModel.Fragment
import com.gosport.gosporttechnicaltask.feature.cart.presentation.R
import com.gosport.gosporttechnicaltask.feature.cart.presentation.databinding.FragmentCartBinding

class CartFragment : Fragment<FragmentCartBinding>(R.layout.fragment_cart) {

    override val binding by viewBinding(FragmentCartBinding::bind)
}