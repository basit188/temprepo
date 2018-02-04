package mbn.org.mathviz.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.transition.Explode;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import mbn.org.mathviz.activity.DisplayVisualizationActivity;
import mbn.org.mathviz.dialog.ArthemeticOperationsDialog;

import mbn.org.mathviz.R;
import mbn.org.mathviz.dialog.EvolutionOfNumbersDialog;
import mbn.org.mathviz.dialog.OtherConceptsDialog;
import mbn.org.mathviz.dialog.SpecialNumbersDialog;

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
    public void onViewCreated(View v, Bundle b) {
        cardArithmeticOperations = v.findViewById(R.id.cardArithmeticOperations);
        cardSpecialNumbers = v.findViewById(R.id.cardSpecialNumbers);
        cardEvolutionOfNumbers = v.findViewById(R.id.cardEvolutionOfNumbers);
        cardOtherConcepts = v.findViewById(R.id.cardOtherConcepts);
        fragmentManager = getActivity().getSupportFragmentManager();

        cardArithmeticOperations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArthemeticOperationsDialog arthemeticOperationsDialog = new ArthemeticOperationsDialog();
                arthemeticOperationsDialog.show(fragmentManager, "AODialog");
            }
        });

        cardOtherConcepts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment otherConceptsDialog = new OtherConceptsDialog();
                otherConceptsDialog.show(fragmentManager, "AODi2g");

            }
        });

        cardSpecialNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment specialNumbers = new SpecialNumbersDialog();
                specialNumbers.show(fragmentManager, "specialNumbers");

            }
        });

        cardEvolutionOfNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment evolutionOfNumbers = new EvolutionOfNumbersDialog();
                evolutionOfNumbers.show(fragmentManager, "evolution");


            }
        });


    }


}
