import java.util.*;
class Appu {
    public static void main(String[] args) {
        String actor = "APPU";
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter Actor's Name:");
            actor = sc.next();

            if (actor.equals("APPU")) {
                System.out.println("                                                                                                  ");
                System.out.println("                                        APPUAPPUAPPU                                              ");
                System.out.println("                                 APPUAPPUAPPUAPPUAPPUAPPU                                         ");
                System.out.println("                              APPUAPPUAPPUAPPUAPPUAPPUAPPU				              ");
                System.out.println("                              APPUAPPUAPPUAPPUAPPUAPPUAPPUAP			              ");
                System.out.println("                              APPU**(APPUAPPUAPPUAPPUAPPUAPPU				      ");
                System.out.println("                              &&**,,....,,**/APPUAPPUAPPUAPPU				      ");
                System.out.println("                               **,............,,*APPUAPPUAPPU			              ");
                System.out.println("                              #*,,..       ....,,,/%APPUAPPUU				      ");
                System.out.println("                              /APPU#/*APPU#((#*.,,,/APPUAPPU				      ");
                System.out.println("                             ,,..,,, .*******#%*,,,*%APPU/				              ");
                System.out.println("                             ,,,/*,. ...,     ..,*//%/*(.,%				              ");
                System.out.println("                             /&/*/,...,/(*(*,,,*///##*//(*				              ");
                System.out.println("                             /**(,#/((((/*((#(//////*,..#					      ");
                System.out.println("                              /,*/,,,,..,,,**(((//((&			                      ");
                System.out.println("                               ,*/////***,,/((((##((					      ");
                System.out.println("                            APPU,,......,(((APPU.APPU					      ");
                System.out.println("                  PU.APPU.APPU.APPU####%%%%%%%%#(///@PPU%#					      ");
                System.out.println("           APPU.APPU.APPU.APPU.APPU(##&&&%#(/**///(APPU.APPU.#				      ");
                System.out.println("      APPU.APPU.APPU.APPU.APPU.APPU.APPU%#((/**///%APPU.APPU.APPU(/				      ");
                System.out.println(".APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU#(///////#(APPU.APPU.APPU.APPU			      ");
                System.out.println(".APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU/**///**///APPU.APPU.APPU.APPU.APPU./                     ");
                System.out.println(".APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.......,,%.APPU.APPU.APPU.APPU.APPU.APPU                  ");
                System.out.println(".APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU&......*%&.APPU.APPU.APPU.APPU.APPU.APPU                  ");
                System.out.println(".APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU((....(%%#.APPU.APPU.APPU.APPU.APPU.APPU                  ");
                System.out.println(".APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU                  ");
                break;
            } else if (actor.equals("appu")) {
                System.out.println("Your almost done! but type appu in upper case as shown below ");
				System.out.println("                      "+"       APPU"+"                ");
            }
			else if (actor.equals("Appu")) {
                System.out.println("Not just 1st character, let all the characters be in upper case");
            }
			else if (actor.equals("AppU")) {
                System.out.println("Not just first & last characters, type each & every letter in upper cases");
            }
			else {
                System.out.println("Type APPU to view");
            }
        }
        sc.close();
    }
}
