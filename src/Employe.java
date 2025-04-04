// Classe Employe
public class Employe extends Personne {
    public Employe(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public void poserConges() {
        System.out.println(
                "L'employé " + getPrenom() + " " + getNom() + " âgé de " + getAge()
                        + " ans souhaite prendre des congés");
    }
}