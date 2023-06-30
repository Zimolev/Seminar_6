package org.example.SeminarWork.TaskFour;

public class Fahrenheit implements Converter{

    @Override
    public double convertValue(double value) {
        return value*9/5+32;
    }
}