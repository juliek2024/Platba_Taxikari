public class Price {
    private int rate;
    private int distance;
    private int totalPrice;

    public Price() {
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTotalPrice(int distance) {
        setDistance(distance);
        this.rate = getRatePerDistance();
        this.totalPrice = distance * this.rate;
        return totalPrice;
    }

    public int getRatePerDistance() {
        if (distance == 0 ) {
            rate = 0;
        } else if (distance > 0 && distance <= 19) {
            rate = 25;
        } else if (distance >= 20 && distance <= 39) {
            rate = 23;
        } else if (distance >= 40 && distance <= 59) {
            rate = 20;
        } else if (distance >= 60) {
            rate = 17;
        } else{
            throw new IllegalArgumentException("Zkotroluj zadanou hodnotu - vzdálenost nesmí být záporná.");
        }
        return rate;
    }
}
