package mbn.org.mathviz.fragment;


import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import mbn.org.mathviz.R;


public class SetVisualizationFragment extends Fragment {

    VideoView video;
    private static final String VIDEO_ID = "VIDEO_ID";
    private String video_id;
    Uri videoURI;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_set_visualization, container, false);
    }

    public static SetVisualizationFragment newInstance(String vid){
        SetVisualizationFragment setVisualizationFragment = new SetVisualizationFragment();
        Bundle args = new Bundle();
        args.putString(VIDEO_ID,vid);
        setVisualizationFragment.setArguments(args);
        return setVisualizationFragment;
    }

    public void onCreate(Bundle state) {
        super.onCreate(state);
        if(getArguments()!=null)  video_id = getArguments().getString(VIDEO_ID);
        setUserVisibleHint(false);

        switch(video_id){
            case "addition":
                videoURI = Uri.parse("android.resource://" + getActivity().getPackageName()+"/"+R.raw.addition_set);
                break;
            case "subtraction":
                videoURI = Uri.parse("android.resource://" + getActivity().getPackageName()+"/"+R.raw.subtraction_set);
                break;
            case "multiplication":
                videoURI = Uri.parse("android.resource://" + getActivity().getPackageName()+"/"+R.raw.multiplication_set);
                break;
            case "division":
                videoURI = Uri.parse("android.resource://" + getActivity().getPackageName()+"/"+R.raw.division_set);
                break;
            default:
                videoURI = videoURI = Uri.parse("android.resource://" + getActivity().getPackageName()+"/"+R.raw.division_set);
                break;

        }
    }

    public void onViewCreated(View v, Bundle b){
        video = v.findViewById(R.id.vidSetVisualization);
        video.setVideoURI(videoURI);
        video.start();

        FloatingActionButton fab =  v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video.setVideoURI(videoURI);
                video.start();
            }
        });

    }

    public void setMenuVisibility(final boolean visible) {
        super.setMenuVisibility(visible);
        if(isResumed()) {
            if (visible) {
                video.setVideoURI(videoURI);
                video.start();
            } else video.pause();
        }
    }
}
