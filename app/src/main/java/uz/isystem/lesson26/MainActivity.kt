package uz.isystem.lesson26

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.isystem.lesson26.core.adapter.MealAdapter
import uz.isystem.lesson26.core.dialog.MoreDataDialog
import uz.isystem.lesson26.core.loadData
import uz.isystem.lesson26.core.models.MealData
import uz.isystem.lesson26.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val mealAdapter=MealAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listMeal.adapter = mealAdapter

        mealAdapter.arrayList= loadData()

        mealAdapter.onMoreClickListener=object :MealAdapter.OnMoreClickListener{
            override fun onClick(mealData: MealData) {
                   showMoreDialog(mealData.title,mealData.fullDescription)
            }
        }


    }

    private fun showMoreDialog(titleString: String,descString: String) {
        val dialog = MoreDataDialog(this, titleString, descString)
        dialog.show()
    }
}