package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R

@Composable
fun UserDataScreen (modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .background(Color(0xFF24364F))
    )
    {
        Column{
            Text(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .padding(top = 70.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.Black,
                color = Color(0xFFFFFFFF),

                text = stringResource(
                    R.string.hi
                )
            )

            Card (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 60.dp)
                    .background(color = Color(0xFF24364F)),
                shape = RoundedCornerShape(topEnd = 30.dp, topStart = 30.dp),
            ){
                Column (
                    modifier = modifier
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
                            value = "",
                            onValueChange = {},
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
                            value = "",
                            onValueChange = {},
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
                            value = "",
                            onValueChange = {},
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
                            onClick = {}
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
    UserDataScreen()
}
