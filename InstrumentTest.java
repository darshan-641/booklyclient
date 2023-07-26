import javax.swing.AbstractAction;

public class InstrumentTest {
	public static void main(String[] args) {
		
	/*	Guitar guitar = new Guitar();
		guitar.use();
		guitar.tuneStrings();
		guitar.play();
		guitar.pluck();
		
		Violin violin = new Violin();
		violin.use();
		violin.tuneStrings();
		violin.play();
		violin.bow();
		*/
		
		// Instrument sbmi = new Violin();


        SurgicalCutter cutter = new SurgicalCutter();
        cutter.use();
        cutter.sterile();
        cutter.operate();

		
//The method pluck() is undefined for the 
		//type StringBasedMusicalInstrument		
		
	}
}

interface Instrument
{
	void use(); //by default method is public and abstract
}


// Medical Instrument
abstract class MedicalInstrument implements Instrument{
    abstract void operate();
}

abstract class SurgicalInstrument extends MedicalInstrument{
    abstract void sterile();
}

abstract class PathologicalInstrument extends MedicalInstrument{
    abstract void reader();
}

class SurgicalCutter extends SurgicalInstrument{
    // public void operate(){

    // }
    public void use(){
        System.out.println("Using Surgical Cutter for operation");
    }
        void operate(){
            System.out.println("Operating Surgical Cutter for operation");
        }

        void sterile(){
            System.out.println("Sterlizing surgical cutter for operation");
        }
       
}

class SurgicalNeedle extends SurgicalInstrument{
    public void use(){
        System.out.println("Using Surgical Needle for operation");
    }
        void operate(){
            System.out.println("Operating Surgical Needle for operation");
        }

        void sterile(){
            System.out.println("Sterlizing surgical Needle for operation");
        }
}


class Glucometer extends PathologicalInstrument{
    public void use(){
        System.out.println("Using Glucometer ");
    }
        void operate(){
            System.out.println("Operating Surgical Needle for operation");
        }

        void reader(){
            System.out.println("Sterlizing surgical Needle for operation");
        }
}

class ECGMachine extends PathologicalInstrument{
    public void use(){
        System.out.println("Using Surgical Needle for operation");
    }
        void operate(){
            System.out.println("Operating Surgical Needle for operation");
        }

        void reader(){
            System.out.println("Sterlizing surgical Needle for operation");
        }
}
// Musical Instrument
abstract class MusicalInstrument implements Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Guitar...");
	}
	void play() {
		System.out.println("Playing Guitar...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Guitar...");

	}
	void pluck() {
		System.out.println("Plucking Strings of Guitar...");
	}
}


class Violin extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Violin...");
	}
	void play() {
		System.out.println("Playing Violin...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Violin...");

	}
	void bow() {
		System.out.println("Bowing Strings of Violin...");
	}
} 
