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

public class ArthemeticOperationsDialog extends DialogFragment implements View.OnClickListener{
 CardView cardAddition, cardSubtraction,cardDivision,cardMultiplication;
public final String VIDEO_ID = "VIDEO_ID";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, R.style.FullScreenDialogStyle);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_arthemetic_operations, container, false);
    }

    public void onViewCreated(View v, Bundle b){
        ImageView c = v.findViewById(R.id.img_dialog_fullscreen_close);
        c.setOnClickListener(this);
        cardAddition = v.findViewById(R.id.cardAddition);
        cardSubtraction = v.findViewById(R.id.cardSubtraction);
        cardDivision = v.findViewById(R.id.cardDivision);
        cardMultiplication = v.findViewById(R.id.cardMultiplication);

        cardAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"addition");
                getActivity().startActivity(i);
            }
        });

        cardSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"subtraction");
                getActivity().startActivity(i);
            }
        });


        cardMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"multiplication");
                getActivity().startActivity(i);
            }
        });

        cardDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"division");
                getActivity().startActivity(i);
            }
        });
    }

    public void onClick(View v) {
        this.dismiss();
    }


}

