package com.example.myselfapps

import com.example.myselfapps.ui.daily_activity.DailyActivityModel
import com.example.myselfapps.ui.daily_activity.FriendModel
import com.example.myselfapps.ui.music.VideoModel

object AllData {

    val friendList = listOf(
        FriendModel(
            image = R.drawable.fr,
            name = "Tri Sutrisno",
            profession = "Android Developer",
            instagram = "algoritma_hidup"
        ),
        FriendModel(
            image = R.drawable.fr2,
            name = "Asil",
            profession = "Nganggur",
            instagram = "atqiya"
        ),
        FriendModel(
            image = R.drawable.fr3,
            name = "Ravly",
            profession = "Startup",
            instagram = "Ravly"
        ),
        FriendModel(
            image = R.drawable.fr4,
            name = "Febri",
            profession = "Batman",
            instagram = "agstian"
        ),
        FriendModel(
            image = R.drawable.fr5,
            name = "Akhsa",
            profession = "Superman",
            instagram = "aksalavril"
        ),
    )

    val dailyActivityList = listOf(
        DailyActivityModel(
            imageProfile = R.drawable.fr1,
            name = "oqih",
            username = "@oqih",
            caption = ":)",
            image = R.drawable.pagi
        ),
        DailyActivityModel(
            imageProfile = R.drawable.fr1,
            name = "oqih",
            username = "@oqih",
            caption = ".......",
            image = R.drawable.da2
        ),
        DailyActivityModel(
            imageProfile = R.drawable.fr1,
            name = "oqih",
            username = "@oqih",
            caption = "Pen beli truk ah",
            image = R.drawable.da3
        ),
        DailyActivityModel(
            imageProfile = R.drawable.fr1,
            name = "oqih",
            username = "@oqih",
            caption = "....",
            image = R.drawable.da4
        ),
        DailyActivityModel(
            imageProfile = R.drawable.fr1,
            name = "oqih",
            username = "@oqih",
            caption = "....",
            image = R.drawable.da5
        ),
        DailyActivityModel(
            imageProfile = R.drawable.fr1,
            name = "oqih",
            username = "@oqih",
            caption = ".....",
            image = R.drawable.da6
        ),
        DailyActivityModel(
            imageProfile = R.drawable.fr1,
            name = "oqih",
            username = "@oqih",
            caption = "",
            image = R.drawable.da7
        ),
        DailyActivityModel(
            imageProfile = R.drawable.fr1,
            name = "oqih",
            username = "@oqih",
            caption = "",
            image = R.drawable.da8
        ),
        DailyActivityModel(
            imageProfile = R.drawable.fr1,
            name = "oqih",
            username = "@oqih",
            caption = "",
            image = R.drawable.da9
        )
    )

    val galleryList = listOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8,
        R.drawable.img9,
        R.drawable.img10,
        R.drawable.img11,
        R.drawable.img12,
        R.drawable.img13,
        R.drawable.img14,
        R.drawable.img15,
        R.drawable.img16,
        R.drawable.img17,

    )

    val videoList = listOf(
        VideoModel(
            video = "blob:https://www.youtube.com/b60e6585-3c2e-4a79-a441-38db7d322905",
            name = "System Of A Down - Violent Pornography (Official Audio)"
            ),
        VideoModel(
            video = "blob:https://www.youtube.com/25e9fb31-a61a-4597-8caa-2b031472158d",
            name = "Avenged Sevenfold - Until the End [Official Audio]"
        ),
        VideoModel(
            video = "blob:https://www.youtube.com/fddf60f6-57ad-4809-b216-98f848e35b48",
            name = "Avenged Sevenfold - M.I.A."
        )
    )

}