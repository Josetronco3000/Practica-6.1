package rank;

import java.util.Objects;

public class Link {
    private String origin;
    private String linked;

    public Link(String org, String lnk){
        origin = org;
        linked = lnk;
    }

    public String getOrigin(){
        return origin;
    }

    public String getLinked(){
        return linked;
    }

    @Override
    public boolean equals(Object obj){
        boolean a = false;
        boolean b = false;
        if(obj instanceof Link){
            Link l = (Link) obj;
            a = this.origin.equals(l.origin);
            b = this.linked.equals(l.linked);
        }
        return a&b;
    }

    public int hashCode(){
        return Objects.hash(this);
    }

    @Override
    public String toString(){
        return (origin + "->" + linked);
    }


}
