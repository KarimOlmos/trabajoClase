package com.example.proyectoclase


import Textos.Texto
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

var texto = true

@Preview
@Composable
fun InicioI(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE2E736))
            .padding(10.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFE2E736))
        ) {
            HeaderI()
            BodyI()
            FooterI()
        }
    }
}

@Composable
fun HeaderI() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.13f)
            .background(Color.Blue),
        contentAlignment = Alignment.Center

    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Top
        ) {

            Text(
                text = "PANTALLA DE INFORMACIÓN",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier

                    .verticalScroll(rememberScrollState())
            )

        }
    }



}





@Composable
fun BodyI() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.75f)
            .border(1.dp, Color.Blue)
            .background(Color.Blue)
    ) {
        Row(
            modifier = Modifier
                .background(Color.Blue),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {

            LColum()

        }
    }
}

@Composable
fun FooterI() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(1f)
            .background(Color.Blue),
        contentAlignment = Alignment.BottomCenter
    ) {

        Row(
            modifier = Modifier.padding(10.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Bottom,

            ) {



        }


    }
}

@Composable
fun LColum(){

    LazyColumn (                modifier = Modifier
        .padding(12.dp)
        .background(Color.Blue)){
        item {

            SwitchWithIconExample()

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .background(Color.White)
                    .border(1.dp,Color.Black)
            ) {


            if (texto) {


                Text(
                    text = Texto.t1.textoL,
                    modifier = Modifier
                        .padding(16.dp)
                        .verticalScroll(rememberScrollState())
                )
            }else{

                Text(
                    text = Texto.t2.textoL2,
                    modifier = Modifier
                        .padding(16.dp)
                        .verticalScroll(rememberScrollState())
                )

            }

            }
        }
    }



}


@Composable
fun SwitchWithIconExample() {
    var checked by remember { mutableStateOf(true) }
    var texto by remember { mutableStateOf(true) }

    Switch(
        checked = checked,
        onCheckedChange = {
            checked = it
            texto = it
        },
        thumbContent = if (checked) {
            {
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier.size(SwitchDefaults.IconSize).padding(10.dp),
                )
            }
        } else {
            null
        }
    )
}