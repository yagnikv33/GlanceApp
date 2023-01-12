package com.android.glanceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.text.Text
import com.android.glanceapp.ui.theme.GlanceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GlanceAppTheme {

            }
        }
    }
}

class GlanceWidgetProvider : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget
        get() = WidgetItems()
}

class WidgetItems : GlanceAppWidget() {
    @Composable
    override fun Content() {
        Text(
            text = "Hello Android"
        )
        //You can add your implementation here
    }
}