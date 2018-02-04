package mbn.org.mathviz.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import mbn.org.mathviz.R;
import mbn.org.mathviz.activity.DisplayVisualizationActivity;

public class EvolutionOfNumbersDialog extends DialogFragment implements View.OnClickListener {
    CardView cardNaturalNumbers, cardWholeNumbers, cardIntegers,cardRational,cardIrrational,cardRealNumbers;
    public final String VIDEO_ID = "VIDEO_ID";
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, R.style.FullScreenDialogStyle);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_evolution_of_numbers, container, false);
    }

    public void onViewCreated(View v, Bundle b) {
        ImageView c = v.findViewById(R.id.img_dialog_fullscreen_evolution_close);
        c.setOnClickListener(this);
        cardNaturalNumbers = v.findViewById(R.id.cardNaturalNumbers);
        cardWholeNumbers = v.findViewById(R.id.cardWholeNumbers);
        cardIntegers = v.findViewById(R.id.cardIntegers);
        cardRational = v.findViewById(R.id.cardRational);
        cardIrrational = v.findViewById(R.id.cardIrrational);
        cardRealNumbers = v.findViewById(R.id.cardRealNumbers);

        cardNaturalNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"natural_numbers");
                getActivity().startActivity(i);
            }
        });

        cardWholeNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"whole_numbers");
                getActivity().startActivity(i);
            }
        });


        cardIntegers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"integers");
                getActivity().startActivity(i);
            }
        });

        cardRational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"rational");
                getActivity().startActivity(i);
            }
        });

        cardIrrational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"irrational");
                getActivity().startActivity(i);
            }
        });

        cardRealNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"real_numbers");
                getActivity().startActivity(i);
            }
        });
    }


    public void onClick(View v) {
        this.dismiss();
    }
}