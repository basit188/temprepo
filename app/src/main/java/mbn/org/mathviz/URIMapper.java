package mbn.org.mathviz;

import android.net.Uri;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by basit on 5/2/18.
 */

public class URIMapper {

    private String video_id;
    public static final String[] VIDEO_IDS = {"natural_numbers","whole_numbers","integers","rational","integers","real_numbers","pie","eulers","even","odd","hcf","lcm","order_of_operations","percentage"};

    public URIMapper(String vid){
        video_id = vid;
    }


    public Uri getSetUri(){
        if(video_id.equalsIgnoreCase("natural_numbers")){}
        else if (video_id .equalsIgnoreCase("whole_numbers")){}
        else if (video_id .equalsIgnoreCase("integers")){}
        else if (video_id .equalsIgnoreCase("rational")){}
        else if (video_id .equalsIgnoreCase("integers")){}
        else if (video_id .equalsIgnoreCase("real_numbers")){}
        else if (video_id .equalsIgnoreCase("pie")){}
        else if (video_id .equalsIgnoreCase("eulers")){}
        else if (video_id .equalsIgnoreCase("even")){}
        else if (video_id .equalsIgnoreCase("odd")){}
        else if (video_id .equalsIgnoreCase("hcf")){}
        else if (video_id .equalsIgnoreCase("lcm")){}
        else if (video_id .equalsIgnoreCase("order_of_operations")){}
        else if (video_id .equalsIgnoreCase("percentage")){}
        return  null;
    }

    public Uri getLineUri(){
        if(video_id.equalsIgnoreCase("natural_numbers")){}
        else if (video_id .equalsIgnoreCase("whole_numbers")){}
        else if (video_id .equalsIgnoreCase("integers")){}
        else if (video_id .equalsIgnoreCase("rational")){}
        else if (video_id .equalsIgnoreCase("integers")){}
        else if (video_id .equalsIgnoreCase("real_numbers")){}
        else if (video_id .equalsIgnoreCase("pie")){}
        else if (video_id .equalsIgnoreCase("eulers")){}
        else if (video_id .equalsIgnoreCase("even")){}
        else if (video_id .equalsIgnoreCase("odd")){}
        else if (video_id .equalsIgnoreCase("hcf")){}
        else if (video_id .equalsIgnoreCase("lcm")){}
        else if (video_id .equalsIgnoreCase("order_of_operations")){}
        else if (video_id .equalsIgnoreCase("percentage")){}
        return  null;
    }
}
