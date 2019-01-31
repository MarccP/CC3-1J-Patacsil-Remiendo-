package rpg;


public class TestCharacter {
    
    public static void run(){
       Character c2 = new Character("Joe",5,7,7);
       Character c3 = new Character("Bob",5,7,7);
       Dice die = new Dice();
       
       int counter = 1;
       while(c2.getCurrentLife() > 1 || c3.getCurrentLife() > 1) {
           System.out.println("");
           System.out.println("Round "+counter+" :");
           
        
           System.out.println(c2.getName()+" : "+c2.getCurrentLife());
           System.out.println(c3.getName()+" : "+c3.getCurrentLife());
           
           int attack1 = c2.attack();
           int attack2 = c3.attack();
           
           
           
           
           
           if(die.roll()>3){
           c3.wound(attack1);
           c2.wound(attack2);
           System.out.println(c2.getName()+" attacks "+c3.getName()+" for "+attack1);
           System.out.println(c3.getName()+" attacks "+c2.getName()+" for "+attack2);
           }else{
           c2.wound(attack2);
           c3.wound(attack1);
           System.out.println(c3.getName()+" attacks "+c2.getName()+" for "+attack2);
           System.out.println(c2.getName()+" attacks "+c3.getName()+" for "+attack1);
           }
           
           if(c2.getCurrentLife() <= 0 || c3.getCurrentLife() <= 0){
               break;
           }
           
           
           counter++;
           
           
       }
       int life = 0;
       boolean draw = false;
        System.out.println("");
       if(c2.getCurrentLife() <= 0 && c3.getCurrentLife() > 0){
        System.out.println(c2.getName()+" : "+life);
        System.out.println(c3.getName()+" : "+c3.getCurrentLife());
        
       }else if(c3.getCurrentLife() <= 0 && c2.getCurrentLife() > 0){
        System.out.println(c3.getName()+" : "+life);
        System.out.println(c2.getName()+" : "+c2.getCurrentLife());
        
       }else if(c2.getCurrentLife() <= 0 && c3.getCurrentLife() <= 0){
           System.out.println(c2.getName()+" : "+life);
           System.out.println(c3.getName()+" : "+life);
           draw = true;
           
       }
       
       if(c2.getCurrentLife() <= 0 && c3.getCurrentLife() > 0){
           System.out.println(c3.getName()+" wins!");
           
       }else if(c3.getCurrentLife() <= 0 && c2.getCurrentLife() > 0){
           System.out.println(c2.getName()+" wins!");
           
       }else if(draw == true){
        System.out.println("Draw!");
       }
       
       
    }
    
}
