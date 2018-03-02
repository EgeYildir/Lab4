import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Methods mtd = new Methods();
        try{
            String name = scn.next();
            mtd.delir(name);
        }catch(Exception e){
            System.out.println("Bayramın kutlu olsun...");
        }
    }


}
