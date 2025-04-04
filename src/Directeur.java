import java.util.ArrayList;
import java.util.List;

// Classe Directeur avec une liste d'employés
public class Directeur extends Employe {
    private List<Employe> employesSousGestion;

    public Directeur(String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.employesSousGestion = new ArrayList<>(); // Initialisation de la liste
    }

    // Méthode pour ajouter un employé à la liste
    public void ajouterEmploye(Employe employe) {
        employesSousGestion.add(employe);
    }

    // Afficher la liste des employés sous gestion
    public void afficherEmployes() {
        System.out.println("Le Directeur " + getPrenom() + " " + getNom() + " gère les employés suivants :");
        for (Employe employe : employesSousGestion) {
            System.out.println(" - " + employe);
        }
    }

    @Override
    public void poserConges() {
        System.out.println(
                "Le Directeur " + getPrenom() + " " + getNom() + " âgé de " + getAge() + " ans souhaite prendre des congés"
        );
    }
}