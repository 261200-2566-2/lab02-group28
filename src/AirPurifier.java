/*
field
  instance var
	boolean isWorking; //บอกว่าเครื่องทำงานหรือไม่ โดยมีค่าเริ่มต้นเป็น false กล่าวคือ ไม่ได้เปิดเครื่องไว้
	String model; // M00 (default) , M01 , M02 ใช้บอกรุ่นโดยในที่นี้มี 3 รุ่น
	int serialNum; //บอกเลขประจำเครื่อง
	String mode; // บอกว่ากำลังทำงานในโหมดอะไร
  class var
	static int[] Model; //เป็น array ที่เก็บจำนวนของแต่ละโมเดลไว้มาเปรียบเทียบว่า model ไหนใช้มากที่สุด
methods
  instance methods
	turnOn(); //ใช้สำหรับเปิดใช้อุปกรณ์ โดยกำหนดค่า isWorking เป็น true
	turnOff(); //ปิดใช้งานอุปกรณ์ โดยกำหนดค่า isWorking เป็น false
	setMode(String ); //ตั้งค่าว่าอยากได้โหมดไหนแล้วแต่คนใส่ input เป็น String
  class methods
	MostUseModel(); //หารุ่นที่นิยมใช้ที่สุดและ return ชื่อรุ่นนั้นๆออกมา
*/

public class AirPurifier {
    boolean isWorking = false;
    String model = "M00";
    int serialNum;
    String mode = "Normal";
    void turnOn(){
        isWorking = true;
    }
    void turnOff(){
        isWorking = false;
    }
    void setMode(String mode){
        this.mode = mode;
        System.out.println(this.model + " " + this.serialNum + " change to " + mode + " mode");
    }
    static int[] Model = {0,0,0};
    static String MostUseModel(){
        int max = Model[0];
        String MaxUse = "M00";
        for(int i = 0; i < 3; i++){
            if(Model[i] > max){
                max = Model[i];
                switch (i){
                    case 1: MaxUse = "M01";
                        break;
                    case 2: MaxUse = "M02";
                        break;
                }
            }
        }
        return MaxUse;
    }
    AirPurifier(String model, int serialNum){
        this.model = model;
        this.serialNum = serialNum;
        if(model.toUpperCase().equals("M00")){
            Model[0]++;
        }else if(model.toUpperCase().equals("M01")){
            Model[1]++;
        }else if(model.toUpperCase().equals("M02")){
            Model[2]++;
        }else{
            Model[0]++;
        }
    }
}
