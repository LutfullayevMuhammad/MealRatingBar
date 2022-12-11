package uz.isystem.lesson26.core.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import coil.load
import uz.isystem.lesson26.R
import uz.isystem.lesson26.core.models.MealData
import uz.isystem.lesson26.databinding.ItemMealBinding

class MealAdapter : BaseAdapter() {


    var onMoreClickListener:OnMoreClickListener?=null

    var arrayList = ArrayList<MealData>()
        set(value) {
            field.addAll(value)
            notifyDataSetChanged()
        }

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): MealData {
        return arrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, view: View?, viewGoup: ViewGroup): View {
        val binding =
            ItemMealBinding.inflate(LayoutInflater.from(viewGoup.context), viewGoup, false)

        val data = getItem(position)

        binding.mealName.text = data.title
        binding.mealShortDesc.text = data.shortDescription

        binding.mealRate.rating = data.rating


        val image = if (data.isFavorite) {
            R.drawable.ic_favorite_full
        } else {
            R.drawable.ic_favorite_empty
        }

        binding.favBtn.setImageResource(image)

        binding.favBtn.setOnClickListener {
            arrayList[position].isFavorite = !arrayList[position].isFavorite
            notifyDataSetChanged()
        }

        binding.arrowMore.setOnClickListener {
            onMoreClickListener?.let {
                it.onClick(data)
            }
        }


        binding.mealImage.load(data.image)

        return binding.root

    }

    public interface OnMoreClickListener{
        fun onClick(mealData: MealData)
    }

}