package mbn.org.mathviz.fragment;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.VideoView;

import mbn.org.mathviz.R;


public class SetVisualizationFragment extends Fragment {

    VideoView video;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_set_visualization, container, false);
    }

    public void onViewCreated(View v, Bundle b){
        video = v.findViewById(R.id.vidSetVisualization);
        video.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName()+"/"+R.raw.subtraction));
    }

    public void onPause() {
        super.onPause();
        video.stopPlayback();
    }

    public void onResume() {
        super.onResume();
        video.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName()+"/"+R.raw.addition));
        video.start();
    }
}
