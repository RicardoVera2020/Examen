package com.ricardovera.cl.examen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    private var editTextUsername: EditText? = null
    private var editTextPassword: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            // Utilizar el operador let para realizar la conversión de manera segura
            editTextUsername?.let { usernameEditText ->
                editTextPassword?.let { passwordEditText ->
                    // Obtener  valores  usuario y contraseña
                    val username = usernameEditText.text.toString()
                    val password = passwordEditText.text.toString()

                    // Validar en duro  los datos de usuario y contraseña
                    if (username == "admin" && password == "admin123") {
                        // Datos válidos, ir a la pantalla principal (HomeActivity)
                        val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                        startActivity(intent)
                         finish()
                    } else {
                        // Datos incorrectos, mostrar mensaje de error
                        Toast.makeText(
                            this@LoginActivity,
                            "Datos incorrectos. Intenta nuevamente.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
        }
    }
}
