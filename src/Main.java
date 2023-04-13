public class Main {
    public static void main(String[] args) {
        deliveryTime(95);
    }

    public static int deliveryTime(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance >= 80) {
            System.out.println("Доставка невозможна");
        } else {
            deliveryTime = deliveryDistance / 20 + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        return deliveryTime;
    }
}
