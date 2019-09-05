package domein;

import java.util.Objects;

public class Product 
{

    private String naam;
    private String categorie;
    private double prijs;
    private int aantalStock;

    public Product(String naam, String categorie, double prijs, int aantal)
    {
        setNaam(naam);
        setCategorie(categorie);
        setPrijs(prijs);
        setAantalStock(aantal);
    }

    protected Product()
    {
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.naam);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Product other = (Product) obj;
        return Objects.equals(this.naam, other.naam);
    }

    public String getNaam()
    {
        return naam;
    }

    public String getCategorie()
    {
        return categorie;
    }

    public double getPrijs()
    {
        return prijs;
    }

    private void setNaam(String naam)
    {
        this.naam = naam;
    }

    private void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    

    private void setPrijs(double prijs)
    {
        this.prijs = prijs;
    }

    public int getAantalStock()
    {
        return aantalStock;
    }

    private void setAantalStock(int aantal)
    {
        this.aantalStock = aantal;
    }

    @Override
    public String toString()
    {
        return "Product{" + "naam=" + naam + ", categorie=" + categorie + ", prijs=" + prijs + ", aantalStock=" + aantalStock + '}';
    }

}
