public class TouristTest {
    public static void main(String[] args) {
        TouristGuide tourGuide = new TouristGuide();
        tourGuide.guide();
    }

}

interface Guide{
    Earning guide();
}


class TouristGuide implements Guide{
    public Earning guide(){
            Earning cash = new Cash();
            System.out.println("Guiding Tourist.....");
            return cash;
    }
}
interface Earning{
    Earning earns();
}

class Cash implements Earning{

    private int cashEarned;
   public Cash earns(){
        Cash cash = new Cash();
        System.out.println(
            "Earning some cash"
        );
        return cash;
    }
}

class Respect implements Earning{
    public Earning earns(){
        Respect respect = new Respect();
        System.out.println("Earning Respect with my guiding abilities");
        return respect;
    }
}


interface Places{

}

class TouristPlaces implements Places{
    
}