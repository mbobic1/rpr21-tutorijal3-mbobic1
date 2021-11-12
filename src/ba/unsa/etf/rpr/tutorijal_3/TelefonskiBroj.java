package ba.unsa.etf.rpr.tutorijal_3;

public abstract  class TelefonskiBroj implements Comparable {
    public abstract  String ispisi();
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        TelefonskiBroj pomocni=(TelefonskiBroj) o;
        return this.ispisi().compareTo(pomocni.ispisi());
    }
}
