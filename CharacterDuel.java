package rpg;
public class CharacterDuel {
    public static HeavyClass c2 = new HeavyClass("Heavy Joe",5,5,7);
    public static WizardClass c3 = new WizardClass("Wizard Bob",7,5,10,10);
    public static Dice die = new Dice();
    
    public static void run(){
  
       int counter = 1;
       
       while(c2.getCurrentLife() > 0 && c3.getCurrentLife() > 0) {
           
           
           System.out.println("");
           System.out.println("======== Round "+counter+" fight! ==========");
           
           //C2 is Joe
           //C3 is Bob
           System.out.println(c2.getName()+" Health: "+c2.getCurrentLife()+"/"+c2.getMaxLife());
           System.out.println(c3.getName()+" Health: "+c3.getCurrentLife()+"/"+c3.getMaxLife()+" Mana: "+c3.getCurrentMagic()+"/"+c3.getMaxMagic());
           
           int turn = die.roll();
           
           if(turn < 3){
               character2_attack();
               character1_attack();
           }else{
               character1_attack();
               character2_attack();
           }
           counter++;
        }
        //IF LIFE == NEGATIVE THEN LIFE = 0
        int life1 = c2.getCurrentLife();
        int life2 = c3.getCurrentLife();   
        if(life1 < 0){
            life1 = 0;
        }     
        if(life2 < 0){
            life2 = 0;
        }
        
           System.out.println();
           System.out.println("Final Result : ");
           System.out.println("-------------------------");
           System.out.println(c2.getName()+ " HP : " + life1);
           System.out.println(c3.getName()+ " HP : " + life2);
           
           

           System.out.println("");
           if(life1 <= 0 && life2 > 0 || life2 > life1){
               System.out.println(c3.getName() + " Wins!");
          
           }
           
           else if(life2 <= 0 && life1 > 0 || life1 > life2){
               System.out.println(c2.getName() + " Wins!");
         
               
           }
           
           else if(life1 <= 0 && life2 <= 0){
               System.out.println("Draw!");
          
           }
           
           
           
       }
    // Wizzard Bob attacks he is C3
    public static void character2_attack(){
        int attack2 = c3.attack();
        int a1 = die.roll();
           switch(a1){
               case 1:
                   if(c3.getCurrentLife() <= 0){
                       //do nothing
                   }else{
                        c2.wound(attack2);
                        System.out.println(c3.getName()+ " attack " + c2.getName() + " for " + attack2);
                   }
                   break;
               case 2:
                    if(c3.getCurrentLife() == c3.getMaxLife()){
                        System.out.println(c3.getName() + " is already at full health and cannot be healed!");
                    }else if(c3.getCurrentLife() <= 0){
                         //Do nothing
                    }else{
                        int heal = c3.castHeal();
                        c3.heal(heal);  
                    }
                   
                   break;
               case 3:
                   if(c3.getCurrentLife() <= 0){
                       //do nothing
                   }else{
                        int damage = c3.castLightningBolt();
                        c2.wound(damage);
                        if(c3.getCurrentMagic()<5){
                            //Do nothing
                        }else{
                            System.out.println(c3.getName()+ " casts lightning bolt and damages "+ c2.getName() +" for "+damage);
                        }  
                   }
                   break;
               case 4:
                   if(c3.getCurrentLife() <= 0){
                       //do nothing
                   }else{
                        c2.wound(attack2);
                        System.out.println(c3.getName()+ " attack " + c2.getName() + " for " + attack2);
                   }
                   break;
               case 5: 
                   if(c3.getCurrentLife() == c3.getMaxLife()){
                        System.out.println(c3.getName() + " is already at full health and cannot be healed!");
                    }else if(c3.getCurrentLife() <= 0){
                         //Do nothing
                    }else{
                        int heal = c3.castHeal();
                        c3.heal(heal);
                    }
                   break;
               case 6:
                   if(c3.getCurrentLife() <= 0){
                       //do nothing
                   }else{
                        int damage = c3.castLightningBolt();
                        c2.wound(damage);
                        if(c3.getCurrentMagic()<5){
                            //Do nothing
                        }else{
                            System.out.println(c3.getName()+ " casts lightning bolt and damages "+ c2.getName() +" for "+damage);
                        }  
                   }
                   break;
               default:
                   System.out.println(c3.getName() + " did nothing.");
                   break;
           }
    }
    
    
    // This is Joe he is C2
    public static void character1_attack(){
        int attack1 = c2.attack();
        int brutalStrikes = c2.brutalStrikes();
        int demolish = c2.demolish();
        
           int a2 = die.roll();
           switch(a2){
               case 1:
                   //Brutal Strikes
                   if(c2.getCurrentLife() <= 0){
                       //do nothing
                   }else{
                        c3.wound(brutalStrikes);
                        System.out.println(c2.getName()+ " attacks with Brutal Strikes and damages " + c3.getName() + " for " + brutalStrikes);
                   }
                   break;
               case 2:
                   //Heal
                   if(c2.getCurrentLife() >= c2.getMaxLife()){
                       System.out.println(c2.getName() + " is already at full health and cannot be healed!");
                   }else if( c2.getCurrentLife() <=0){
                        //Do nothing
                   }else{
                       int heal = die.roll();
                        c2.heal(heal);
                        System.out.println(c2.getName()+ " healed for "+ heal);
                   }
                   break;
               case 3:
                   //Demolish
                   if(c2.getCurrentLife() <= 0){
                       //do nothing
                   }else{
                        c3.wound(demolish);
                        System.out.println(c2.getName()+ " demolishes " + c3.getName() + " for " + demolish);
                   }
                   break;
               case 4:
                   //Attack
                   if(c2.getCurrentLife() <= 0){
                       //do nothing
                   }else{
                        c3.wound(attack1);
                        System.out.println(c2.getName()+ " attack " + c3.getName() + " for " + attack1);
                   }
                   break;
               case 5: 
                   //Heal
                   if(c2.getCurrentLife() >= c2.getMaxLife()){
                       System.out.println(c2.getName() + " is already at full health and cannot be healed!");
                   }else if( c2.getCurrentLife() <=0){
                        //Do nothing
                   }else{
                       int heal = die.roll();
                        c2.heal(heal);
                        System.out.println(c2.getName()+ " healed for "+ heal);
                   }
                   break;
               case 6:
                   //Attack
                   if(c2.getCurrentLife() <= 0){
                       //do nothing
                   }else{
                        c3.wound(attack1);
                        System.out.println(c2.getName()+ " attack " + c3.getName() + " for " + attack1);
                   }
                   break;
               default:
                   System.out.println(c2.getName() + " did nothing.");
                   break;
           }
        
    }
    
}


