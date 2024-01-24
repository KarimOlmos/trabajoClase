package com.example.proyectoclase

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun inicio(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE2E736))
            .padding(10.dp) // Añade un espacio adicional alrededor de la Column
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)
        ) {
            Header()
            Body()
            Footer()
        }
    }
}

@Composable
fun Header() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.20f)
            .background(Color.Black),
        contentAlignment = Alignment.TopEnd

    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Top
        ) {

            Icon(
                imageVector = Icons.Default.Info,
                contentDescription = "Close APP",
                modifier = Modifier.clickable {
                    //SIN IMPLEMENTAR
                }
            )

        }
    }
}

@Composable
fun Body() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.75f)
            .background(Color.Black)
    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {

        ImagenC()


        }
    }
}

@Composable
fun Footer() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(1f)
            .background(Color.Black),
        contentAlignment = Alignment.BottomCenter
    ) {

        Row(
            modifier = Modifier.padding(10.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Bottom,
            
        ) {

            Button( onClick = {/*checkLogin()*/},
                enabled = true,
                modifier = Modifier.width(200.dp).height(50.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    containerColor = Color(0xFFE2E736),
                    disabledContentColor = Color.White,
                    disabledContainerColor = Color(0xFF78C8F9),

                    )
            ){

                Text(text = "Log in")
            }


        }


    }
}


@Composable
fun ImagenC() {
    Image(
        painter = painterResource(id = R.drawable.img_yugi_background),
        contentDescription = "Imagen Central", // Agrega una descripción adecuada para accesibilidad
        modifier = Modifier.fillMaxSize().background(Color.Transparent).padding(12.dp)
    )
}
