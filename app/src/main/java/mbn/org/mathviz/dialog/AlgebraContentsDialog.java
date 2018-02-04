package mbn.org.mathviz.dialog;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import mbn.org.mathviz.R;

public class AlgebraContentsDialog  extends DialogFragment implements View.OnClickListener{
    CardView cardArithmeticOperations, cardSpecialNumbers,cardEvolutionOfNumbers,cardOtherConcepts;
    FragmentManager fragmentManager;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, R.style.FullScreenDialogStyle);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_algebra_contents,container,false);
        return v;
    }
    public void onViewCreated(View v, Bundle b) {
        cardArithmeticOperations = v.findViewById(R.id.cardArithmeticOperations);
        cardSpecialNumbers = v.findViewById(R.id.cardSpecialNumbers);
        cardEvolutionOfNumbers = v.findViewById(R.id.cardEvolutionOfNumbers);
        cardOtherConcepts = v.findViewById(R.id.cardOtherConcepts);
        fragmentManager = getActivity().getSupportFragmentManager();

        ImageView c = v.findViewById(R.id.img_dialog_fullscreen_close);
        c.setOnClickListener(this);

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
    public void onClick(View v) {
        this.dismiss();
    }

}