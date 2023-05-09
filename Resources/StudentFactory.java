package Resources;

public class StudentFactory {
    public static String generateName() {
        return "";
    }

    public static String generateIDNumber() {
        String id = "";
        for (int i = 0; i < 7; i++) {
            id += (int) (Math.random() * 10);
        }
        return id;
    }

    public static String generateBirthDate() {
        int year = (int) (Math.random() * 5) + 2071;
        int month = (int) (Math.random() * 12) + 1;
        int day = (int) (Math.random() * 28) + 1;
        return year + "-" + month + "-" + day;
    }
}
