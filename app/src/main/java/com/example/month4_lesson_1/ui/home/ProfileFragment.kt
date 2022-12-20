package com.example.month4_lesson_1.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResultLauncher
import androidx.core.graphics.createBitmap
import com.example.month4_lesson_1.R
import com.example.month4_lesson_1.databinding.FragmentProfileBinding
import com.example.month4_lesson_1.databinding.TaskItemBinding


class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

}

