package michal.pawicki.timetablemanager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import michal.pawicki.timetablemanager.databinding.FragmentMonthCalendarBinding

class FragmentMonthCalendar : Fragment() {
    private var fragmentMonthCalendar: FragmentMonthCalendarBinding? = null
    private val binding get() = fragmentMonthCalendar!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentMonthCalendar = FragmentMonthCalendarBinding.inflate(inflater, container, false)
        return binding.root
    }

}