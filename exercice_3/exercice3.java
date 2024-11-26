/**
 *  classe qui gère les notes d'étudiants
 */
public class GestionnaireNotes {
/**
 * @param typeOperation qui définit le type d'opération si c'est ajoit ou retrait
 * @param quantite qui definit la quantite du produit
 * @param stock donne la quantite de stock 
 */

public class StockManager {

  public void gererStock(String produit, int quantite, int stock) {
        if (stock > quantite){
            stock = operation ()
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
  }

  public void operation ( String typeOperation, String produit, int quantite, int stock) {
    switch (typeOperation) {
            case "ajout":
               stock += quantite;
            System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
                break;
            case "retrait":
                if (stock >= quantite) {
                stock -= quantite;
                System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
                break;
            default:
                 System.out.println("Opération inconnue.");
                break;
        }
  }

}
