import java.util.Scanner;

public class Meadow {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Insect[] insects = new Insect[3];
        for (int i = 0; i < insects.length; ) {
            Insect insect = createInsect();
            if (isNotRepeated(insect, insects)) {
                insects[i] = insect;
                i++;
            } else {
                System.out.println("duplicat, ponów próbę dodawania" +
                        " owadów");
            }
        }
        for (Insect insect : insects) {
            System.out.println(insect);
        }
    }

    private static boolean isNotRepeated(Insect insect, Insect[] insects) {
        for (Insect ins : insects) {
            if (insect.equals(ins))
                return false;
        }
    }

    private static Insect createInsect() {
        System.out.println("Wpisz nazwę owada: ");
        String name = sc.nextLine();
        System.out.println("Wpisz ilość nóg owada: ");
        int legs = sc.nextInt();
        sc.nextLine();
        return new Insect(name, legs);
    }
}





