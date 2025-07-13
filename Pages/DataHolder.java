package Pages;
public class DataHolder {
    private static String medName;
    private static int quantity;
    private static int price;
    private static int totalPrice;

    public static String getMedName() {
        return medName;
    }

    public static void setMedName(String newMedName) {
        medName = newMedName;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int newPrice) {
        price = newPrice;
    }

    public static int getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(int newTotalPrice) {
        totalPrice = newTotalPrice;
    }
}
