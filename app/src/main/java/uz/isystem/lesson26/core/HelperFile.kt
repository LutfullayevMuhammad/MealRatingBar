package uz.isystem.lesson26.core

import uz.isystem.lesson26.core.models.MealData

val developerName="Fozilbek imomov"

fun loadData(): ArrayList<MealData> {
    val data = ArrayList<MealData>()
    data.add(
        MealData(
            "https://zira.uz/wp-content/uploads/2022/06/shaurma-18.jpg",
            "Tovuqli shaurma",
            "Pechda taxta tayoqchalari ustida pishirilgan tovuq go’shtidan shaurma. Mashhur tez taomni uyda tayyorlashning antiqa usuli.",
            "Pechda taxta tayoqchalari ustida pishirilgan tovuq go’shtidan shaurma. Mashhur tez taomni uyda tayyorlashning antiqa usuli. \n" +
                    "\n" +
                    "To’yimli tamaddi uchun a’lo tanlov. \n" +
                    "\n" +
                    "Tayyor taomning taxminiy narxi – 60 000 so’m. \n" +
                    "\n" +
                    "*narxi manba chop etilgan vaqtgagina amal qiladi.\n" +
                    "\n" +
                    "Yangi retseptlar bilan birinchilardan bo’lib tanishishni xohlasangiz, unda bizning telegram kanalimizga albatta obuna bo’ling.",
            false,
            4f
        )
    )

    data.add(
        MealData(
            "https://zira.uz/wp-content/uploads/2022/06/uzbekskiy-lukovyy-sup.jpg",
            "Qovurilgan kartoshka tayoqchalari",
            "Kartoshka pyuresining tayoqcha shaklidagi antiqa turi. Tayoqchalar ichi yumshoq tashqi esa qarsildoq bo’lib pishadi.",
            "Kartoshka pyuresining tayoqcha shaklidagi antiqa turi. Tayoqchalar ichi yumshoq tashqi esa qarsildoq bo’lib pishadi.\n" +
                    "\n" +
                    "Bunday tayoqchalar tamaddi uchun yoki birinchi taomlar oldiga tortish uchun a’lo tanlov.\n" +
                    "\n" +
                    "Tayyor taomning taxminiy narxi – 45 000 so’m. \n" +
                    "\n" +
                    "*narxi manba chop etilgan vaqtgagina amal qiladi.\n" +
                    "\n",
            false,
            5f
        )
    )
    return data

}