
package kincseslada;

public class lada {
    
    private String ladaTipus; 
    private String szoveg;
    private String ertek;
    
    
    public String getString() {
        
        return ladaTipus + szoveg;
    }

    public void setString(String ladaTipus, String szoveg) {
        
        this.ladaTipus = ladaTipus;
        this.szoveg = szoveg;
    }

    public void setErtek(String ertek) {
        
        this.ertek = ertek;
    }
}