package ba.unsa.etf.rpr.tutorijal_3;

public class MobilniBroj extends TelefonskiBroj{
    private int mobilnaMreza;
    private String broj;
    MobilniBroj(int mobilnaMreza1, String broj1){
        this.mobilnaMreza=mobilnaMreza1;
        this.broj=broj1;
    }

    @Override
    public String ispisi() {
        return "0" + mobilnaMreza + "/" +broj;
    }
}
