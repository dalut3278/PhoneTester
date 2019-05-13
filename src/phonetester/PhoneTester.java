/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phonetester;

/**
 *
 * @author dalut3278
 */
public class PhoneTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CellPhone p1 = new CellPhone();
    p1.carrier = "Rogers";
    p1.type = "IPhone";
    p1.speed = 1.2;
    p1.memory = 64.0;
    p1.numApps = 10;

    System.out.println("Carrier = " + p1.carrier);
    System.out.println("Type of phone = " + p1.type);
    System.out.println("Speed of phone = " + p1.speed+"Ghz");
    System.out.println("Memory = "+p1.memory+"Gb");
    System.out.println("Number of Apps = "+p1.numApps);
  }
}

    

