/*
 * Copyright 2024 The Android Open Source Project
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

package androidx.wear.compose.material3.demos

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.wear.compose.integration.demos.common.ComposableDemo
import androidx.wear.compose.material3.TimeText
import androidx.wear.compose.material3.TimeTextDefaults
import androidx.wear.compose.material3.samples.TimeTextClockOnly
import androidx.wear.compose.material3.samples.TimeTextWithIcon
import androidx.wear.compose.material3.samples.TimeTextWithStatus

val TimeTextDemos =
    listOf(
        ComposableDemo("Clock only") { TimeTextClockOnly() },
        ComposableDemo("Clock with Status") { TimeTextWithStatus() },
        ComposableDemo("Clock with Icon") { TimeTextWithIcon() },
        ComposableDemo("Clock with custom colors") { TimeTextWithCustomColors() }
    )

@Composable
fun TimeTextWithCustomColors() {
    val customStyle = TimeTextDefaults.timeTextStyle(color = Color.Red)

    TimeText {
        text("ETA", customStyle)
        composable { Spacer(modifier = Modifier.size(4.dp)) }
        text("12:48")
        separator()
        time()
    }
}
