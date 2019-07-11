package np.com.nawarajbista.fragmentnavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_choose_recipient.*


class ChooseRecipientFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choose_recipient, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_next_recipient.setOnClickListener {
            if(addName.text.isEmpty()) {
                Toast.makeText(context, "must provide name of recipient", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            view.findNavController().navigate(R.id.action_chooseRecipientFragment_to_specifyAmountFragment)
        }

        button_cancel_recipient.setOnClickListener {
            activity?.onBackPressed()
        }
    }


}
