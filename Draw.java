import interfaces.IDraw;

class Draw implements IDraw {

    @Override
    public void drawBoxAround(String stringToDrawAround, String color) {
        System.out.println(color + generateBox(stringToDrawAround));
    }

    @Override
    public void drawBoxAround(String stringToDrawAround) {
        System.out.println(generateBox(stringToDrawAround));
    }

    @Override
    public void drawLine(String string) {
        System.out.println("  " + string);
    }

    @Override
    public void drawLine(String string, String color) {
        System.out.println(color + "  " + string);
    }

    private String generateBox(String stringToDrawAround) {
        String outString = "";
        final int length = stringToDrawAround.length() + 4;
        final String newString = "AA" + stringToDrawAround + "AA";

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < length; x++) {
                if (x == 0) outString += " ";
                else if (x == length - 1 && y != 2) outString += " \n";
                else if (y == 0 || y == 2) outString += "-";
                else if (x >= 2 && x < length - 2 && y == 1) outString += newString.charAt(x);
                else outString += " ";
            }
        }
        return outString;
    }
}