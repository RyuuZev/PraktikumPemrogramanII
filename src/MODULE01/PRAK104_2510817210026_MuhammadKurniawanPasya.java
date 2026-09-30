import java.util.Scanner;

public class PRAK104_2510817210026_MuhammadKurniawanPasya {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String Abu = input.nextLine();
        System.out.print("Tangan Bagas: ");
        String Bagas = input.nextLine();

        String[] abu = Abu.split(" ");
        String[] bagas = Bagas.split(" ");

        int poin_abu = 0;
        int poin_bagas = 0;

        for (int i = 0; i < 3; i++) {
            if (abu[i].equals("B") && bagas[i].equals("G")
                    || abu[i].equals("G") && bagas[i].equals("K")
                    || abu[i].equals("K") && bagas[i].equals("B")) {
                poin_abu++;
            } else if (!abu[i].equals(bagas[i])) {
                poin_bagas++;
            }
        }

        if (poin_abu == poin_bagas) {
            System.out.println("Seri");
        } else if (poin_abu > poin_bagas) {
            System.out.println("Abu");
        } else {
            System.out.println("Bagas");
        }
    }
}
