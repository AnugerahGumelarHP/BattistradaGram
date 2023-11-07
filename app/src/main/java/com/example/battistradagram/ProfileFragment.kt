package com.example.battistradagram

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.battistradagram.databinding.ActivityMainBinding
import com.example.battistradagram.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return (binding.root)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnEditProfile.setOnClickListener {
            editProfile()
        }

        binding.btnEditEmailPassword.setOnClickListener {
            editEmailPassword()
        }

        binding.btnBeriRating.setOnClickListener {
            kebijakanAplikasi()
        }

        binding.btnBeriRating.setOnClickListener {
            beriRating()
        }

        binding.btnLogout.setOnClickListener {
            logout()
        }
    }

    private fun logout() {
        TODO("Not yet implemented")
    }

    private fun beriRating() {
        TODO("Not yet implemented")
    }

    private fun kebijakanAplikasi() {
        TODO("Not yet implemented")
    }

    private fun editEmailPassword() {
        TODO("Not yet implemented")
    }

    private fun editProfile() {
        TODO("Not yet implemented")
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}