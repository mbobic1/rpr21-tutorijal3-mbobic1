package ba.unsa.etf.rpr.tutorijal_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik=new HashMap<>();
    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime,broj);
    }
    public String dajBroj(String ime){
        return imenik.get(ime).ispisi();
    }
   /* public dajIme(TelefonskiBroj broj){

    }*/
    public String naSlovo(char s){
        int i=1;
        String pomocni="";
        for(String ime : imenik.keySet()){
            if(ime.charAt(0)==s){
                pomocni=pomocni + i + ". ";
                pomocni=pomocni + ime;
                pomocni= pomocni + " - ";
                pomocni= pomocni+ imenik.get(ime).ispisi() + "\n";
                i++;
            }
        }
        return pomocni;

    }
    public Set<String> izGrada(FiksniBroj.Grad g){
        Set<String> imena=new HashSet<>();
        for(String ime: imenik.keySet()){
            if(imenik.get(ime) instanceof FiksniBroj){
                FiksniBroj pomocni=(FiksniBroj) (imenik.get(ime));
                if(pomocni.getGrad().equals(g)) {
                    imena.add(ime);
                }
            }
        }
        return imena;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        Set<TelefonskiBroj> brojevi=new TreeSet<>();
        for(String ime: imenik.keySet()){
            if(imenik.get(ime) instanceof FiksniBroj){
                FiksniBroj pomocni=(FiksniBroj) (imenik.get(ime));
                if(pomocni.getGrad().equals(g)){
                    brojevi.add(pomocni);
                }
            }
        }
        return brojevi;
    }

}
