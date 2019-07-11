package np.com.nawarajbista.fragmentnavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_specify_amount.*


class SpecifyAmountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_specify_amount, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_send_amount.setOnClickListener {
            if(amount.text.isEmpty()) {
                Toast.makeText(context,"must provide amount.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            view.findNavController().navigate(R.id.action_specifyAmountFragment_to_confirmationFragment)
        }

        button_cancel_amount.setOnClickListener {
            activity?.onBackPressed()
        }
    }


}
