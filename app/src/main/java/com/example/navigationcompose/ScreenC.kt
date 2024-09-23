package com.example.navigationcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.provider.FontsContractCompat.Columns
import androidx.navigation.NavHostController

@Composable
fun ScreenC(
    navController: NavHostController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Screen C",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
                //this changes navController value from screenC to screenA, which causes recomposition.
                navController.navigate(route = Routes.screenA) {
                    popUpTo(route = Routes.screenA) {inclusive = true}
                    /*
                    * when we come back to screenA we need to delete all the other screens that we
                    * opened and got stored in back stack. we need to delete all that opened screen
                    * including the current screen i.e. screenA so that app exits on a single
                    * back button click.
                    */
                }
            }
        ) {
            Text(text = "Go to Screen A")
        }
    }
}