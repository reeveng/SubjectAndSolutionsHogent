package main;

import domein.Kind;
import domein.Tafel;
import domein.Vat;
import domein.Zwembad;

public class ZwembadApplicatie
{
    private Vat vat;
    private Kind kind[];

    public static void main(String args[])
    {
        new ZwembadApplicatie().run();
    }

    public void run()
    {
        Tafel tafel = new Tafel(2);
        vat = new Vat(9, tafel);
        kind = new Kind[3];
        for (int i = 0; i < kind.length; i++)
        {
            kind[i] = new Kind(tafel, new Zwembad(4), "Kind " + (i + 1));
        }

	//VUL VERDER AAN
        //--------------
        
        
    }
}
