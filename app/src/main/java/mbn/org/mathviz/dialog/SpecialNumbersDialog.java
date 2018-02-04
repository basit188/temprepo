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

public class SpecialNumbersDialog extends DialogFragment implements View.OnClickListener{
    CardView cardE, cardPie, cardEvenNumbers,cardOddNumbers;
    public final String VIDEO_ID = "VIDEO_ID";
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(android.support.v4.app.DialogFragment.STYLE_NORMAL, R.style.FullScreenDialogStyle);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_special_numbers, container, false);
    }

    public void onViewCreated(View v, Bundle b) {
        ImageView c = v.findViewById(R.id.img_dialog_fullscreen_close);
        c.setOnClickListener(this);
        cardE = v.findViewById(R.id.cardE);
        cardPie = v.findViewById(R.id.cardPie);
        cardEvenNumbers = v.findViewById(R.id.cardEvenNumbers);
        cardOddNumbers = v.findViewById(R.id.cardOddNumbers);

        cardE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"eulers");
                getActivity().startActivity(i);
            }
        });

        cardPie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"pie");
                getActivity().startActivity(i);
            }
        });


        cardEvenNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"even");
                getActivity().startActivity(i);
            }
        });

        cardOddNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"odd");
                getActivity().startActivity(i);
            }
        });

    }

    public void onClick(View v) {
        this.dismiss();
    }
}

