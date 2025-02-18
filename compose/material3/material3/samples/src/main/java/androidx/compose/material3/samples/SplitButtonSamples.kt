/*
 * Copyright 2023 The Android Open Source Project
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

package androidx.compose.material3.samples

import androidx.annotation.Sampled
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedSplitButton
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.FilledSplitButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedSplitButton
import androidx.compose.material3.SplitButton
import androidx.compose.material3.SplitButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TonalSplitButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Sampled
@Composable
@Preview
fun SplitButtonSample() {
    var expanded by remember { mutableStateOf(false) }

    SplitButton(
        leadingButton = {
            SplitButtonDefaults.LeadingButton(
                modifier = Modifier.height(48.dp),
                onClick = { /* Do Nothing */ },
            ) {
                Icon(
                    Icons.Outlined.Edit,
                    contentDescription = "Localized description",
                )
                Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                Text("My Button")
            }
        },
        trailingButton = {
            SplitButtonDefaults.AnimatedTrailingButton(
                modifier = Modifier.size(48.dp),
                onClick = { expanded = !expanded },
                expanded = expanded,
            ) {
                val rotation: Float by
                    animateFloatAsState(
                        targetValue = if (expanded) 180f else 0f,
                        label = "Trailing Icon Rotation"
                    )
                Icon(
                    Icons.Outlined.KeyboardArrowDown,
                    modifier = Modifier.graphicsLayer { this.rotationZ = rotation },
                    contentDescription = "Localized description"
                )
            }
        }
    )
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Sampled
@Composable
@Preview
fun FilledSplitButtonSample() {
    var expanded by remember { mutableStateOf(false) }

    FilledSplitButton(
        onLeadingButtonClick = {},
        expanded = expanded,
        onTrailingButtonClick = { expanded = !expanded },
        leadingContent = {
            Icon(
                Icons.Outlined.Edit,
                contentDescription = "Localized description",
                modifier = Modifier.size(28.dp)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("My Button", fontSize = 18.sp)
        },
        trailingContent = {
            val rotation: Float by
                animateFloatAsState(
                    targetValue = if (expanded) 180f else 0f,
                    label = "Trailing Icon Rotation"
                )
            Box(
                modifier = Modifier.fillMaxHeight().aspectRatio(1f),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    Icons.Outlined.KeyboardArrowDown,
                    modifier = Modifier.size(38.dp).graphicsLayer { this.rotationZ = rotation },
                    contentDescription = "Localized description"
                )
            }
        }
    )
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Sampled
@Composable
@Preview
fun TonalSplitButtonSample() {
    var expanded by remember { mutableStateOf(false) }

    TonalSplitButton(
        onLeadingButtonClick = {},
        expanded = expanded,
        onTrailingButtonClick = { expanded = !expanded },
        leadingContent = {
            Icon(Icons.Outlined.Edit, contentDescription = "Localized description")
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("My Button")
        },
        trailingContent = {
            val rotation: Float by
                animateFloatAsState(
                    targetValue = if (expanded) 180f else 0f,
                    label = "Trailing Icon Rotation"
                )
            Box(modifier = Modifier.size(44.dp), contentAlignment = Alignment.Center) {
                Icon(
                    Icons.Outlined.KeyboardArrowDown,
                    modifier = Modifier.graphicsLayer { this.rotationZ = rotation },
                    contentDescription = "Localized description"
                )
            }
        }
    )
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Sampled
@Composable
@Preview
fun ElevatedSplitButtonSample() {
    var expanded by remember { mutableStateOf(false) }

    ElevatedSplitButton(
        onLeadingButtonClick = {},
        expanded = expanded,
        onTrailingButtonClick = { expanded = !expanded },
        leadingContent = {
            Icon(Icons.Outlined.Edit, contentDescription = "Localized description")
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("My Button")
        },
        trailingContent = {
            val rotation: Float by
                animateFloatAsState(
                    targetValue = if (expanded) 180f else 0f,
                    label = "Trailing Icon Rotation"
                )
            Box(modifier = Modifier.size(44.dp), contentAlignment = Alignment.Center) {
                Icon(
                    Icons.Outlined.KeyboardArrowDown,
                    modifier = Modifier.graphicsLayer { this.rotationZ = rotation },
                    contentDescription = "Localized description"
                )
            }
        }
    )
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Sampled
@Composable
@Preview
fun OutlinedSplitButtonSample() {
    var expanded by remember { mutableStateOf(false) }

    OutlinedSplitButton(
        onLeadingButtonClick = {},
        expanded = expanded,
        onTrailingButtonClick = { expanded = !expanded },
        leadingContent = {
            Icon(Icons.Outlined.Edit, contentDescription = "Localized description")
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("My Button")
        },
        trailingContent = {
            val rotation: Float by
                animateFloatAsState(
                    targetValue = if (expanded) 180f else 0f,
                    label = "Trailing Icon Rotation"
                )
            Box(modifier = Modifier.size(44.dp), contentAlignment = Alignment.Center) {
                Icon(
                    Icons.Outlined.KeyboardArrowDown,
                    modifier = Modifier.graphicsLayer { this.rotationZ = rotation },
                    contentDescription = "Localized description"
                )
            }
        }
    )
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Sampled
@Composable
@Preview
fun SplitButtonWithTextSample() {
    var expanded by remember { mutableStateOf(false) }

    SplitButton(
        leadingButton = {
            SplitButtonDefaults.LeadingButton(
                onClick = { /* Do Nothing */ },
            ) {
                Text("My Button")
            }
        },
        trailingButton = {
            SplitButtonDefaults.AnimatedTrailingButton(
                onClick = { expanded = !expanded },
                expanded = expanded,
            ) {
                val rotation: Float by
                    animateFloatAsState(
                        targetValue = if (expanded) 180f else 0f,
                        label = "Trailing Icon Rotation"
                    )
                Icon(
                    Icons.Outlined.KeyboardArrowDown,
                    modifier = Modifier.graphicsLayer { this.rotationZ = rotation },
                    contentDescription = "Localized description"
                )
            }
        }
    )
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Sampled
@Composable
@Preview
fun SplitButtonWithIconSample() {
    var expanded by remember { mutableStateOf(false) }

    SplitButton(
        leadingButton = {
            SplitButtonDefaults.LeadingButton(
                onClick = { /* Do Nothing */ },
            ) {
                Icon(
                    Icons.Outlined.Edit,
                    contentDescription = "Localized description",
                )
            }
        },
        trailingButton = {
            SplitButtonDefaults.AnimatedTrailingButton(
                onClick = { expanded = !expanded },
                expanded = expanded,
                modifier = Modifier.size(44.dp)
            ) {
                val rotation: Float by
                    animateFloatAsState(
                        targetValue = if (expanded) 180f else 0f,
                        label = "Trailing Icon Rotation"
                    )
                Icon(
                    Icons.Outlined.KeyboardArrowDown,
                    modifier = Modifier.graphicsLayer { this.rotationZ = rotation },
                    contentDescription = "Localized description"
                )
            }
        }
    )
}
