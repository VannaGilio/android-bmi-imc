package br.senai.sp.jandira.bmi.calcs

import androidx.compose.ui.graphics.Color
import br.senai.sp.jandira.bmi.model.Bmi
import br.senai.sp.jandira.bmi.model.BmiStatus
import kotlin.math.pow

fun bmiCalculate(weight: Float, height: Double): Bmi{

    val bmiResult = weight / height.pow(2)

    when{
        bmiResult < 18.5 ->
            return Bmi(
                bmi= Pair ("", bmiResult),
                bmiColor = Color.Cyan,
                bmiStatus = BmiStatus.UNDER_WEIGHT
            )
        bmiResult >= 18.5 && bmiResult < 25.5 ->
            return Bmi(
                bmi= Pair ("", bmiResult),
                bmiColor = Color.Green,
                bmiStatus = BmiStatus.NORMAL
            )
        bmiResult >=25.0 && bmiResult < 29.8 ->
            return Bmi(
                bmi= Pair ("", bmiResult),
                bmiColor = Color.Yellow,
                bmiStatus = BmiStatus.OVER_WEIGHT
            )
        bmiResult >=30.0 && bmiResult <35.0 ->
            return Bmi(
                bmi= Pair ("", bmiResult),
                bmiColor = Color.Magenta,
                bmiStatus = BmiStatus.OBESITY_1
            )
        bmiResult >=35.0 && bmiResult <39.0 ->
            return Bmi(
                bmi= Pair ("", bmiResult),
                bmiColor = Color.Red,
                bmiStatus = BmiStatus.OBESITY_2
            )
    }else{
        bmiResult >=39.0 ->
        return Bmi(
            bmi= Pair ("", bmiResult),
            bmiColor = Color.Black,
            bmiStatus = BmiStatus.OBESITY_3
        )
    }

}