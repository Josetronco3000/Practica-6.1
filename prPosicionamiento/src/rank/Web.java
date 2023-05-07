package rank;

import java.util.Set;

public class Web {
    protected Set<Site> site;
    private Set<Link> links;

    public Web(){

    }

    protected void addSite(Site site){
        this.site.add(site);
    }

    protected void addSiteWithName(String name){
        Site s = new Site(name);
        addSite(s);
    }

    public void addLink(String dataLink){
        int p = dataLink.indexOf("->");
        String a = dataLink.substring(0, p);
        String b = dataLink.substring(p);
        addSiteWithName(a);
        addSiteWithName(b);
    }

    public Site getSite(String name){
        boolean encontrado = false;
        for(Site a: site){
            if(a.getNombre().toLowerCase().equals(name.toLowerCase())){
                encontrado = true;
            }
        }
    }
}
