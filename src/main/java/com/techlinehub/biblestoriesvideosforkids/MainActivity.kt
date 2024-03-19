package com.techlinehub.biblestoriesvideosforkids

//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.R.layout
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.techlinehub.biblestoriesvideosforkids.ui.theme.BibleStoriesVideosForKidsTheme

import android.widget.Button;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;

import android.webkit.WebSettings;

import android.app.AlertDialog;
import android.content.DialogInterface;

import android.view.Menu;
import android.view.MenuItem;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_main)
    }

    fun clickWeb(v: View) {
        Toast.makeText(this@MainActivity, "Bible Stories Videos for Kids", Toast.LENGTH_LONG).show()
        val i1 = Intent(this@MainActivity, LoadWeb::class.java)
        startActivity(i1)
    }


//    public void clickfolder(View v) {
//        Toast.makeText(MainActivity.this, "Asset Fodler selected", Toast.LENGTH_LONG).show();
//        Intent i1 = new Intent(MainActivity.this,LoadingAssetsFolder.class);
//        startActivity(i1);
//    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BibleStoriesVideosForKidsTheme {
        Greeting("Android")
    }
}