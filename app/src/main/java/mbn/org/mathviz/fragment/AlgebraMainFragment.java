package mbn.org.mathviz.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import mbn.org.mathviz.R;

/**
 * Created by basit on 1/2/18.
 */

public class AlgebraMainFragment extends Fragment implements View.OnClickListener{
    FragmentTransaction fragmentTransaction;
    AlgebraFragment algebraFragment;
    FragmentManager fragmentManager;
    CardView cardAlgebra;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_algebra_main,container,false);
        return v;
    }

    public void onViewCreated(View v, Bundle b){
        cardAlgebra = v.findViewById(R.id.card_algebra);
        cardAlgebra.setOnClickListener(this);
    }

    public void onClick(View v) {
        cardAlgebra.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
        algebraFragment = new AlgebraFragment();
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out,android.R.anim.fade_in,android.R.anim.fade_out);
        fragmentTransaction.replace(R.id.algebraContainer,algebraFragment).addToBackStack("hh'").commit();
    }

}
