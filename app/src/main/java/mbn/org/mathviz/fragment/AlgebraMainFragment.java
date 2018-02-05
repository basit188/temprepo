package mbn.org.mathviz.fragment;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.transition.Slide;
import android.support.transition.TransitionInflater;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import mbn.org.mathviz.R;
import mbn.org.mathviz.dialog.AlgebraContentsDialog;


/**
 * Created by basit on 1/2/18.
 */

public class AlgebraMainFragment extends Fragment implements View.OnClickListener{

    CardView cardAlgebra;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_algebra_main,container,false);
        return v;

    }

    public void onViewCreated(View v, Bundle b){
        cardAlgebra = v.findViewById(R.id.card_algebra_main);
        cardAlgebra.setOnClickListener(this);
    }

    public void onClick(View v) {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        AlgebraContentsDialog algebraContentsDialog = new AlgebraContentsDialog();
        algebraContentsDialog.show(fragmentManager, "AODialog");


    }

}
