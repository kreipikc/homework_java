// Task 4 (Singleton, enum)
public class SeasonTranslator {
    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static String translateSeason(Season season) {
        return switch (season) {
            case WINTER -> "Зима";
            case SPRING -> "Весна";
            case SUMMER -> "Лето";
            case AUTUMN -> "Осень";
            default -> "Неизвестный сезон";
        };
    }
}
