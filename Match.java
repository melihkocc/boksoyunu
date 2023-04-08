package nesneyonelimli.boks;

import org.w3c.dom.html.HTMLAreaElement;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    void secim(){
        double sayi = Math.random()*2;
        if(sayi<=1){
            f1.health = f2.hit(f1);
        }
        else{
            f2.health = f1.hit(f2);
        }
    }


    void MatchStart(){
        if((this.f1.health>=minWeight && this.f1.health<=maxWeight) && (this.f2.health>=minWeight && this.f2.health<=maxWeight)){
            secim();
            while(f1.health>0 && f2.health>0){

                f2.health = f1.hit(f2);
                if(kazandimi()){
                    break;
                }
                f1.health = f2.hit(f1);
                if(kazandimi()){
                    break;
                }
                
                System.out.println(" ");
                System.out.println(f1.name+" Health: "+f1.health);
                System.out.println(f2.name+" Health: "+f2.health);
                System.out.println("------------------------------");


            }

        }
        else{
            System.out.println("Sikletler Uyuşmuyor Maç İptal Edildi!!!");
        }
    }

    boolean kazandimi(){
        if(f1.health<=0){
            System.out.println("Ahnet Hakan'e 15 hasar vurdu!");
            System.out.println("");
            System.out.println(f1.name+" Health: "+f1.health);
            System.out.println(f2.name+" Health: "+f2.health);
            System.out.println(f2.name+" Kazandı!!!");
            return true;
        }
        else if(f2.health<=0){
            System.out.println("Hakan Ahmet'e 20 hasar vurdu!");
            System.out.println(" ");
            System.out.println(f1.name+" Health: "+f1.health);
            System.out.println(f2.name+" Health: "+f2.health);
            System.out.println(f1.name+" Kazandı!!!");
            return true;
        }
        else if(f1.health<=0 && f2.health<=0){
            System.out.println(" ");
            System.out.println(f1.name+" Health: "+f1.health);
            System.out.println(f2.name+" Health: "+f2.health);
            System.out.println("Maç berabere!!!");
            return true;
        }
        return false;
    }

}