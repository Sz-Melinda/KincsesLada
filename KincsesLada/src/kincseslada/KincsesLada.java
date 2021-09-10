
package kincseslada;

public class KincsesLada {

    public static void main(String[] args) {
        
        System.out.println("Kincses Ládák: ");
        
        
        lada ladaA = new lada();
        ladaA.setString("Arany", " : Én rejtem a kincset!");
        System.out.println(ladaA.getString());

        lada ladaE = new lada();
        ladaE.setString("Ezüst", " : Nem én rejtem a kincset.");
        System.out.println(ladaE.getString());
        
        lada ladaB = new lada();
        ladaB.setString("Bronz", " : Az arany hazudik!!");
        System.out.println(ladaB.getString());
        
        
        ladaA.setErtek("Üres...");
        ladaA.setErtek("Üres...");
        ladaA.setErtek("Itt a kincs!");
        
    }   
}
