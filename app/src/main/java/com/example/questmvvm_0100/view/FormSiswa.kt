package com.example.questmvvm_0100.model.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun FormSiswaPreview(

) {

}




@OptIn(ExperimentalStdlibApi::class)
@Composable
fun FormSiswa(
    //edit1 : parameter pilihanJk dan onSubmitButtonClicked
    pilihanJK: List<String>,
    onSubmitButtonCLicked: (MutableList<String>) -> Unit
    modifier: Modifier = Modifier
){}