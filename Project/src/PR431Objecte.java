public final class PR431Objecte {
	
    private static PR431Objecte instance;
	private String nom;
	private String cognom;
	private int edat;

    private PR431Objecte(String nom, String cognom, int edat) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public int getEdat() {
        return edat;
    }

    public static PR431Objecte getInstance(String nom, String cognom, int edat) {
        if (instance == null) {
            instance = new PR431Objecte(nom, cognom, edat);
        }
        return instance;
    }
}