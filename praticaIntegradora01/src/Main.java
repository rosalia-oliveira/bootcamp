public class Main {
    public static void main(String[] args) {
        String cities[] = {"London", "Madrid", "Nova York", "Buenos Aires", "Asuncion", "Sao Paulo", "Lima", "Santiago do Chile", "Lisbon", "Tokio"};
        int temperatures[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        String cityHighestTemperature = cities[0];
        String cityLowestTemperature = cities[0];
        int lowestTemperature = temperatures[0][0];
        int highestTemperature = temperatures[0][1];

        for (int index = 0; index < cities.length; index++) {
            if (temperatures[index][0] < lowestTemperature) {
                lowestTemperature = temperatures[index][0];
                cityLowestTemperature = cities[index];
            } else if (temperatures[index][1] > highestTemperature) {
                highestTemperature = temperatures[index][1];
                cityHighestTemperature = cities[index];
            }
        }

        System.out.println("Cidade com a temperatura mais baixa: " + cityLowestTemperature);
        System.out.println("Com a temperatura: " + lowestTemperature);
        System.out.println("Cidade com a temperatura mais alta: " + cityHighestTemperature);
        System.out.println("Com a temperatura: " + highestTemperature);
    }

}
