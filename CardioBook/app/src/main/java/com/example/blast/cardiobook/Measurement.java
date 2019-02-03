package com.example.blast.cardiobook;

public class Measurement {
    BloodPressure BP;
    TimeStamp Measured;
    String Comment;
    int Heartrate;

    public Measurement(BloodPressure BP, TimeStamp Measure, String Comment, int Heartrate){
        this.Heartrate = Heartrate;
        this.Comment = Comment;
    }
}
