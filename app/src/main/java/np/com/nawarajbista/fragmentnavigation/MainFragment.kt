package np.com.nawarajbista.fragmentnavigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_transaction.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_transactionFragment)
        }

        button_money.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_chooseRecipientFragment)
        }

        button_balance.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_viewBalanceFragment)
        }
    }

}
