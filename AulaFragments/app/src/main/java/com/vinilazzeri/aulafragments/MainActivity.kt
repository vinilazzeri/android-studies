package com.vinilazzeri.aulafragments

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.vinilazzeri.aulafragments.fragments.ChamadasFragment
import com.vinilazzeri.aulafragments.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnMercado: Button
    private lateinit var btnChamadas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /*val fragmentManager = supportFragmentManager.beginTransaction()
        //diversas alteracoes em fragments
        val conversasFragment = ConversasFragment()
        fragmentManager.add(R.id.fragment_conteudo, conversasFragment)// OU (R.id.fragment_conteudo, ConversasFragment())
        fragmentManager.commit()*/
        /*
        *  Caso eu queira remover um fragment
        *
        * val conversasFragment = ConversasFragment()
        *
        *
        * */



        btnChamadas = findViewById(R.id.btn_chamadas)
        btnMercado = findViewById(R.id.btn_mercado)


        btnMercado.setOnClickListener {

            val bundle = bundleOf(
                "categoria" to "mercado",
                "user" to "vini"
            )

            /*val conversasFragment = ConversasFragment()

            conversasFragment.arguments = bundle*/

            //maneira "vanilla"

            /*supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, conversasFragment)
                .commit()
        }*/

            supportFragmentManager.commit {
                replace<ConversasFragment>(
                    R.id.fragment_conteudo,
                    args = bundle
                )
            }

        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, ChamadasFragment())
                //remove(conversasFragment) - caso queira remover
                .commit()
        }
    }
}
}