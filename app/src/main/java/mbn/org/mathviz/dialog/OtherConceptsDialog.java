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

public class OtherConceptsDialog extends DialogFragment implements View.OnClickListener{
    CardView cardLcm, cardHcf,cardPercentage,cardOrderOfOperations;
    public final String VIDEO_ID = "VIDEO_ID";
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(android.support.v4.app.DialogFragment.STYLE_NORMAL, R.style.FullScreenDialogStyle);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_other_concepts, container, false);
    }

    public void onViewCreated(View v, Bundle b) {
        ImageView c = v.findViewById(R.id.img_dialog_fullscreen_close);
        c.setOnClickListener(this);
        cardLcm= v.findViewById(R.id.cardLcm);
        cardHcf = v.findViewById(R.id.cardHcf);
        cardOrderOfOperations = v.findViewById(R.id.cardOrderOfOperations);
        cardPercentage = v.findViewById(R.id.cardPercentage);

        cardLcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"lcm");
                getActivity().startActivity(i);
            }
        });

        cardHcf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"hcf");
                getActivity().startActivity(i);
            }
        });


        cardOrderOfOperations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"order_of_operations");
                getActivity().startActivity(i);
            }
        });

        cardPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), DisplayVisualizationActivity.class);
                i.putExtra(VIDEO_ID,"percentage");
                getActivity().startActivity(i);
            }
        });

    }

    public void onClick(View v) {
        this.dismiss();
    }
}
