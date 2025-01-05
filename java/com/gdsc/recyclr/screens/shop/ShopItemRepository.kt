package com.gdsc.recyclr.screens.shop

import com.gdsc.recyclr.R

class ShopItemRepository {
    fun getAllShopItems():List<ShopItem>{
        return listOf(
            ShopItem(
                imageId = R.drawable.shopping_bag,
                title = "Reusable Shopping Bag",
                price = 150
            ),
            ShopItem(
                imageId = R.drawable.self_care_planner,
                title = "The Self Care Planner",
                price = 200
            ),
            ShopItem(
                imageId = R.drawable.plastic_bags,
                title = "Plastic Bags Zero waste Box",
                price = 70
            ),
            ShopItem(
                imageId = R.drawable.bamboo_toothbrush,
                title = "Virtue Brush",
                price = 50
            ),
            ShopItem(
                imageId = R.drawable.shopping_bag,
                title = "Reusable Shopping Bag",
                price = 150
            ),
            ShopItem(
                imageId = R.drawable.self_care_planner,
                title = "The Self Care Planner",
                price = 200
            )
        )
    }
}