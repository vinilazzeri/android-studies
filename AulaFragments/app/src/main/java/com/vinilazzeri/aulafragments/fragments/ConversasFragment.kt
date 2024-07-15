package com.vinilazzeri.aulafragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.vinilazzeri.aulafragments.R
import org.w3c.dom.Text

//class ConversasFragment : Fragment(R.layout.fragment_conversas) {
class ConversasFragment : Fragment() {

    private lateinit var btnExecutar: Button
    private lateinit var txtNome: TextView
    private lateinit var txtCategoria: TextView
    private lateinit var editNome: EditText

    private var categoria: String? = null
    private var user: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        categoria = arguments?.getString("categoria")
        user = arguments?.getString("user")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_conversas,
            container,
            false
        )

        btnExecutar = view.findViewById(R.id.btn_executar)
        txtNome = view.findViewById(R.id.text_nome)
        txtCategoria = view.findViewById(R.id.text_categoria)
        editNome = view.findViewById(R.id.edit_nome)

        txtCategoria.text = categoria
        txtNome.text = user

        btnExecutar.setOnClickListener {
            txtNome.text = "Olá ${editNome.text.toString()}!"
        }

        return view
    }
}