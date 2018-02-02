package mbn.org.mathviz.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mbn.org.mathviz.R;

/**
 * Created by basit on 1/2/18.
 */

public class AlgebraFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_algebra,container,false);
        return v;
    }
}
