package block_1.practice4;

public class TestSeason {
    public static void printLove(Season season) {
        switch (season) {
            case WINTER: System.out.println("Я люблю зиму"); break;
            case SPRING: System.out.println("Я люблю весну"); break;
            case SUMMER: System.out.println("Я люблю лето"); break;
            case AUTUMN: System.out.println("Я люблю осень"); break;
        }
    }

    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.printf("Любимое время: %s, %.1f °C, %s%n", favorite,
                favorite.getAverageTemperature(), favorite.getDescription());
        printLove(favorite);
        for (Season season : Season.values()) {
            System.out.printf("%s: %.1f °C, %s%n", season,
                    season.getAverageTemperature(), season.getDescription());
        }
    }
}
