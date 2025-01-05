package com.gdsc.recyclr.screens.map

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.*

@Composable
fun MapScreen() {
    val buja = LatLng(-3.361260, 29.347916)
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
    }
}
