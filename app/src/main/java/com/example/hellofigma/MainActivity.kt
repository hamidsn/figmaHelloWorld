/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.hellofigma

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hellofigma.hellocard.Design
import com.example.hellofigma.ui.theme.HelloFigmaTheme
import com.example.hellofigma.hellocard.HelloCard
import com.example.hellofigma.imageleft.ImageLeft
import com.example.hellofigma.imageleft.Platform
import com.example.hellofigma.imageleft.State

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloFigmaTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                 HelloCard(title = "Testing",
                      description = "3rd variant is here",
                  design = Design.ImageTitleMessage,
                  onDoubleTap = {Toast.makeText(baseContext, "Double clicked" , Toast.LENGTH_SHORT).show()})
                }
                /* Spacer(modifier = Modifier.size(12.dp))*/

                ImageLeft(platform = Platform.Android, state = State.PartialLoad)
              //  ImageLeft(platform = Platform.Android, state = State.Normal)
            }

        }
       //

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Helloaa $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloFigmaTheme {

    }
}