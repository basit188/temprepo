package mbn.org.mathviz.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mbn.org.mathviz.R;

/**
 * Created by basit on 1/2/18.
 */

public class AlgebraMainFragment extends Fragment implements View.OnClickListener{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_algebra_main,container,false);
        return v;
    }

    public void onViewCreated(View v, Bundle b){
        CardView cardAlgebra = v.findViewById(R.id.card_algebra);
        cardAlgebra.setOnClickListener(this);
    }

    public void onClick(View v) {
        AlgebraFragment algebraFragment = new AlgebraFragment();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out,android.R.anim.fade_in,android.R.anim.fade_out);
        fragmentTransaction.replace(R.id.algebraContainer,algebraFragment).addToBackStack("hh'").commit();
    }
}
