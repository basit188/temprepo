package mbn.org.mathviz.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import mbn.org.mathviz.R;


/**
 * Created by basit on 31/1/18.
 */

public class ContentsFragment extends Fragment {


    FrameLayout algebraContainer, geometryContainer;
    Fragment algebraMain, geometryMain;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contents,container,false);
        return v;
    }

    public void onViewCreated(View v, Bundle b){
//        cardAlgebra = v.findViewById(R.id.card_algebra);
//        cardGeometry = v.findViewById(R.id.card_geometry);
        algebraContainer = v.findViewById(R.id.algebraContainer);
        geometryContainer = v.findViewById(R.id.geometryContainer);
        algebraMain = new AlgebraMainFragment();
        geometryMain = new GeometryMainFragment();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.algebraContainer,algebraMain);
        fragmentTransaction.add(R.id.geometryContainer,geometryMain);
        fragmentTransaction.commit();
        //        cardAlgebra.setOnClickListener(this);
    }

    public void onClick(View v) {
        AlgebraFragment algebraFragment = new AlgebraFragment();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out,android.R.anim.fade_in,android.R.anim.fade_out);
        fragmentTransaction.replace(R.id.algebraContainer,algebraFragment).addToBackStack("hh'").commit();
    }
}
