public class Main {
    public static void main(String[] args) {
        Price totalCost = new Price();
        int distance = (int) Math.ceil (23.5);
        System.out.println("K platbě: " + totalCost.getTotalPrice(distance) + " Kč.");
    }
}
