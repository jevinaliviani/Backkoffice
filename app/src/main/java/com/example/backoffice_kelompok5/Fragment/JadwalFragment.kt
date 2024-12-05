package com.example.backoffice_kelompok5.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.backoffice_kelompok5.HalamanJadwal
import com.example.backoffice_kelompok5.R

class JadwalFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jadwal, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnSelanjutnya2: Button = view.findViewById(R.id.btn_selanjutnya2)
        btnSelanjutnya2.setOnClickListener {
            val intent = Intent(context, HalamanJadwal::class.java)
            startActivity(intent)
        }
    }
}
