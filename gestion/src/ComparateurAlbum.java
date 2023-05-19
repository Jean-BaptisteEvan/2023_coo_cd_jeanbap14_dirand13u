import donnees.CD;

public class ComparateurAlbum implements ComparateurCd{

    public ComparateurAlbum(){

    };

    public boolean etreAvant(CD cd1, CD cd2) {
        boolean comp = false;
        int res = cd1.getNomCD().compareTo(cd2.getNomCD());
        if(res >= -1){
            comp = true;
        }
        return comp;
    }
}
