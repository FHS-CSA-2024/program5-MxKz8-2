//import stuff here?

//Your code here
public class Program5 {
    public static void main(String[] args){        
        int royaleMi = 286;
        int royaleGa = 9;
        int koopaMi = 412;
        int koopaGa = 40;
        int pipeMi = 361;
        int pipeGa = 18;
        int badwagonMi = 161;
        int badwagonGa = 11;
        
        double royaleMPG = (double) royaleMi / royaleGa;
        double koopaMPG = (double) koopaMi / koopaGa;
        double pipeMPG = (double) pipeMi / pipeGa;
        double badwagonMPG = (double) badwagonMi / badwagonGa;

      // rounding to the nearest tenth is 10.0/10.0, adds 2 decimal points? It specifies how many decimal places I guess
        royaleMPG = Math.round(royaleMPG*10.0)/10.0;
        koopaMPG = Math.round(koopaMPG*10.0)/10.0;
        pipeMPG = Math.round(pipeMPG*10.0)/10.0;
        badwagonMPG = Math.round(badwagonMPG*10.0)/10.0;
        
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println("Royale averaged " + royaleMPG);
        System.out.println("Koopa King averaged " + koopaMPG);
        System.out.println("Pipe Frame averaged " + pipeMPG);
        System.out.println("Badwagon averaged " + badwagonMPG);
        
        System.out.println();
        System.out.println("This program was written by:");
        System.out.println("Kyle Tan on 8/16/24 in 1st period");
    }
}
//Paste console output below:
/*

Mushroom Cup Prix Racer Average Miles/Per Gallon:
Royale averaged 31.8
Koopa King averaged 10.3
Pipe Frame averaged 20.1
Badwagon averaged 14.6

This program was written by:
Kyle Tan on 8/16/24 in 1st period

*/
