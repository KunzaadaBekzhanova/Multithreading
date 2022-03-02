package kg.tutorialapp.multithreading

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
   private var tv_counter: TextView =findViewById(R.id.count)
   private var btn_start: Button =findViewById(R.id.button)
   private var workResult=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()

    }
    private fun setup(){

        btn_start.setOnClickListener{
            doSomeWork()
        }
    }

    private fun doSomeWork() {
        for(i in 0..4){
            Thread.sleep(1000)
            workResult++
        }
        tv_counter.text=workResult.toString()
    }

}