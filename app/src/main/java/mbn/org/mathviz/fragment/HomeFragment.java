package mbn.org.mathviz.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import mbn.org.mathviz.R;
import mbn.org.mathviz.dialog.MathVizInfoDialog;

/**
 * Created by basit on 31/1/18.
 */

public class HomeFragment extends Fragment implements View.OnClickListener {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home,container,false);
        return v;
    }

    public void onViewCreated(View v, Bundle b){
        Button btnMathVizInfo = v.findViewById(R.id.btnMathVizInfo);
        btnMathVizInfo.setOnClickListener(this);
    }

    public void onClick(View v) {
        MathVizInfoDialog mathVizInfoDialog = new MathVizInfoDialog();
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        mathVizInfoDialog.show(fragmentManager,"InfoDialog");

    }

}
