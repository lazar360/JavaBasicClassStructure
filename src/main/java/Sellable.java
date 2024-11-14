public interface Sellable {
    double getPrice();

    default String symbol() {
        return "$";
    }
}
