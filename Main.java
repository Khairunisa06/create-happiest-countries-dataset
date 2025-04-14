import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        String filePath = "data/happiestcountry.csv";
        List<Country> countries = reader.readCSV(filePath);

        for (Country country : countries) {
            System.out.println(country);
        }
    }
}
