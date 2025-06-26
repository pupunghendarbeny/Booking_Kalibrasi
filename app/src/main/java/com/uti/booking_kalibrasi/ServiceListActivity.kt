package com.uti.booking_kalibrasi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton

class ServiceListActivity : AppCompatActivity() {

    private lateinit var rvServices: RecyclerView
    private lateinit var serviceAdapter: ServiceAdapter
    private lateinit var toolbar: Toolbar
    private lateinit var btnLogout: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_list)

        initViews()
        setupRecyclerView()
        setupLogoutButton()
    }

    private fun initViews() {
        rvServices = findViewById(R.id.rv_services)
        btnLogout = findViewById(R.id.btn_logout)
    }



