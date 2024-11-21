public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Ajout d'employés
        Employe emp1 = new Employe(1, "Amal", "Jazz", "Informatique", 3);
        Employe emp2 = new Employe(2, "Eya", "Guirat", "Ressources humaines", 2);
        Employe emp3 = new Employe(3, "Ranim", "Ajlani", "Marketing", 1);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);

        // Affichage des employés
        System.out.println("Liste des employés:");
        societe.displayEmploye();

        // Recherche d'un employé
        System.out.println("Recherche de l'employé avec le nom 'Doe': " + societe.rechercherEmploye("Doe"));

        // Tri par ID
        System.out.println("Liste triée par ID:");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri par nom, département et grade
        System.out.println("Liste triée par nom, département et grade:");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        // Suppression d'un employé
        societe.supprimerEmploye(emp2);
        System.out.println("Liste après suppression de l'employé Smith:");
        societe.displayEmploye();
    }
}
