package com.example.android.diabecare.ui

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.android.diabecare.R
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.imageview.ShapeableImageView

class MainActivity : AppCompatActivity() {


    private lateinit var navController: NavController
    private lateinit var floatingBtn: FloatingActionButton
    lateinit var bottomAppBar: BottomAppBar
    private lateinit var bottomSheetDialog: BottomSheetDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        floatingBtn = findViewById(R.id.floatingBtn)
        bottomAppBar = findViewById(R.id.bottomAppBar)
        bottomSheetDialog = BottomSheetDialog(this)
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        setupActionBarWithNavController(navController)

        bottomAppBar.setNavigationOnClickListener {
            showBottomDialog()
        }
        bottomAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.search -> {
                    navController.navigate(R.id.action_home_to_search)
                    true
                }
                else -> false
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    fun showBottomDialog(){
        bottomSheetDialog.setContentView(R.layout.menu_bottom_sheet)
        val bmiIcon = bottomSheetDialog.findViewById<ShapeableImageView>(R.id.icon_bmi)
        val consultationIcon = bottomSheetDialog.findViewById<ShapeableImageView>(R.id.icon_consultation)
        val historyIcon = bottomSheetDialog.findViewById<ShapeableImageView>(R.id.icon_history)
        val blogsIcon = bottomSheetDialog.findViewById<ShapeableImageView>(R.id.icon_blogs)

        bmiIcon?.setOnClickListener(){
            navController.navigate(R.id.action_home_to_bmi)
            bottomSheetDialog.dismiss()
        }
        consultationIcon?.setOnClickListener(){
            navController.navigate(R.id.action_home_to_consultation)
            bottomSheetDialog.dismiss()
        }
        historyIcon?.setOnClickListener(){
            navController.navigate(R.id.action_home_to_history)
            bottomSheetDialog.dismiss()
        }
        blogsIcon?.setOnClickListener(){
            navController.navigate(R.id.action_home_to_blogs)
            bottomSheetDialog.dismiss()
        }

        bottomSheetDialog.show()
    }

    fun checkDiabetes(view: View) {
        navController.navigate(R.id.action_home_to_checkDiabetes)
    }
}