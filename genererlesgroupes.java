import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class genererlesgroupes {

    public static void main(String[] args) {
        ArrayList<String> groupe1 = new ArrayList<>();
        ArrayList<String> groupe2 = new ArrayList<>();
        ArrayList<String> groupe3 = new ArrayList<>();
        ArrayList<String> groupe4 = new ArrayList<>();
        ArrayList<String> groupe5 = new ArrayList<>();
        ArrayList<String> groupe6 = new ArrayList<>();
        ArrayList<String> groupe7 = new ArrayList<>();
        ArrayList<String> groupe8 = new ArrayList<>();
        ArrayList<String> groupe9 = new ArrayList<>();
        ArrayList<String> groupe10 = new ArrayList<>();
        ArrayList<ArrayList<String>> ToutGroup = new ArrayList<>();
        ToutGroup.add(groupe1);
        ToutGroup.add(groupe2);
        ToutGroup.add(groupe3);
        ToutGroup.add(groupe4);
        ToutGroup.add(groupe5);
        ToutGroup.add(groupe6);
        ToutGroup.add(groupe7);
        ToutGroup.add(groupe8);
        ToutGroup.add(groupe9);
        ToutGroup.add(groupe10);
        Scanner scan = new Scanner(System.in);
        int aa = 0;
        System.out.println("bienvenu sur le prograggrame de gestion");
        do {
            boolean condition = true;
            System.out.println("entre le nom :");
            String nom = scan.nextLine();
            while (nom.trim() == "") {
                System.out.println("entre le nom :");
                nom = scan.nextLine();

            }
            Random ran = new Random();
            do {
                int nba = ran.nextInt(10);
                if (ToutGroup.get(nba).size() < 1) {
                    ToutGroup.get(nba).add(nom);
                    aa++;
                    condition = false;
                }
                System.out.println(aa);
            } while (condition);
            System.out.println(ToutGroup);
            // System.out.println(ToutGroup.get(0));
        } while (aa < 10);
        System.out.println(ToutGroup);
        String c = "1";
        int c1 = 1;
        try (FileWriter fileWriter = new FileWriter("exemple.txt")) {
            for (ArrayList<String> AA : ToutGroup) {

                fileWriter.write("groupe : ");
                fileWriter.write(c);
                fileWriter.write(" \n");
                
                for (int i = 0; i < AA.size(); i++) {
                    fileWriter.write(AA.get(i));
                    fileWriter.write("\t ||");
                }
                fileWriter.write("\n");
                for (int i = 0; i < 10; i++) {

                    fileWriter.write("**");
                }
                fileWriter.write("\n");
                fileWriter.write("\n");
                c1++;
                c= ""+c1;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("eerrreqeeuurr");
            System.out.println(e);
        }
    }
}
