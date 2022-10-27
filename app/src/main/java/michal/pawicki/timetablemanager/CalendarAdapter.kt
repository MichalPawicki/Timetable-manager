package michal.pawicki.timetablemanager


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import michal.pawicki.timetablemanager.databinding.CalendarCellBinding
import java.util.*

class CalendarAdapter : RecyclerView.Adapter<CalendarAdapter.ViewHolder>() {
    abstract class ViewHolder(binding: CalendarCellBinding) : RecyclerView.ViewHolder(binding.root)

    private var dayOfMonth = ArrayList<String>()

    fun updateCalendar(dayOfMonth: ArrayList<String>) {
        this.dayOfMonth = dayOfMonth
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            CalendarCellBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 0
    }


}