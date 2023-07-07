package br.com.antonio.listadetarefas

import android.annotation.SuppressLint

import androidx.compose.foundation.Image

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.antonio.listadetarefas.ui.theme.*


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun adicionarTerfa(navigationController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Purple700,
                title = {
                    Text(text = "Listagem de tarefas",
                         fontSize = 14.sp,
                         color = WHITE)
                }
            )
        },
        backgroundColor = BLACK,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                  navigationController.navigate("AdionarTerafa")
                }, backgroundColor = Purple200)
            {
            }
            Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_add), contentDescription = "Botao ir para a proxima página")
        }
    ){}
}