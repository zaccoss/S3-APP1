package inventaire;

import ingredients.Ingredient;

import java.util.ArrayList;

public class Inventaire {
    private static Inventaire inventaire;
    private ArrayList<Ingredient> lesIngredients = new ArrayList<Ingredient>();

    public Inventaire getInventaire()
    {
        if (inventaire== null)
        {
            inventaire = new Inventaire();
        }
    return inventaire;
    }

    public void ajouter (Ingredient ingredient)
    {
        lesIngredients.add(ingredient);
    }

    public void retirer (Ingredient ingredient)
    {
        lesIngredients.remove(ingredient);
    }

}
