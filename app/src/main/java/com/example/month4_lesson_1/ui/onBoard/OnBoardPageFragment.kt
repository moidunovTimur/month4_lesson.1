package com.example.month4_lesson_1.ui.onBoard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.month4_lesson_1.R
import com.example.month4_lesson_1.databinding.FragmentOnBoardPageBinding


class OnBoardPageFragment(listenerSkip: () -> Unit, listenerNext: () -> Unit) : Fragment() {

    private lateinit var listenerSkip: () -> Unit
    private lateinit var listenerNext: () -> Unit



        private lateinit var binding: FragmentOnBoardPageBinding

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            binding = FragmentOnBoardPageBinding.inflate(LayoutInflater.from(context), container, false)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            initViews()
            initListeners()
        }


        private fun initViews() {
            arguments.let {
                val data = it?.getSerializable("onBoard") as BoardModel
                binding.tvTitleBoard.text = data.title
                binding.tvDeskBoard.text = data.description
                data.img?.toInt()?.let { it1 -> binding.imgBoard.setImageResource(it1) }
                binding.btnSkip.isVisible = data.isLast == false
                binding.btnNext.isVisible = data.isLast == false
                binding.btnStart.isVisible = data.isLast == true
            }
        }

        private fun initListeners() {

            binding.btnNext.setOnClickListener{
                (findNavController().navigate(R.id.navigation_home))

            }

            binding.btnSkip.setOnClickListener{
                (findNavController().navigate(R.id.navigation_profile))


            }

           binding.btnStart.setOnClickListener{
            (findNavController().navigate(R.id.navigation_home))

           }

            }
        }


