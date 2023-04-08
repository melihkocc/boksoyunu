package nesneyonelimli.boks;

import javax.swing.text.html.HTMLDocument.RunElement;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name,int damage,int health,int weight,double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter enemy){
        if(enemy.health-this.damage<=0){
            enemy.health = 0;
            return enemy.health;
        }
        else if(enemy.dodge<=dodge()){
            System.out.println(enemy.name+" gelen saldırıyı engelledi! ");
            return enemy.health;
        }

        System.out.println(this.name+" "+enemy.name+"'e "+this.damage+" hasar vurdu!");
        return enemy.health - this.damage;
                
        
    }

    double dodge(){
        double dodge = Math.random()*100;
        return dodge;
    }
    
}

