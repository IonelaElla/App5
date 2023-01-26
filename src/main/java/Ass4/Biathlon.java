//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVParser;
//import org.apache.commons.csv.CSVRecord;
//
//public class Biathlon{
//
//    public static void main(String[] args) throws Exception {
//        List<Athlete> athletes = new ArrayList<>();
//        FileReader filereader = new FileReader("results.csv");
//        CSVParser csvParser = new CSVParser(filereader, CSVFormat.DEFAULT);
//
//        for (CSVRecord record : csvParser) {
//            int athleteNumber = Integer.parseInt(record.get(0));
//            String athleteName = record.get(1);
//            String countryCode = record.get(2);
//            String skiTimeResult = record.get(3);
//            String firstShootingRange = record.get(4);
//            String secondShootingRange = record.get(5);
//            String thirdShootingRange = record.get(6);
//
//            Athlete athlete = new Athlete(athleteNumber, athleteName, countryCode, skiTimeResult);
//            int penalty = calculatePenalty(firstShootingRange) + calculatePenalty(secondShootingRange) + calculatePenalty(thirdShootingRange);
//            athlete.setFinalTime(penalty);
//            athletes.add(athlete);
//        }
//        csvParser.close();
//        Collections.sort(athletes);
//        System.out.println("Winner: " + athletes.get(0).getAthleteName() + " " + athletes.get(0).getFinalTime());
//        System.out.println("Runner-up: " + athletes.get(1).getAthleteName() + " " + athletes.get(1).getFinalTime());
//        System.out.println("Third Place: " + athletes.get(2).getAthleteName() + " " + athletes.get(2).getFinalTime
//
//
