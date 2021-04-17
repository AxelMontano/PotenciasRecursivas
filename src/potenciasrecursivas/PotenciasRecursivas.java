package potenciasrecursivas;
import javax.swing.JOptionPane;

public class PotenciasRecursivas {

    public static void main(String[] args) {
    }
    
    int rs = 1, i = 0;
    String CadenaDeCarmen;
    
    public int potenciar(int r, int ex){
        i = i+1;
        if(ex!=0){
          rs = rs*r;
          return potenciar(r, ex-1);
        }
        else{
         CadenaDeCarmen += "\n"+r+"^"+((ex+i)-1)+" = "+rs;
        }
        return r;
    }    
}
