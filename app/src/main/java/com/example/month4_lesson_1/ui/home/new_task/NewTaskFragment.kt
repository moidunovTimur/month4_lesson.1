package com.example.month4_lesson_1.ui.home.new_task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.example.month4_lesson_1.R
import com.example.month4_lesson_1.databinding.FragmentNewTaskBinding


class NewTaskFragment : Fragment() {

     private lateinit var binding:FragmentNewTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentNewTaskBinding.inflate(LayoutInflater.from(context),container,false)

        initviews()
        initListeners()

        return binding.root
    }

    private fun initListeners() {
       binding.btnSave.setOnClickListener{
           setFragmentResult("new_task", bundleOf("title" to binding.etTitle.text.toString(),
               ("desc" to binding.etDesc.text.toString())))
           findNavController().navigateUp()
       }
    }

    private fun initviews() {

    }

}

