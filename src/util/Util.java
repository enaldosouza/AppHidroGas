
package util;
 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * @author enaldo.souza <enaldo@unitri.edu.br>
 */
public class Util {

    public Util(){
    
    }
    
    public String transformaData(String minhaData) {

        // Data recebida: 29/10/2016
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(minhaData, formato);
        String [] dataSplit = (formato.format(data)).split("/");
        String dia = ""; String mes = ""; String ano = "";

        for(int i=0; i<=3; i++){
            dia = dataSplit[0];
            mes = dataSplit[1];
            ano = dataSplit[2];
        }
        
        String dataFinal = ano+mes+dia;
        return dataFinal;
    }
    
    public boolean validaEmail(String email){
        
        Matcher matcher = Pattern.compile("[\\w]+@[\\w]+\\.[\\w]+[\\.]*[\\w]*"
                ,Pattern.CASE_INSENSITIVE).matcher(email);
        while (matcher.find()) {
            return true;
                //System.out.println(matcher.start() + " - " + matcher.group());
        }
    return false;
    }
}

//para transformar um vetor de char em uma String faça assim
//String r = new String(vetDeChar);

