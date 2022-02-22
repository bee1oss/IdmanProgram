
package idmanprogrami;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Idman Programina Hosgelginiz...");
        
        String idmanlar = "Gecerli Hareketler... \n"
                + "Burpee\n"
                + "PushUP(Sinav)\n"
                + "Situp(Mekik)\n"
                + "Squad";
        System.out.println(idmanlar);
        System.out.println("Bir idman olusturun...");
        System.out.println("Burpee sayisi:");
        int burpee = scanner.nextInt();
        System.out.println("PushUP(Sinav) sayisi:");
        int pushup = scanner.nextInt();
        System.out.println("Situp(Mekik) sayisi:");
        int situp = scanner.nextInt();
        System.out.println("Squad sayisi:");
        int squad = scanner.nextInt();
        scanner.hasNextLine();
        
        Idman idman = new Idman(burpee,pushup,situp,squad);
        
        System.out.println("Idmaniniz basliyor...");
        
        while(idman.idmanBittiMi() == false){
            
            System.out.print("Hreket (Burpee ,Pushup , situp,squad):");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketi kac kere yapacaksiniz ? :");
            int sayi = scanner.nextInt();
            scanner.hasNextLine();
            idman.hareketYap(tur, sayi);
            
            
            
        }
        
    }
    
}
