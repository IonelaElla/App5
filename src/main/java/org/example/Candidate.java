package org.example;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.time.DateUtils;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Candidate implements Serializable {


    private int Number;
    private String Name;
    private String Contry;
    private String Time;


    private String Scor;


    public Candidate(int Number, String Name, String Contry, String Time, String Scor) {
        this.Number = Number;
        this.Name = Name;
        this.Contry = Contry;
        this.Time = Time;
        this.Time += countCharacters(Scor, 'o') * 10;
        this.Scor = Scor;

        countCharacters("xooxo,xooxo,xooo", 'o');
        countCharacters("xooxo,xooxo,xooo", 'x');
    }

    //
    // while (int index = Scor.indexOf(0)){
    int l;


    {
        Time = Time + 10;
    }

    public long calculateTime() {
        Date newDate = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            Date currDate = sdf.parse(Time);
             newDate = DateUtils.addSeconds(currDate, countCharacters(Scor,'o'));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return newDate.getTime();
    }

    private int countCharacters(String s, char findCharacters) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == findCharacters)
                count++;
        }
        System.out.println("f" + count);
        return count;


    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)

                .append("Number", Number)
                .append("Name", Name)
                .append("Contry", Contry)
                .append("Time", Time)
                .append("Scor", Scor)

                .toString();

    }
}

