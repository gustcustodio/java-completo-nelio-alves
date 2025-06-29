package secao17.map.exercicio.proposto.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\Temp\\aula190.txt";

        Map<String, Integer> votes = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String nameOfCandidate = fields[0];
                int numberOfVotes = Integer.parseInt(fields[1]);

                if (votes.containsKey(nameOfCandidate)) {
                    int aux = votes.get(nameOfCandidate);
                    votes.put(nameOfCandidate, numberOfVotes + aux);
                } else {
                    votes.put(nameOfCandidate, numberOfVotes);
                }

                line = br.readLine();
            }

            for (String key : votes.keySet()) {
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }

    }
}
