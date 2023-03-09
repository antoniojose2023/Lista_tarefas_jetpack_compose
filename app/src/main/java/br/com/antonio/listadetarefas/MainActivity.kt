package br.com.antonio.listadetarefas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.antonio.listadetarefas.ui.theme.ListaDeTarefasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListaDeTarefasTheme {

                val navigationController = rememberNavController()

                val navHost = NavHost(navController = navigationController, startDestination = "AdionarTerafa"){
                    composable(
                        route = "ListaTarefas"
                    ){
                         listaTerfas(navigationController = navigationController)
                    }

                    composable(
                        route = "AdionarTerafa"
                    ){
                        adicionarTerfa(navigationController = navigationController)
                    }
                }

            }
        }
    }
}

