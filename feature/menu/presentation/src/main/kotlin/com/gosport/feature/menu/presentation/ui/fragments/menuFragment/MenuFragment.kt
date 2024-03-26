package com.gosport.feature.menu.presentation.ui.fragments.menuFragment

import by.kirich1409.viewbindingdelegate.viewBinding
import com.gosport.core.presentation.foundation.fragments.Fragment
import com.gosport.gosporttechnicaltask.feature.menu.presentation.R
import com.gosport.gosporttechnicaltask.feature.menu.presentation.databinding.FragmentMenuBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MenuFragment : Fragment<FragmentMenuBinding, MenuViewModel>(R.layout.fragment_menu) {

    override val binding by viewBinding(FragmentMenuBinding::bind)

    override val viewModel by viewModel<MenuViewModel>()
}