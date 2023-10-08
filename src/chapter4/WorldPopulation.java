package chapter4;

public class WorldPopulation {
    public static void main(String[] args) {
        long currentWorldPopulation = 7_800_000_000L;
        long worldPopulationToday = 7_800_000_000L;
        int result = 0;
        String space = "          ";

        double growthRate = 0.011;
        for (int year = 1; year <= 75 ; year++) {
            long numericalIncrease = (long) (growthRate * currentWorldPopulation);
            currentWorldPopulation += numericalIncrease;

            System.out.printf("%d %s %d %s %d", year, space, currentWorldPopulation, space, numericalIncrease);
            long total = (int)(Math.floor(currentWorldPopulation / 100_000_000.0) * 100_000_000);
            if (total == 2 * worldPopulationToday) {
                result = year;
            }
            System.out.println();

        }
        System.out.println(result);
        /*
        *            long population = 7_800_000_000L;
           long anotherPopulation = 7_896_000_000L;

           long firstResult = (long)Math.floor((double) anotherPopulation / 100_000_000) * 100_000_000;
           System.out.println(population == firstResult);

        * */
    }
}
