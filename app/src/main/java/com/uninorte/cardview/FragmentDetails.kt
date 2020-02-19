package com.uninorte.cardview


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.uninorte.cardview.data.User
import com.uninorte.cardview.databinding.FragmentFragmentDetailsBinding

/**
 * A simple [Fragment] subclass.
 */
class FragmentDetails : Fragment() {
    lateinit var userModel : User
    lateinit var mBinding :FragmentFragmentDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        userModel = arguments!!.getParcelable("data")!!
        mBinding= DataBindingUtil.setContentView(this.requireActivity(),R.layout.fragment_fragment_details)
        mBinding.user=userModel
    }


}
