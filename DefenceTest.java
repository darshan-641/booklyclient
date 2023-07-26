






/*
 *                                                   Defense
 *                                                      | protect();
 *                  --------------------------------------------------------------------------
 *                  |                                       |                               |    
 *              Military Defense                                               Border Security Defense             
 *                  |  uses();                                                              | use();
 *      -----------------------------                                          ---------------------------
 *      |            |              |                                          |                         |
 *     Army         Navy          Airforce                                   Border Patrol            Surveliance 
 *      |deploy();   |               |                                        | patrols();             | checks();
 *     Infantry    Marine Corps    Airmens                            -------------------       -----------------
 *                                                                    |                  |      |                |                                                                                        BorderTroops       Patroling  Drone         Radar
 * 
 * 
 * 
 * 
 * 
 */
public class DefenceTest {
    public static void main(String[] args){
            Infantry infantry = new Infantry();

            infantry.protect();
            infantry.use();
            infantry.deploy();

            System.out.println("======================");

            PatrolVehicle patrolVehicle = new PatrolVehicle();

            patrolVehicle.protect();
            patrolVehicle.use();
            patrolVehicle.patrols();

    }
}

interface Defence{
    void protect();
}


abstract class MilitaryDefense implements Defence{
    abstract void use();
}

abstract class Army extends MilitaryDefense {
    abstract void deploy();
}

abstract class Navy extends MilitaryDefense{
    abstract void deploy();
}

abstract class Airforce extends MilitaryDefense{
    abstract void deploy();
}

abstract class ParaMilitaryForces extends MilitaryDefense{
    abstract void deploy();
}


abstract class BorderSecurityForces implements Defence{
    abstract void use();
}

abstract class BorderPatrol extends BorderSecurityForces{
 abstract void patrols();
}

 class BorderTroops extends BorderPatrol{
    public void protect(){
        System.out.println("Protecting from attack");
    }
    void use(){
        System.out.println("Using Border Troops for Protection");
    }

    void patrols(){
        System.out.println("Patrolling through BorderTroops ");
    }
}

class PatrolVehicle extends BorderPatrol{
    public void protect(){
        System.out.println("Protecting from attack");
    }
    void use(){
        System.out.println("Using Patrol Vehicle for Protection");
    }

    void patrols(){
        System.out.println("Patrolling through Patrolling Vehicle ");
    }
}

abstract class Surveliance extends BorderSecurityForces{
    abstract void checks();
}

 class Drone extends Surveliance{
        public void protect(){
                System.out.println("Protecting from attack with the help of Drone");
        }

        void use(){
            System.out.println("Using Drone for Protection");
        }

        void checks(){
            System.out.println("Checking Areas through Drone");
        }

}

class Radar extends Surveliance{
    public void protect(){
        System.out.println("Protecting from attack with the help of Radar");
}

void use(){
    System.out.println("Using Radar for Protection");
}

void checks(){
    System.out.println("Checking Areas through Radar");
}
}




class Infantry extends ParaMilitaryForces{
    public void protect(){
        System.out.println("Protecting from Attacks");
    }
    void deploy(){
        System.out.println("Deployed Armded Forces for Protection");
    }

    void use(){
        System.out.println("Using Infantry for protect");
    }

}

class MarineCorps extends Navy{
    public void protect(){
        System.out.println("Protecting from Attacks");
    }
    void deploy(){
        System.out.println("Deployed MarineCorps for Protection");
    }

    void use(){
        System.out.println("Using MarineCorps for protect");
    }
}

class Airmen extends Airforce{
    public void protect(){
        System.out.println("Protecting from Attacks");
    }
    void deploy(){
        System.out.println("Deployed Air Forces for Protection");
    }

    void use(){
        System.out.println("Using Airmen for protect");
    }
}


