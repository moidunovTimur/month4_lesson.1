package com.example.month4_lesson_1.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.month4_lesson_1.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

private var _binding: FragmentDashboardBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    _binding = FragmentDashboardBinding.inflate(inflater, container, false)
  return binding.root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}