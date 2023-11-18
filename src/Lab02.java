
public class Lab02 {
    public static void printAirPurifier(AirPurifier a){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Model: " + a.model + "\n" + "Serial number: " + a.serialNum);
        if(!a.isWorking){
            System.out.println("isWorking: " + a.isWorking);
        }else{
            System.out.println("isWorking: " + a.isWorking + "\n" + "Working in " + a.mode + " mode");
        }
        System.out.println("-------------------------------------------------------------");
    }
    public static void main(String[] args) {
        AirPurifier A1 = new AirPurifier("M02", 123456);
        AirPurifier A2 = new AirPurifier("M00", 7891011);
        AirPurifier A3 = new AirPurifier("M00", 12131415);
        AirPurifier A4 = new AirPurifier("M01", 16171819);
        A1.turnOn();
        printAirPurifier(A1);
        A2.turnOn();
        A2.setMode("A plus plus");
        printAirPurifier(A2);
        A3.turnOn();
        printAirPurifier(A3);
        A4.turnOn();
        printAirPurifier(A4);
        A1.setMode("Sleep");
        printAirPurifier(A1);
        A1.turnOff();
        printAirPurifier(A1);
        System.out.println("Most use model is "+ AirPurifier.MostUseModel());
    }
}