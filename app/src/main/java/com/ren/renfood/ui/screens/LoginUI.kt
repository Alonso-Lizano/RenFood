package com.ren.renfood.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
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
import com.ren.renfood.ui.components.EditText
import com.ren.renfood.ui.theme.RenFoodTheme

@Composable
fun LoginUI(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.login),
            fontFamily = FontFamily(Font(R.font.poppins_medium, FontWeight.Medium)),
            textAlign = TextAlign.Center,
            color = colorResource(id = R.color.white),
            fontSize = 30.sp,
            modifier = Modifier.padding(top = 10.dp)
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = stringResource(id = R.string.login_text),
            fontFamily = FontFamily(
                Font(R.font.poppins_medium, FontWeight.Medium)
            ),
            textAlign = TextAlign.Center,
            color = colorResource(id = R.color.grey),
            fontSize = 15.sp
        )
        Spacer(modifier = Modifier.height(15.dp))
        EditText(
            text = "",
            onTextChanged = { /*TODO*/ },
            placeholder = "Email",
            cornerRadius = 12F
        )
        Spacer(modifier = Modifier.height(15.dp))
        EditText(
            text = "",
            onTextChanged = { /*TODO*/ },
            placeholder = "Password",
            cornerRadius = 12F
        )
        Spacer(modifier = Modifier.height(15.dp))
        AuthButtons(
            text = stringResource(id = R.string.login),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.light_teal),
                contentColor = colorResource(
                    id = R.color.black
                )
            ),
            contentPadding = PaddingValues(15.dp)
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = stringResource(id = R.string.forget_password),
            fontFamily = FontFamily(
                Font(R.font.poppins_medium, FontWeight.Medium)
            ),
            fontSize = 15.sp,
            color = colorResource(id = R.color.grey)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginUIPreview() {
    RenFoodTheme {
        LoginUI()
    }
}