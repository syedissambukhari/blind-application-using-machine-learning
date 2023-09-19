package org.tensorflow.lite.examples.detection.distance;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class DistanceFinder {
    //create array list of DistanceModel objects person, car, microwave, cell phone, apple,cat,mug, platter, watch, AND remote
    public  static ArrayList<String> _class = new ArrayList<String>(){
        {



            add("door");
            add("road");
            add("stairs");
            add("switch");

        }
    };
    @NonNull
    public static String getDistanceInInches(String objectName, float widthInPixels){
        if(DistanceFinder._class.contains(objectName)) {
            // result upto 2 floating point precision
            switch (objectName){
                case "door":
                    return String.format("%.02f",new DistanceModel("door", 387.606f, 1.43f, 21.5f).calcuteDistanceFromCameraInInches(widthInPixels)/10) + " inches";

                case "road":
                    return String.format("%.02f",new DistanceModel("road", 387.606f, 1.43f, 21.5f).calcuteDistanceFromCameraInInches(widthInPixels)/10) + " inches";

                case "stairs":
                    return String.format("%.02f",new DistanceModel("stairs", 387.606f, 1.43f, 21.5f).calcuteDistanceFromCameraInInches(widthInPixels)/10) + " inches";

                case "switch":
                    return String.format("%.02f",new DistanceModel("switch", 387.606f, 1.43f, 21.5f).calcuteDistanceFromCameraInInches(widthInPixels)/10) + " inches";


            }

        }
        return " ";
    }

    @NonNull
    public static String getDistanceInInchesUsingFocal(String objectName, float widthInPixels){
        if(DistanceFinder._class.contains(objectName)) {
            // result upto 2 floating point precision
            switch (objectName){
                case "door":
                    return String.format("%.02f",new DistanceModel("door", 387.606f, 18.1f, 21.5f).calcuteDistanceFromCameraInInchesUsingFocal(widthInPixels)) + " inches";
                case "road":
                    return String.format("%.02f",new DistanceModel("road", 387.606f, 18.1f, 21.5f).calcuteDistanceFromCameraInInchesUsingFocal(widthInPixels)) + " inches";
                case "stairs":
                    return String.format("%.02f",new DistanceModel("stairs", 387.606f, 18.1f, 21.5f).calcuteDistanceFromCameraInInchesUsingFocal(widthInPixels)) + " inches";
                case "switch":
                    return String.format("%.02f",new DistanceModel("switch", 387.606f, 18.1f, 21.5f).calcuteDistanceFromCameraInInchesUsingFocal(widthInPixels)) + " inches";
            }

        }
        return " ";
    }



}
