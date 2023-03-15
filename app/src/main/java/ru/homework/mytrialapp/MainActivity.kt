package ru.homework.mytrialapp

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.homework.mytrialapp.adapter.RawMaterialsAdapter
import ru.homework.mytrialapp.model.MyCard

class MainActivity : AppCompatActivity() {
    val dataList = listOf(
        MyCard(1, "пластик", R.drawable.ic_plastic),
        MyCard(2, "стекло", R.drawable.ic_glass),
        MyCard(3, "макулатура", R.drawable.ic_waste_paper),
        MyCard(4, "тетрапак", R.drawable.ic_tetrapak),
        MyCard(5, "металл", R.drawable.ic_metal)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rvRawMaterials)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RawMaterialsAdapter(dataList)
    }
}