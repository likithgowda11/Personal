import java.util.*;
class Appu {
    public static void main(String[] args) {
        String actor = "APPU";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Actor's Name:");
            actor = sc.next();

           try {
               if (actor.equals("APPU")) {
                   System.out.println("                                                                                                                                       ");
                   Thread.sleep(200);
                   System.out.println("                                        APPUAPPUAPPU                                                                                   ");
                   Thread.sleep(200);
                   System.out.println("                                 APPUAPPUAPPUAPPUAPPUAPPU                                                                              ");
                   Thread.sleep(200);
                   System.out.println("                              APPUAPPUAPPUAPPUAPPUAPPUAPPU						                                                       ");
                   Thread.sleep(200);
                   System.out.println("                              APPUAPPUAPPUAPPUAPPUAPPUAPPUAP					                                                       ");
                   Thread.sleep(200);
                   System.out.println("                              APPU**(APPUAPPUAPPUAPPUAPPUAPPU					                                                       ");
                   Thread.sleep(200);
                   System.out.println("                              &&**,,....,,**/APPUAPPUAPPUAPPU					                                                       ");
                   Thread.sleep(200);
                   System.out.println("                               **,............,,*APPUAPPUAPPU					                                                       ");
                   Thread.sleep(200);
                   System.out.println("                              #*,,..       ....,,,/%APPUAPPUU					                                                       ");
                   Thread.sleep(200);
                   System.out.println("                              /APPU#/*APPU#((#*.,,,/APPUAPPU					                                                       ");
                   Thread.sleep(200);
                   System.out.println("                             ,,..,,, .*******#%*,,,*%APPU/						                                                       ");
                   Thread.sleep(200);
                   System.out.println("                             ,,,/*,. ...,     ..,*//%/*(.,%						                                                       ");
                   Thread.sleep(200);
                   System.out.println("                             /&/*/,...,/(*(*,,,*///##*//(*						                                                       ");
                   Thread.sleep(200);
                   System.out.println("                             /**(,#/((((/*((#(//////*,..#						                                                       ");
                   Thread.sleep(200);
                   System.out.println("                              /,*/,,,,..,,,**(((//((&							                                                       ");
                   Thread.sleep(200);
                   System.out.println("                               ,*/////***,,/((((##((							                                                       ");
                   Thread.sleep(200);
                   System.out.println("                            APPU,,......,(((APPU.APPU							                                                       ");
                   Thread.sleep(200);
                   System.out.println("                  PU.APPU.APPU.APPU####%%%%%%%%#(///@PPU%#						                                                       ");
                   Thread.sleep(200);
                   System.out.println("           APPU.APPU.APPU.APPU.APPU(##&&&%#(/**///(APPU.APPU.#					                                                       ");
                   Thread.sleep(200);
                   System.out.println("      APPU.APPU.APPU.APPU.APPU.APPU.APPU%#((/**///%APPU.APPU.APPU(/				                                                       ");
                   Thread.sleep(200);
                   System.out.println(".APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU#(///////#(APPU.APPU.APPU.APPU			                                                       ");
                   Thread.sleep(200);
                   System.out.println(".APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU/**///**///APPU.APPU.APPU.APPU.APPU./                                                          ");
                   Thread.sleep(200);
                   System.out.println(".APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.......,,%.APPU.APPU.APPU.APPU.APPU.APPU                                                       ");
                   Thread.sleep(200);
                   System.out.println(".APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU&......*%&.APPU.APPU.APPU.APPU.APPU.APPU                                                       ");
                   Thread.sleep(200);
                   System.out.println(".APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU((....(%%#.APPU.APPU.APPU.APPU.APPU.APPU                                                       ");
                   Thread.sleep(200);
                   System.out.println(".APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU.APPU                                                       ");
                   break;
               } else if (actor.equals("appu")) {
                   System.out.println("Your almost done! but type appu in upper case as shown below ");
                   System.out.println("                      " + "       APPU" + "                ");
               } else if (actor.equals("Appu")) {
                   System.out.println("Not just 1st character, let all the characters be in upper case");
               } else if (actor.equals("AppU")) {
                   System.out.println("Not just first & last characters, type each & every letter in upper cases");
               } else {
                   System.out.println("Type APPU to view");
               }
           }
           catch(Exception e){

           }
        }
        sc.close();
    }
}
