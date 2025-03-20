package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R


@Composable
fun BMIResultScreen(navegacao: NavHostController) {
    Box(
        modifier = Modifier
            .background(
                brush = Brush.verticalGradient(
                    listOf(
                        Color(0xFF15273D),
                        Color(0xFF637A9D),
                        Color(0xFF859CBB),
                    )
                )
            )
    )
    {
        Column (
            modifier = Modifier

        ){
            Text(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .padding(top = 70.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFFFFFFF),
                text = stringResource(
                    R.string.result
                )
            )
            Card (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 60.dp),
                shape = RoundedCornerShape(topEnd = 30.dp, topStart = 30.dp),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xFFFFFFFF))
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(25.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Row (
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                        )
                        {
                            Card(
                                modifier = Modifier
                                    .border(
                                        5.dp,
                                        color = Color(0xFF24364F).copy(alpha = 0.7f),
                                        RoundedCornerShape(100.dp)
                                    )
                                    .size(110.dp),
                                shape = CircleShape,
                                colors = CardDefaults.cardColors(
                                    containerColor = Color(0xFFFFFFFF)
                                )
                            )
                            {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Text(
                                        modifier = Modifier
                                            .background(Color(0xFFFFFFFF)),
                                        fontSize = 30.sp,
                                        fontWeight = FontWeight.Medium,
                                        color = Color(0xFF1D3350),
                                        text = stringResource(
                                            R.string.result_number
                                        )
                                    )
                                }
                            }
                        }
                        Text(
                            modifier = Modifier
                                .padding(10.dp),
                            color = Color(0xC8071B2D),
                            fontWeight = FontWeight.Medium,
                            text = stringResource(
                                R.string.result_text
                            )
                        )
                        Column(
                            modifier = Modifier
                        ) {
                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(80.dp),
                                colors = CardDefaults.cardColors(
                                     containerColor = Color(0xC61D3350)
                                ),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    horizontalArrangement = Arrangement.SpaceEvenly,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Column (
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier
                                            .width(50.dp)
                                    ){
                                        Text(
                                            modifier = Modifier,
                                            color = Color(0xFFFFFFFF),
                                            text = stringResource(
                                                R.string.age
                                            )
                                        )
                                        Text(
                                            modifier = Modifier,
                                            color = Color(0xFFFFFFFF),
                                            text = stringResource(
                                                R.string.age_result
                                            )
                                        )
                                    }
                                    Divider(
                                        modifier = Modifier
                                            .width(1.dp)
                                            .height(60.dp),
                                        color = Color(0xFFFFFFFF)
                                    )
                                    Column (
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier
                                            .width(50.dp)
                                    ){
                                        Text(
                                            modifier = Modifier,
                                            color = Color(0xFFFFFFFF),
                                            text = stringResource(
                                                R.string.weight
                                            )
                                        )
                                        Text(
                                            modifier = Modifier,
                                            color = Color(0xFFFFFFFF),
                                            text = stringResource(
                                                R.string.weight_result
                                            )
                                        )
                                    }
                                    Divider(
                                        modifier = Modifier
                                            .width(1.dp)
                                            .height(60.dp),
                                        color = Color(0xFFFFFFFF)
                                    )
                                    Column (
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier
                                        .width(50.dp)
                                    ){
                                        Text(
                                            modifier = Modifier,
                                            color = Color(0xFFFFFFFF),
                                            text = stringResource(
                                                R.string.height
                                            )
                                        )
                                        Text(
                                            modifier = Modifier,
                                            color = Color(0xFFFFFFFF),
                                            text = stringResource(
                                                R.string.high_result
                                            )
                                        )
                                    }
                                }
                            }
                        }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                            .padding(top = 20.dp)
                            .background(Color(0x201D3350))
                    ){  }
                        Divider(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 25.dp)
                                .height(2.dp),
                            color = Color(0xAD3F5579)
                        )
                        Button(
                            modifier = Modifier
                                .padding(top = 25.dp)
                                .fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(Color(0xFF283B56)),
                            onClick = {
                                navegacao.navigate("home")
                            }
                        ){
                            Text(
                                text = stringResource(
                                    R.string.new_cacl
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
   // BMIResultScreen(navegacao)
}
