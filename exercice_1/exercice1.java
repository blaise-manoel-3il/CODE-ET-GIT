/***
classe calculant la facture menager
*/
public class FactureManager {

/**
 * @param typeproduit le type du produit ( alimentaire, electronique, luxe)
 * @param quantite la quantité du produit 
 * @param prix le montant total de la facture 
 * 
 */

 // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire){
        double total = calcultotat(quantite,prixUnitaire);
        total=Reductcat ( typeProduit);
        return double prix = reducsup (total);

    }

    // Calcul le total
    public double calcultotat ( int quantite, double prixUnitaire){
        double total = quantite * prixUnitaire;
    }
    // reduction selon la catégorie
    public double reductcat ( String typeProduit){
        double total = calcultotat(quantite,prixUnitaire);
        switch (typeProduit) {
                    case "Alimentaire":
                    total -= total * 0.05; // Réduction de 5%
                        break;
                    case "Electronique":
                        total -= total * 0.1; // Réduction de 10%
                        break;
                    case "Luxe":
                    total -= total * 0.15; // Réduction de 15%
                        break;
                    default:
                    System.out.println("type inconnue " );
                break;
         }
    }
    
    // Reduction sur le total
    public double reducsup ( double total){
        if (total > 1000) {
        total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }
    }
    

}
