public class Main {
    public static void main(String[] args) {
        int oneBonusMile = 2000;
        int amountInKopecks = 3_000_000;

        int bonusMiles = amountInKopecks / oneBonusMile;
        System.out.println(bonusMiles);
    }
}
