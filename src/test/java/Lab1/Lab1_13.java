package Lab1;
import java.time.LocalDate;

public class Lab1_13 {
    public void calculateWarrantyExpiry(LocalDate purchaseDate, int warrantyYears, int warrantyMonths) {
        LocalDate expiryDate = purchaseDate.plusYears(warrantyYears).plusMonths(warrantyMonths);
        System.out.println("Purchase Date: " + purchaseDate);
        System.out.println("Warranty Period: " + warrantyYears + " years and " + warrantyMonths + " months");
        System.out.println("Warranty Expiry Date: " + expiryDate);
    }

    public static void main(String[] args) {
        Lab1_13 obj = new Lab1_13();

        LocalDate purchaseDate = LocalDate.of(2022, 6, 10);
        int warrantyYears = 1;
        int warrantyMonths = 6;

        obj.calculateWarrantyExpiry(purchaseDate, warrantyYears, warrantyMonths);
    }
}