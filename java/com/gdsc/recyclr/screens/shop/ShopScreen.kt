package com.gdsc.recyclr.screens.shop

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gdsc.recyclr.components.composable.BasicTopBar
import com.gdsc.recyclr.ui.theme.Gray_color
import com.gdsc.recyclr.ui.theme.RecyclrTheme
@Composable
fun ShopScreen() {
    val shopItemRepository = ShopItemRepository()
    val getAllShopItems = shopItemRepository.getAllShopItems()
    Scaffold(topBar = {
        BasicTopBar(title = "Shop")
    }) {
        it
        LazyVerticalGrid(
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            modifier = Modifier
                .background(color = Gray_color)
                .padding(20.dp),
            columns = GridCells.Adaptive(150.dp),
            content = {
                items(items = getAllShopItems){
                        shopItem -> ShopItemCard(shopItem = shopItem)
                }
            })
    }


    /*val buja = LatLng(-3.361260, 29.347916)
    val cameraPositionState = rememberCameraPositionState{
        position = CameraPosition.fromLatLngZoom(buja,14f)
    }
    GoogleMap(
        modifier = Modifier.fillMaxSize(),
        cameraPositionState =cameraPositionState
    ){
        Marker(
            state = MarkerState(position = buja),
            title = "Bujumbura",
            snippet = "Marker in Bujumbura"
        )
    }*/
}

@Preview(showBackground = true)
@Composable
private fun PreviewShopScreen() {
    RecyclrTheme {
        ShopScreen()
    }
}