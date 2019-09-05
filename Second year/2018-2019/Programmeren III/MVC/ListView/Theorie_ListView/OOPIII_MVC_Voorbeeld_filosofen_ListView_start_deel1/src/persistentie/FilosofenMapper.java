package persistentie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilosofenMapper 
{
	private static String[] filosofen = {"Socrates","Plato","Aristotle",
		"St. Thomas Aquinas", "Soren Kierkegaard", "Immanuel Kant",
		"Friedrich Nietzsche"};
	
	public List<String> geefFilosofen()
	{
		return new ArrayList<>(Arrays.asList(filosofen));
	}
}
