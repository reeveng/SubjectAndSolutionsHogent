package domein;

import java.io.IOException;

public class FileTransfer {
    //Attributen netwerkverbinding/streams
    //TODO

    public FileTransfer(String host) {
        try {
            //Maak verbinding met server, init attributen
            //TODO

            
        } catch (IOException ex) {
            System.out.println("Probleem " + ex.getMessage());
        }
    }

    public String readFile(String fileNaam) {
        //verzoek server om bestand  'fileNaam' door te sturen
        //lees het bestand in als de server het doorstuurt
        //TODO
        
            
        return "BESTAND NIET GEVONDEN";
    }

    public void updateFile(String fileContents, String fileNaam) {
        //meld de server dat je het gewijzigde bestand gaat doorsturen
        //geef de eventueel gewijzigde bestandsnaam mee door
        //bij onveranderde bestandsnaam zal de server het originele bestand overschrijven
        //stuur het bestand door naar de server
        //TODO
    
    }
    
    public void closeConnection() {
        try {
        //TODO
        
        } catch (IOException ex) {
            System.out.println("Probleem " + ex.getMessage());
        }
    }
    
    //De laatste regel moet eindigen met de systeem einde regel. 
    //Enkel \n of \r is niet goed.
    public String fixEOL(String text) {
        if (!text.endsWith(System.lineSeparator())) {
            int count = 0;
            int lastChar = text.length() - 1;
            if (lastChar >= 0 && (text.charAt(lastChar) == '\n' || 
                    text.charAt(lastChar) == '\r')) {
                count++;
            }
            if (lastChar > 0 && (text.charAt(lastChar - 1) == '\r')) {
                count++;
            }
            if (count > 0) {
                text = text.substring(0, text.length() - count);
            }
            return text + System.lineSeparator();
        }
        return text;
    }
    
}
