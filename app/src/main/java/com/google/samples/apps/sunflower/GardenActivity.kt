import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GardenActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 创建WebView并加载URL
        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient() // 确保网页在WebView中打开
        webView.loadUrl("https://t.ddz.cool/?room=wang1991")

        // 设置WebView为Activity的内容视图
        setContentView(webView)
    }
}