package kiri.development.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btnStart)
        val et_name : EditText = findViewById(R.id.et_name)

        btnStart.setOnClickListener{
            if(et_name.text.isNotEmpty()){
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this, "You need to insert a Name",Toast.LENGTH_LONG).show()
            }
        }
    }
}