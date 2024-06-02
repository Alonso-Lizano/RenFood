package com.ren.renfood.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EditText(
    text: String,
    onTextChanged: (String) -> Unit,
    placeholder: String,
    cornerRadius: Float = 8F
) {
    OutlinedTextField(
        value = text,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier.fillMaxWidth(),
        placeholder = {
            Text(text = placeholder)
        },
        shape = RoundedCornerShape(cornerRadius.dp)
    )

}