package mbn.org.mathviz.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import mbn.org.mathviz.dialog.ArthemeticOperationsDialog;

import mbn.org.mathviz.R;

/**
 * Created by basit on 1/2/18.
 */

public class AlgebraFragment extends Fragment{
    CardView cardArithmeticOperations, cardSpecialNumbers,cardEvolutionOfNumbers,cardOtherConcepts;
    FragmentManager fragmentManager;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_algebra,container,false);
        return v;
    }
    public void onViewCreated(View v, Bundle b){
        cardArithmeticOperations = v.findViewById(R.id.cardArithmeticOperations);
        cardSpecialNumbers = v.findViewById(R.id.cardSpecialNumbers);
        cardEvolutionOfNumbers= v.findViewById(R.id.cardEvolutionOfNumbers);
        cardOtherConcepts = v.findViewById(R.id.cardOtherConcepts);
        fragmentManager = getActivity().getSupportFragmentManager();

        cardArithmeticOperations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArthemeticOperationsDialog arthemeticOperationsDialog = new ArthemeticOperationsDialog();
                arthemeticOperationsDialog.show(fragmentManager,"AODialog");
            }
        });


    }
}
