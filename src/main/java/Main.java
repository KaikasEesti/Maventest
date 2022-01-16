public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        double bonus = service.calculate (  10000, false);
        System.out.println("Бонус = " + bonus);
    }
}


