package com.example.proyectoclase.ui.theme

import Textos.Texto
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectoclase.R

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
            .fillMaxHeight(0.10f)
            .background(Color.Gray),
        contentAlignment = Alignment.TopEnd

    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Top
        ) {



        }
    }



}





@Composable
fun Body() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.75f)
            .border(1.dp, Color.Gray)
    ) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {

            lColum()

        }
    }
}

@Composable
fun Footer() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(1f)
            .background(Color.Gray),
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
fun lColum(){

    LazyColumn {
        item {

            SwitchWithIconExample()

            Box(
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth()
                    .height(400.dp)
                    .background(Color.LightGray)
                    .border(1.dp,Color.Black)
            ) {



                Text(
                    text = Texto.t1.textoL,
                    modifier = Modifier
                        .padding(16.dp)
                        .verticalScroll(rememberScrollState())
                )


            }
        }
    }



}


@Composable
fun SwitchWithIconExample() {
    var checked by remember { mutableStateOf(true) }

    Switch(
        checked = checked,
        onCheckedChange = {
            checked = it
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