package com.example.composeapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.composeapp.R
import com.example.composeapp.ui.theme.ComposeAppTheme

class LoginFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                LoginScreen {
                    findNavController().navigate(R.id.to_room_browser)
                }
            }
        }
    }
}

@Composable
fun LoginScreen(onLoginClicked: () -> Unit) {
    Column(
        modifier = Modifier
            .padding(
                horizontal = 30.dp,
            )
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Email: ",
                modifier = Modifier.align(Alignment.CenterVertically),
            )
            TextField(
                value = "",
//                modifier = Modifier.align(Alignment.),
                onValueChange = {  }
            )
        }

        Spacer(modifier = Modifier.padding(vertical = 5.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Password: ",
                modifier = Modifier.align(Alignment.CenterVertically),
            )
            TextField(
                value = "",
                onValueChange = {  }
            )
        }

        Spacer(modifier = Modifier.padding(vertical = 10.dp))

        Button(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = onLoginClicked,
        ) {
            Text(text = "Login")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeAppTheme {
        LoginScreen{ }
    }
}