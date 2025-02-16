
import java.util.Scanner;

public class UtilityFunctions {

    // 14. Convert percentage into a grade
    public static String getGrade(int percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 80) return "B";
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else return "F";
    }

    // 15. Determine zodiac sign based on birth month and day
    public static String getZodiacSign(int month, int day) {
        String[] signs = {"Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius"};
        int[] dates = {20, 19, 20, 20, 21, 21, 22, 22, 22, 23, 22, 21};
        return (day > dates[month - 1]) ? signs[month] : signs[month - 1];
    }

    // 16. Classify shape based on number of sides
    public static String classifyShape(int sides) {
        switch (sides) {
            case 3: return "Triangle";
            case 4: return "Quadrilateral";
            case 5: return "Pentagon";
            case 6: return "Hexagon";
            case 7: return "Heptagon";
            case 8: return "Octagon";
            default: return "Unknown Shape";
        }
    }

    // 17. Apply discount based on customer category
    public static double applyDiscount(String category, double price) {
        double discount = switch (category.toLowerCase()) {
            case "regular" -> 0.05;
            case "premium" -> 0.10;
            case "vip" -> 0.20;
            default -> 0.0;
        };
        return price - (price * discount);
    }

    // 18. Chess piece movement
    public static String getChessPieceMovement(String piece) {
        return switch (piece.toLowerCase()) {
            case "pawn" -> "Moves forward 1 square, 2 squares on first move";
            case "rook" -> "Moves horizontally or vertically";
            case "knight" -> "Moves in L shape";
            case "bishop" -> "Moves diagonally";
            case "queen" -> "Moves in any direction";
            case "king" -> "Moves one square in any direction";
            default -> "Unknown piece";
        };
    }

    // 19. Determine OS type
    public static String getOSType(String os) {
        return switch (os.toLowerCase()) {
            case "windows" -> "Windows";
            case "macos" -> "macOS";
            case "linux" -> "Linux";
            default -> "Unknown OS";
        };
    }

    // 20. Charge a fee based on vehicle type
    public static double getVehicleFee(String vehicleType) {
        return switch (vehicleType.toLowerCase()) {
            case "car" -> 5.00;
            case "truck" -> 10.00;
            case "motorcycle" -> 3.00;
            case "bus" -> 8.00;
            default -> 0.0;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage:
        System.out.println("Grade for 85%: " + getGrade(85));
        System.out.println("Zodiac sign for March 15: " + getZodiacSign(3, 15));
        System.out.println("Shape with 5 sides: " + classifyShape(5));
        System.out.println("Discounted price for VIP customer: " + applyDiscount("VIP", 100));
        System.out.println("Movement of a Queen: " + getChessPieceMovement("Queen"));
        System.out.println("OS type for Linux: " + getOSType("Linux"));
        System.out.println("Fee for a truck: " + getVehicleFee("Truck"));
    }
}
