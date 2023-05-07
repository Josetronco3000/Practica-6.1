package rank;

import java.util.Objects;

public class Site {
    private String nombre;
    private double rank;

    public Site(String nombre){
        this.nombre = nombre;
        rank = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public double getRank(){
        return rank;
    }

    public void addRank(double r){
        rank += r;
    }

    public boolean equals(Site sitio){
        boolean b = false;
        if(sitio instanceof Site){String a = this.nombre.toLowerCase();
            Site s = (Site) sitio;
            b = this.nombre.equalsIgnoreCase(s.nombre);
        }
        return b;
    }

    private String buscarMenor(String a, String b){
        if(a.length() >= b.length()){
            return a;
        }else{
            return b;
        }
    }

    public int compareTo(Site sitio){
        String a = this.nombre.toLowerCase();
        String b = sitio.nombre.toLowerCase();
        int c = a.compareTo(b);
        return c;
    }

    public int hashCode(){
        return Objects.hashCode(nombre.toLowerCase());
    }

    @Override
    public String toString(){
        return (getNombre() + "(" + getRank() + ")");
    }
}
