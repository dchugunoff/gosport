package com.gosport.feature.profile.presentation.ui.fragments

import by.kirich1409.viewbindingdelegate.viewBinding
import com.gosport.core.presentation.foundation.fragments.withoutViewModel.Fragment
import com.gosport.gosporttechnicaltask.feature.profile.presentation.R
import com.gosport.gosporttechnicaltask.feature.profile.presentation.databinding.FragmentProfileBinding

class ProfileFragment: Fragment<FragmentProfileBinding>(R.layout.fragment_profile) {

    override val binding by viewBinding(FragmentProfileBinding::bind)
}