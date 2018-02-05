package mbn.org.mathviz.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import mbn.org.mathviz.R;


public class NoLineVisualizationFragment extends Fragment {


    VideoView video;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_no_line_visualization, container, false);
    }

    public void onViewCreated(View v, Bundle b){
        video = v.findViewById(R.id.vidLineVisualiation);
        video.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName()+"/"+R.raw.addition));
    }

    public void onStop() {
        super.onStop();
        video.stopPlayback();
    }

    public void onStart() {
        super.onStart();
        video.start();
    }


}
