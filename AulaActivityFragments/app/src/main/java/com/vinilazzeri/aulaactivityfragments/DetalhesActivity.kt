package com.vinilazzeri.aulaactivityfragments

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetalhesActivity : AppCompatActivity() {
    lateinit var buttonFechar: Button
    lateinit var textFilme: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    buttonFechar = findViewById(R.id.btn_fechar)
    textFilme = findViewById(R.id.text_filme)

    val bundle = intent.extras //tem todos os parametros passados
    //val filme = bundle?.getString("filme")
    if ( bundle != null ){
        /*val filme = bundle.getString("filme")
        val classificacao = bundle.getInt("classificacao")
        val avaliacoes = bundle.getDouble("avaliacoes")*/

        /*var resultado = "filme: $filme | class: $classificacao | aval: $avaliacoes "*/

        /*val filme = if (Build.VERSION.SDK_INT >= 33){
            bundle.getSerializable("filme", Filme::class.java)
        } else {
            bundle.getSerializable("filme") as Filme
        }
        //val filme = bundle.getSerializable("filme") as Filme

        textFilme.text = "${filme?.nome} | ${filme?.distribuidor}"*/

        val filme = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            bundle.getParcelable("filme", Filme::class.java)
        } else {
            bundle.getParcelable("filme")
        }

        textFilme.text = "${filme?.nome} | ${filme?.distribuidor}"
    }
    buttonFechar.setOnClickListener {
        finish()
    }

    //caso quisesse enviar para outra pagina. caso eu queira apenas finalizar
    //devo utilizar o metodo finish
    /*buttonFechar.setOnClickListener {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }*/

    }

}