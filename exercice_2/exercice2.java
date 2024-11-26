/**
 *  classe qui gère les notes d'étudiants
 */
public class GestionnaireNotes {
/**
 * @param nomEtudiant qui définit le nom d'un étudiant
 * @param int[]notes qui crée un tableau de notes
 * 
 */

// Affiche note et moyennes
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
    afficheMoyenne(int[] notes);
    afficherNotes(int[] notes);
    }

    // Affichage des notes
    public void afficherNotes(String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + ":");
            for (int note : notes) {
            System.out.println("- " + note);
            }
    }

    // Calcul de la somme des notes
    public int somme ( int[] notes){
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return somme;
    }

    // Affichage de la moyenne
    public void afficheMoyenne(int[] notes) {
        double moyenne = (double) somme(notes)/noteslength; 
        System.out.println("Moyenne : " + moyenne);        
    }

}
