
class AlarmTest {
   public static void main(String[] args) {
            MobileAlarm mobileAlarm = new MobileAlarm("7:00 am");
            MobileAlarm.showNumberOfAlarm();
            MobileAlarm.showNumberOfTimeSnoozed();

            mobileAlarm.display();
            mobileAlarm.started();
            mobileAlarm.snoozed();
            mobileAlarm.started();
            mobileAlarm.snoozed();
            mobileAlarm.started();
            mobileAlarm.stop();

            MobileAlarm.showNumberOfAlarm();
            MobileAlarm.showNumberOfTimeSnoozed();
   } 
}

class Alarm{
    private static int numberOfAlarmsSet=0;
    private static int numberOfTimesSnoozed = 0;
    private String time;
    private final int ringTime = 60;
    private final int snoozeTime = 300;

    Alarm(String time){
        numberOfAlarmsSet++;
        this.time = time;
        System.out.println("Alarm initiated for time : "+ this.time);
    }

    static void showNumberOfAlarm(){
        System.out.println(numberOfAlarmsSet+" alarms are set till now");
    }
    static void showNumberOfTimeSnoozed(){
        System.out.println(numberOfTimesSnoozed+" times Alarm snoozed");
    }

    final void started(){
        System.out.println("Alarm started ringing");
    }

    final void snoozed(){
        System.out.println("Alarm snoozed...");
        numberOfTimesSnoozed++;
    }

    final void stop(){
        System.out.println(this.time+" Alarm stopped by user");
    }
}

final class MobileAlarm extends Alarm
{
    MobileAlarm(String time){
        super(time);
    }

    void display(){
        System.out.println("Displaying Alarm features through Mobile Screen");
    }
}
