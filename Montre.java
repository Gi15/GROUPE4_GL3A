public class Montre {
    int heure ;
    int minute;
    Personne personne;

    //constructeur d'une montre avec heure et minute donnee
    public Montre(int heure , int minute){

        if (heure > 23 || minute > 59){
            this.heure = 00;
            this.minute= 00;
        }else {
            this.heure = heure;
            this.minute= minute;
        }
    }

    // montre qui utilise l'heure d'une autre montre
    public Montre(Montre montre){
        this.heure = montre.heure;
        this.minute = montre.minute;
    }

    //Ajouter une minute a l'heure actuelle de la montre
    public void ajouterTemps(){
        if (minute < 59){
            minute = minute + 1;
        }else {
            if (heure < 23){
                heure = heure + 1;
                minute = 0;
            }else {
                heure = 00;
                minute = 00;
            }
        }
    }

    //methode qui affiche lheure
    public String afficheHeure(){
        return heure + " h " + minute + " m";
    }

    //Methode qui cree une montre affichant 9h25
    public void creeAffiche(){
        Montre montre1 = new Montre(9 , 25);
    //Montre qui est le clone de la premiere
        Montre montre2 = new Montre(montre1);
        System.out.println(montre1.heure + " h " + montre1.minute + " m");
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

        public  static void main (String[] args){
        Montre montre = new Montre(00 , 00);
        montre.ajouterTemps();
        System.out.println(montre.heure + " h " + montre.minute + " m");
    }
}
