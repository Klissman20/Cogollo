package com.cannabis.cogollo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cannabis.cogollo.R


class ShopFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_shop, container, false)
    }

    companion object {
        fun newInstance(): ShopFragment = ShopFragment()
    }
}