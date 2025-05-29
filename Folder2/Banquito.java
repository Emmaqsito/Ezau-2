package Folder2;

public class Banquito {

    private String name;
    private String accountNumber;
    private int Score;

    public Banquito(String name, String accountNumber, int Score) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.Score = Score;
    }

    public String verify() {
        if (Score >= 700 && Score < 900) {
            return "Es candidato para TDC";
        } else if (Score >= 600 && Score < 700) {
            return "Requiere análisis adicional";
        } else {
            return "Puntaje invalido";
        }
    }

    public static void main(String[] args) {
        Banquito client1 = new Banquito("Ezau Craig", "5555555", 701);
        Banquito client2 = new Banquito("Jonathan Osibot Marquez Santiago", "6666666", 900);
        Banquito client3 = new Banquito("DEP Arqui", "77777", -1);

        System.out.println(
                client1.name + "," + " con numero de cuenta: " + client1.accountNumber + " " + client1.verify());
        System.out.println(
                client2.name + "," + " con numero de cuenta: " + client2.accountNumber + " " + client2.verify());
        System.out.println(
                client3.name + "," + " con numero de cuenta: " + client3.accountNumber + " " + client3.verify());
    }
}
