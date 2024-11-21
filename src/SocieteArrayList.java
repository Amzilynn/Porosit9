import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {
    private ArrayList<Employe> employes;

    // Constructeur
    public SocieteArrayList() {
        employes = new ArrayList<>();
    }

    // Méthode pour ajouter un employé
    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    // Méthode pour rechercher un employé par son nom
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : employes) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    // Méthode pour rechercher un employé par l'objet employé
    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    // Méthode pour supprimer un employé
    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    // Méthode pour afficher les employés
    @Override
    public void displayEmploye() {
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    // Méthode pour trier les employés par ID
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(Employe::getId));
    }

    // Méthode pour trier les employés par nom, département et grade
    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int nomComp = e1.getNom().compareTo(e2.getNom());
                if (nomComp != 0) return nomComp;
                int deptComp = e1.getDepartement().compareTo(e2.getDepartement());
                if (deptComp != 0) return deptComp;
                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
    }
}
