import java.util.Scanner;

public class PartyAffiliation {
    static void main() {
        String party;
        Scanner in = new Scanner(System.in);
        System.out.print("D=Democrat, R=Republican, I=Independent. Pick your party: ");
        party = in.nextLine();
        if (party.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (party.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        }
        else if (party.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        }
        else {
            System.out.println("You get an Other Otter.");
        }
    }
}
