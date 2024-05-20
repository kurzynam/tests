package org.example;

import java.util.ArrayList;

public class PlayList extends ArrayList<Song> {


    public Song atSecond(int seconds){
        int sumOfSeconds = 0;
        if(seconds < 0){
            throw new IndexOutOfBoundsException("Too small.");
        }
        for (Song song : this){
            if ((seconds >= sumOfSeconds) && (seconds < (sumOfSeconds + song.durationInSeconds()))) {
                return song;
            }
            sumOfSeconds += song.durationInSeconds();
        }
        throw new IndexOutOfBoundsException("Too big.");
    }

}
