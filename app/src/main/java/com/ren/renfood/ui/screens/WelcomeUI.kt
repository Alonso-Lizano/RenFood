package com.ren.renfood.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ren.renfood.R
import com.ren.renfood.ui.components.AuthButtons
import com.ren.renfood.ui.components.Dimens
import com.ren.renfood.ui.components.OutlineButton
import com.ren.renfood.ui.theme.RenFoodTheme
import kotlinx.coroutines.launch

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxSize(fraction = 0.6F),
                painter = painterResource(id = R.mipmap.food), contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(Dimens.MediumPadding))
            Text(
                text = stringResource(id = R.string.welcome_text),
                modifier = Modifier
                    .padding(horizontal = Dimens.MediumPaddingText)
                    .align(Alignment.BottomStart),
                style = MaterialTheme.typography.displayMedium.copy(fontWeight = FontWeight.Bold),
                color = colorResource(id = R.color.white),
                textAlign = TextAlign.Start,
                fontSize = 40.sp,
                fontFamily = FontFamily(Font(R.font.poppins_extrabold, FontWeight.ExtraBold))
            )
        }
        Column {
            Text(
                text = stringResource(id = R.string.welcome_description),
                modifier = Modifier
                    .padding(horizontal = Dimens.MediumPaddingText)
                    .padding(top = 15.dp)
                    .align(Alignment.Start),
                color = colorResource(id = R.color.grey),
                textAlign = TextAlign.Start,
                fontSize = 22.sp,
                fontFamily = FontFamily(Font(R.font.poppins_medium, FontWeight.Medium))
            )
            Spacer(modifier = Modifier.height(Dimens.MediumPadding))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val scope = rememberCoroutineScope()
                AuthButtons(
                    text = "Login",
                    onClick = {
                        scope.launch {

                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = colorResource(id = R.color.black),
                        containerColor = colorResource(
                            id = R.color.light_teal
                        )
                    ), contentPadding = PaddingValues(15.dp)
                )
                Spacer(modifier = Modifier.height(10.dp))
                OutlineButton(
                    text = "Signup", onClick = {
                        scope.launch {

                        }
                    }, colors = ButtonDefaults.buttonColors(
                        contentColor = colorResource(
                            id = R.color.light_teal
                        ),
                        containerColor = colorResource(id = R.color.black)
                    ),
                    borderStroke = BorderStroke(2.dp, colorResource(id = R.color.light_teal)),
                    contentPadding = PaddingValues(15.dp)
                )
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun WelcomeScreenPreview() {
    RenFoodTheme {
        WelcomeScreen()
    }
}
