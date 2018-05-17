package com.example.logonrm.pedidopizza

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
        fun logar(v: View)//esse valor View é uma classe do android
        {
            val login = etLogin.text.toString()
            val senha = etSenha.text.toString()


            if (login == "FIAP" && senha == "123") {
                //fazer uma intent para ir para a proxima tela pós login
                val intent = Intent(this, PedidoActivity::class.java)

                intent.putExtra("usuario", login)
                startActivity(intent)
                finish()
            } else {
                //Toast.makeText(this, "Usuário ou senha inválidos",
                  //      Toast.LENGTH_SHORT).show()

            }
        }

}

