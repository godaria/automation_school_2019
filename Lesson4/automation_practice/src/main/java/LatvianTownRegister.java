public class LatvianTownRegister {

    private static String[] latvianTowns = {"Riga", "Liepaja", "Daugavpils", "Jelgava", "Bauska"};

    public static Boolean isLatvianTown(String town) {
        boolean result = false;
        for (String currentTown : latvianTowns) {
            if (currentTown.equals(town)) {
                result = true;
                break;
            }
        }

        return result;

    }
}
