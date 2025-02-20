package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun HomeScreen (modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier // mudar tamanho
            .fillMaxSize() //tamanho da tela
            .background(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color(0xFF594575),
                        Color(0xFF2B4559)
                    )
                )
            )
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(
                    R.drawable.aro
                ),
                contentDescription = stringResource(
                    R.string.logo
                ),
                modifier = Modifier
                    .padding(top = 50.dp)
            )
            Text(
                text = stringResource(
                    R.string.welcome
                ),
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Light
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(480.dp),
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp),

                colors = CardDefaults
                    .cardColors(
                        containerColor = Color.White
                    )
            ) {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(30.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ){
                    Column {
                        Text(
                            text = stringResource(
                                R.string.your_name
                            ),
                            color = Color(0xFF283B56),
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Medium,
                        )
                        TextField(
                            value = "",
                            onValueChange = {},
                            label = { Text(
                                text = stringResource(
                                    R.string.label_name
                                )
                            ) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 15.dp)
                        )
                    }

                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        horizontalAlignment = (Alignment.End),

                    )
                    {
                        Button(
                            onClick = {}
                        ) {
                            Text(
                                text = stringResource(
                                    R.string.next
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}