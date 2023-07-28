public class TouristTest {
    public static void main(String[] args) {
        TouristGuide tourGuide = new TouristGuide();
    }

}

interface Guide{
    Earning guide();
}


class TouristGuide implements Guide{
    public Earning guide(){
            Earning cash = new Cash();
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
        return cash;
    }
}

class Respect implements Earning{
    public Earning earns(){
        Respect respect = new Respect();
        return respect;
    }
}
