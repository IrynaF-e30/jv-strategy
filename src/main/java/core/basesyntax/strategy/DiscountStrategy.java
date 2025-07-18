package core.basesyntax.strategy;

public class DiscountStrategy {

    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        if (specialEvent == null) {
            return new DefaultDiscountService();
        }

        return switch (specialEvent) {
            case "Новий рік" -> new NewYearDiscountService();
            case "День народження" -> new BirthdayDiscountService();
            case "Чорна п'ятниця" -> new BlackFridayDiscountService();
            default -> new DefaultDiscountService();
        };
    }
}
