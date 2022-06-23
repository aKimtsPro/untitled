package poo.io;

public class Personne {

    private long id;
    private String nom;
    private String prenom;
    private String email;
    private String profession;

    public Personne() {
    }

    public Personne(long id, String nom, String prenom, String email, String profession) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.profession = profession;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public static Personne createFromCSVLine(String line) {
        Personne p = new Personne();

        String[] values = line.split(",");

        p.setId( Long.parseLong(values[0]) );
        p.setPrenom( values[1] );
        p.setNom( values[2] );
        p.setEmail( values[3] );
        p.setProfession( values[4] );

        return p;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
