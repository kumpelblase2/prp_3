package prp_aufgabe4;

public interface StowageLocation extends AdminValue {

    public int bay();

    public int row();

    public int tier();

    public boolean isNull();
}
