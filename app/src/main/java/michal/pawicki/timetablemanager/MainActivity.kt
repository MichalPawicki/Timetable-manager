package michal.pawicki.timetablemanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import michal.pawicki.timetablemanager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}