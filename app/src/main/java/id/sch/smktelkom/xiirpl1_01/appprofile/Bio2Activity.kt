package id.sch.smktelkom.xiirpl1_01.appprofile

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class Bio2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bio2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.elevation = 0F
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
