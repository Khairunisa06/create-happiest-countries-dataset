public class Country {
    private String name;
    private int rank;
    private double score;

    public Country(String name, int rank, double score) {
        this.name = name;
        this.rank = rank;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", score=" + score +
                '}';
    }
}
