package ba.unsa.etf.rpr.tutorijal_3;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj {
    public  enum Grad{
        SARAJEVO("033"),BIHAC("037"),ZENICA("032");
        public final String label;
        Grad(String label){
            this.label=label;
        }
        public String getLabel(){
            return label;
        }
    }
    private String broj;
    private Grad grad;
    FiksniBroj(Grad grad1, String broj){
        this.grad=grad1;
        this.broj=broj;
    }
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof FiksniBroj)) return false;
        FiksniBroj that=(FiksniBroj) o;
        return broj.equals(that.broj);
    }
    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), broj, getGrad());
    }
    public Grad getGrad(){
        return grad;
    }
    @Override
    public String ispisi() {
        return grad.getLabel() + "/" + broj;
    }
}
