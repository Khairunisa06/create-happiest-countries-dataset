import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public List<Country> readCSV(String filePath) {
        List<Country> countries = new ArrayList<>();
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Skip header
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] countryData = line.split(csvSplitBy);
                String name = countryData[0];
                int rank = parseInteger(countryData[1]);
                double score = parseDouble(countryData[2]);
                countries.add(new Country(name, rank, score));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countries;
    }

    private int parseInteger(String value) {
        if (value.equals("No Data")) {
            return -1; // Atau nilai default lainnya
        }
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1; // Atau nilai default lainnya
        }
    }

    private double parseDouble(String value) {
        if (value.equals("No Data")) {
            return -1.0; // Atau nilai default lainnya
        }
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1.0; // Atau nilai default lainnya
        }
    }
}
