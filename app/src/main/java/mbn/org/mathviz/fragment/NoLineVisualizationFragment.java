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


public class NoLineVisualizationFragment extends Fragment {

    private static final String VIDEO_ID = "VIDEO_ID";
    private VideoView video;
    private String video_id;
    Uri videoURI;
    public static NoLineVisualizationFragment newInstance(String vid){
        NoLineVisualizationFragment noLineVisualizationFragment = new NoLineVisualizationFragment();
        Bundle args = new Bundle();
        args.putString(VIDEO_ID,vid);
        noLineVisualizationFragment.setArguments(args);
        return noLineVisualizationFragment;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null)  video_id = getArguments().getString(VIDEO_ID);

        switch(video_id){
            case "addition":
                videoURI = Uri.parse("android.resource://" + getActivity().getPackageName()+"/"+R.raw.addition_line);
                break;
            case "subtraction":
                videoURI = Uri.parse("android.resource://" + getActivity().getPackageName()+"/"+R.raw.subtraction_line);
                break;
            case "multiplication":
                videoURI = Uri.parse("android.resource://" + getActivity().getPackageName()+"/"+R.raw.multiplication_line);
                break;
            case "division":
                videoURI = Uri.parse("android.resource://" + getActivity().getPackageName()+"/"+R.raw.division_line);
                break;
        }

        setUserVisibleHint(false);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_no_line_visualization, container, false);
    }

    public void onViewCreated(View v, Bundle b){
        video = v.findViewById(R.id.vidLineVisualiation);
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
