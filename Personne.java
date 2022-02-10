public class Personne {
    String nom;
    Montre montre;

    public Personne() {
    }

    public Personne(String nom, Montre montre) {
        this.nom = nom;
        this.montre = montre;
    }

    //Methode pour faire porter une montre
    public  void fairePorterMontre(Montre montre){
        if (this.montre == null){
            this.montre = montre;
        }else {
            System.out.println("elle a deja une montre");
        }
    }

    //Methode Pour enlever une montre
    public void enleverMontre(){
        if (this.montre != null)
            this.montre = null ;
    }

    // Fonction qui donne l'heure
    public String donnerHeure(){
        if (montre != null)
            return montre.heure + " h " + montre.minute + " m";
        else
            return null;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Montre getMontre() {
        return montre;
    }

    public void setMontre(Montre montre) {
        this.montre = montre;
    }
}
