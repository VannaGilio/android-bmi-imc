package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R

@Composable
fun UserDataScreen(navegacao: NavHostController) {
    var ageState = remember {
        mutableStateOf("")
    }
    var weightState = remember {
        mutableStateOf("")
    }
    var heightState = remember {
        mutableStateOf("")
    }
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
        Column{
            Text(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .padding(top = 70.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFFFFFFF),

                text = stringResource(
                    R.string.hi
                )
            )

            Card (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 60.dp),
                shape = RoundedCornerShape(topEnd = 30.dp, topStart = 30.dp),
            ){
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xFFFFFFFF))
                ){
                    Row (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 60.dp)
                            .background(color = Color(0xFFFFFFFF)),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    )
                    {
                        Column(
                            modifier = Modifier
                                .background(color = Color(0xFFFFFFFF))
                        ){
                            Card (
                                modifier =  Modifier
                                    .size(130.dp),
                                shape = CircleShape
                            ){
                                Image(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    painter = painterResource(
                                        R.drawable.homemuser
                                    ),
                                    contentDescription = stringResource(
                                        R.string.logo
                                    )
                                )
                            }
                            Button(
                                modifier = Modifier
                                    .padding(top = 15.dp)
                                    .width(130.dp),
                                colors = ButtonDefaults.buttonColors(Color(0xFF283B56)),
                                onClick = {}
                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.male
                                    )
                                )
                            }
                        }
                        Column(
                            modifier = Modifier
                                .background(color = Color(0xFFFFFFFF))
                        ){
                            Card (
                                modifier =  Modifier
                                    .size(130.dp),
                                shape = CircleShape
                            ){
                                Image(
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    painter = painterResource(
                                        R.drawable.mulheruser
                                    ),
                                    contentDescription = stringResource(
                                        R.string.logo
                                    )
                                )
                            }
                            Button(
                                modifier = Modifier
                                    .padding(top = 15.dp)
                                    .width(130.dp),
                                colors = ButtonDefaults.buttonColors(Color(0xFF283B56)),
                                onClick = {}
                            ) {
                                Text(
                                    text = stringResource(
                                        R.string.female
                                    )
                                )
                            }
                        }
                    }
                    Column (
                        modifier = Modifier
                            .padding(20.dp)
                    ) {
                        OutlinedTextField(
                            value = ageState.value,
                            onValueChange = {
                                ageState.value = it
                            },
                            label = {
                                Text(
                                    text = stringResource(
                                        R.string.age
                                    )
                                )
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 15.dp),
                            shape = RoundedCornerShape(15.dp),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.DateRange,
                                    contentDescription = "",
                                    tint = Color(0xFF283B56)
                                )
                            },
                        )
                        OutlinedTextField(
                            value = weightState.value,
                            onValueChange = {
                                weightState.value = it
                            },
                            label = {
                                Text(
                                    text = stringResource(
                                        R.string.weight
                                    )
                                )
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 15.dp),
                            shape = RoundedCornerShape(15.dp),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Balance,
                                    contentDescription = "",
                                    tint = Color(0xFF283B56)
                                )
                            },
                        )
                        OutlinedTextField(
                            value = heightState.value,
                            onValueChange = {
                                heightState.value = it
                            },
                            label = {
                                Text(
                                    text = stringResource(
                                        R.string.height
                                    )
                                )
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 15.dp),
                            shape = RoundedCornerShape(15.dp),
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Default.Height,
                                    contentDescription = "",
                                    tint = Color(0xFF283B56)
                                )
                            },
                        )
                        Column (
                            modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Button(
                            modifier = Modifier
                                .padding(top = 70.dp)
                                .fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(Color(0xFF283B56)),
                            onClick = {
                                navegacao.navigate("resultado")
                            }
                            ) {
                            Text(
                                text = stringResource(
                                    R.string.calculate
                                )
                            )
                            }
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
//    UserDataScreen(navegacao)
}
