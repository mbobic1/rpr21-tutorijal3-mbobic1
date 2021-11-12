package ba.unsa.etf.rpr.tutorijal_3;



public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;
    MedunarodniBroj(String drzava1, String broj1){
        this.drzava=drzava1;
        this.broj=broj1;
    }
    @Override
    public String ispisi(){
        return " " + drzava +" "+ broj;
    }

}
