package br.senai.sp.jandira.bmi.screens

import android.content.Context
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R
import br.senai.sp.jandira.bmi.calcs.bmiCalculate
import br.senai.sp.jandira.bmi.model.BmiStatus
import br.senai.sp.jandira.bmi.screens.components.BmiLevel
import br.senai.sp.jandira.bmi.utils.convertNumberToLocale
import java.util.Locale


@Composable
fun BMIResultScreen(navegacao: NavHostController) {

    val context = LocalContext.current
    val userFile = context
        .getSharedPreferences("userFile", Context.MODE_PRIVATE)

    val userAge = userFile.getInt("user_age", 0)
    val userWeight = userFile.getFloat("user_weight", 0.0f)
    val userHeight = userFile.getFloat("user_height", 0.0f)

    val bmi = bmiCalculate(userWeight, userHeight.toDouble().div(100))

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
                                        text = String.format(
                                            Locale.getDefault(),
                                            "%.1f",
                                            bmi.bmi.second,
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
                            text = bmi.bmi.first
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
                                            text = "$userAge"
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
                                            .width(60.dp)
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
                                            text =  "$userWeight Kg"
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
                                            text = String.format(Locale.getDefault(), "%.2f", userHeight)
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

                    ){
                        BmiLevel(
                            bulletColor = colorResource(R.color.light_blue),
                            leftText = stringResource(R.string.underweight),
                            rightText = "< ${convertNumberToLocale(18.5)}",
                            isFilled = if (bmi.bmiStatus == BmiStatus.UNDER_WEIGHT) true else false
                        )
                        BmiLevel(
                            bulletColor = colorResource(R.color.light_green),
                            leftText = stringResource(R.string.normal),
                            rightText = "< ${convertNumberToLocale(18.5)}",
                            isFilled = if (bmi.bmiStatus == BmiStatus.NORMAL) true else false
                        )
                        BmiLevel(
                            bulletColor = colorResource(R.color.yellow),
                            leftText = stringResource(R.string.over_weight),
                            rightText = "< ${convertNumberToLocale(18.5)}",
                            isFilled = if (bmi.bmiStatus == BmiStatus.OVER_WEIGHT) true else false
                        )
                        BmiLevel(
                            bulletColor = colorResource(R.color.light_orange),
                            leftText = stringResource(R.string.obesity_1),
                            rightText = "< ${convertNumberToLocale(18.5)}",
                            isFilled = if (bmi.bmiStatus == BmiStatus.OBESITY_1) true else false
                        )
                        BmiLevel(
                            bulletColor = colorResource(R.color.dark_orange),
                            leftText = stringResource(R.string.obesity_2),
                            rightText = "< ${convertNumberToLocale(18.5)}",
                            isFilled = if (bmi.bmiStatus == BmiStatus.OBESITY_2) true else false
                        )
                        BmiLevel(
                            bulletColor = colorResource(R.color.red),
                            leftText = stringResource(R.string.obesity_3),
                            rightText = "< ${convertNumberToLocale(18.5)}",
                            isFilled = if (bmi.bmiStatus == BmiStatus.OBESITY_3) true else false
                        )
                    }
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
