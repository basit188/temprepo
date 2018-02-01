package mbn.org.mathviz.dialog;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import mbn.org.mathviz.R;

/**
 * Created by basit on 31/1/18.
 */

public class MathVizInfoDialog extends DialogFragment implements View.OnClickListener{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, R.style.FullScreenDialogStyle);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_mathvizinfo, container, false);

    }

    public void onViewCreated(View v, Bundle b){
        ImageView c = v.findViewById(R.id.img_dialog_fullscreen_close);
        c.setOnClickListener(this);
    }

    public void onClick(View v) {
        this.dismiss();
    }
}
