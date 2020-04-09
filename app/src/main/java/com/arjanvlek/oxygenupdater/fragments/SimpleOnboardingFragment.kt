package com.arjanvlek.oxygenupdater.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.arjanvlek.oxygenupdater.R

/**
 * Contains the basic/non-interactive onboarding fragments
 *
 * @author [Adhiraj Singh Chauhan](https://github.com/adhirajsinghchauhan)
 */
class SimpleOnboardingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = super.onCreateView(inflater, container, savedInstanceState).let {
        when (arguments?.getInt(ARG_PAGE_NUMBER, 0)) {
            1 -> inflater.inflate(R.layout.fragment_onboarding_welcome, container, false)
            4 -> inflater.inflate(R.layout.fragment_onboarding_complete, container, false)
            else -> null
        }
    }

    companion object {
        /**
         * The fragment argument representing the page number for this fragment.
         */
        const val ARG_PAGE_NUMBER = "page_number"

        /**
         * Returns a new instance of this fragment for the given page number.
         */
        fun newInstance(pageNumber: Int) = SimpleOnboardingFragment().apply {
            arguments = bundleOf(ARG_PAGE_NUMBER to pageNumber)
        }
    }
}
