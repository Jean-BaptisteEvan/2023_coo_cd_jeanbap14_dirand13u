package donnees;

public class ComparateurArtiste implements ComparateurCd{

    public ComparateurArtiste(){

    };

    public boolean etreAvant(CD cd1, CD cd2) {
        boolean comp = false;
        int res = cd1.getNomArtiste().compareTo(cd2.getNomArtiste());
        if(res <= 0){
            comp = true;
        }
        return comp;
    }
}
