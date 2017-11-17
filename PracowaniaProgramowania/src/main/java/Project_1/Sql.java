package Project_1;

public class Sql {
    String check;

    public boolean spr (String text) {
        check = "";
        test = " ";
        test = (test.toUpperCase() + ' ');
        int t = text.length();
        int x = 0;

        for (int i = 0; i < t; i++) {
            if (text.charAt(i) == ' ') {
                System.out.println(text.substring(x, i));
                if (text.substring(x, i).equals("SELECT")) {
                    check += "S";
                } else if (text.substring(x, i).equals("FROM")) {
                    check += "F";
                } else if (text.substring(x, i).equals("WHERE")) {
                    check += "W";
                } else if (text.substring(x, i).equals("ORDER")) {
                    check += "O";
                } else if (text.substring(x, i).equals("BY")) {
                    check += "B";
                }
                x = i + 1;
            }
        }
        if ((check.equals("SF")) || (check.equals("SFW")) || (check.equals("SFOB")) || (check.equals("SFWOB"))) {
            System.out.println("APPROVED !");
            return true;
        } else {
            System.out.println("ERROR !");
            return false;
        }
    }
}
