package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class App 
{
    public static void main( String[] args ) {
        ArrayList<Candidate> candidates = new ArrayList<>();
        Map<Long,Candidate> candidatesSorted = new TreeMap<>();



        candidates.add(new Candidate(15, "Balog Ionela", "America", "30:10","xooxo,xooxo,xooo"));
        candidates.add(new Candidate(53, "Bale Elena", "Romania", "20:12","xooxo,xooxo,xooo"));
        candidates.add(new Candidate(75, "Onac Alis", "Franta", "20:30","xooxo,xooxo,xooo"));
        candidates.add(new Candidate(100, "Man Elena", "Romania", "20:34","xooxo,xooxo,xooo"));

        for (Candidate candidate: candidates
        ) {
            candidatesSorted.put(candidate.calculateTime(),candidate);
        }
        candidatesSorted.values().forEach(System.out::println);

        for (Candidate candidate : candidates)

            try {
                ObjectOutputStream storage = new ObjectOutputStream(new FileOutputStream("candidate.csv"));//vrem intr-un fisier sa scriem un obiect
                storage.writeObject(candidate);


                ObjectInputStream storageReader = new ObjectInputStream(new FileInputStream("candidate.csv"));//ca sa citim (informaia) obiectul din storage.data trebui sa citim informatia(String de intrare)
                Candidate candidateRead = (Candidate) storageReader.readObject();
              //  System.out.println(candidate);



            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
    }
