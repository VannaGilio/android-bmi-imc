package br.senai.sp.jandira.bmi.screens

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.ErrorOutline
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.bmi.R

@Composable
fun HomeScreen(navegacao: NavHostController) {

    //variável de estado
    var nameState = remember {
        mutableStateOf("")
    }

    val isErrorState = remember {
        mutableStateOf(false)
    }

    //Abir ou criar um arquivo SharedPreferences
    val context = LocalContext.current
    val userFile = context
        .getSharedPreferences("userFile", Context.MODE_PRIVATE)

    // Colocar o arquivo em modo de edição
    val editor = userFile.edit()

    Box(
        modifier = Modifier // mudar tamanho
            .fillMaxSize() //tamanho da tela
            .background(
                brush = Brush.verticalGradient(
                    listOf(
                        Color(0xFF15273D),
                        Color(0xFF5B7D96)
                    )
                )
            )
    ) {
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
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(30.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
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
                            value = nameState.value,
                            onValueChange = {
                                nameState.value = it
                            },
                            label = {
                                Text(
                                    text = stringResource(
                                        R.string.label_name
                                    )
                                )
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 15.dp),
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Text,
                                capitalization = KeyboardCapitalization.Words
                            ),
                            trailingIcon = {
                                if (isErrorState.value){
                                    Icon(
                                        imageVector = Icons.Default.Error,
                                        contentDescription = "",
                                        tint = Color.Red
                                    )
                                }
                            },
                            isError = isErrorState.value,
                            supportingText = {
                                if (isErrorState.value) {
                                    Text(
                                        text = stringResource(
                                            R.string.error_name_home)
                                    )
                                }
                            },
                        )
                    }

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        horizontalAlignment = (Alignment.End),

                        )
                    {
                        Button(
                            colors = ButtonDefaults.buttonColors(Color(0xFF283B56)),
                            onClick = {
                                if (nameState.value.isEmpty()) {
                                        isErrorState.value = true
                                    } else {
                                    editor.putString("user_name", nameState.value)
                                    editor.putString("user_name", nameState.value)
                                    editor.apply()
                                    navegacao.navigate("dados")
                                }
                            }
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
//    HomeScreen(navegacao)

}