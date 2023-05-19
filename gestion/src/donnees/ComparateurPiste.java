package donnees;

public class ComparateurPiste implements ComparateurCd{
    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        if (cd1.getPistes() ==  cd2.getPistes())
            return cd1.getNomArtiste().compareTo(cd2.getNomArtiste())<0;

        return (cd1.getPistes() > cd2.getPistes());
    }
}
