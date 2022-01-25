package lopez.pedro.primeraapp

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    lateinit var btnAbrir:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAbrir = findViewById(R.id.btnAbrir)

        btnAbrir.setOnClickListener{
            abrirActivity()
        }
    }
    fun abrirActivity(){
        val abrirSegunda = Intent(this,SegundaActivity::class.java)
        startActivity(abrirSegunda)
    }
}