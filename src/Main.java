// Classe Main pour tester l'ajout d'employés à un Directeur
public class Main {
    public static void main(String[] args) {
        // Création d'employés
        Employe employe1 = new Employe("Bah", "Abdoul", 30);
        Employe employe2 = new Employe("Camara", "Aissata", 28);

        // Création d'un directeur
        Directeur directeur = new Directeur("Diallo", "Ibrahim", 40);

        // Ajout des employés au directeur
        directeur.ajouterEmploye(employe1);
        directeur.ajouterEmploye(employe2);

        // Affichage des employés sous gestion du directeur
        directeur.afficherEmployes();

        // Affichage des informations et test de la méthode poserConges()
        System.out.println(directeur);
        directeur.poserConges();
    }
}
