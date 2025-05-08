/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

 package com.google.samples.apps.sunflower.compose

 import android.app.Activity
 import android.content.Intent
 import android.net.Uri
 import android.webkit.WebView
 import androidx.compose.runtime.Composable
 import androidx.compose.ui.platform.AndroidView
 import androidx.compose.ui.platform.LocalContext
 import androidx.core.app.ShareCompat
 import androidx.core.content.ContextCompat
 import android.webkit.WebViewClient
 
 @Composable
 fun SunflowerApp() {
     val context = LocalContext.current
     AndroidView(
         factory = { context ->
             WebView(context).apply {
                 settings.javaScriptEnabled = true
                 webViewClient = WebViewClient() // 必须添加，否则可能无法加载网页
                 loadUrl("https://t.ddz.cool/?room=wang1991")
             }
         }
     )
 }