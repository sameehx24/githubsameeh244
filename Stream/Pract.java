package Stream;


class Bike{
    int regNum;
    String colour;
    private static int count=1000;
    Bike(String colour){
        regNum=count;
        count++;
        this.colour=colour;
    }
    public static void main(String[] args) {
        Bike b1=new Bike("White");
        System.out.println(b1.regNum);
        System.out.println(b1.colour);


        Bike b2=new Bike("Black");
        System.out.println(b2.regNum);
        System.out.println(b2.colour);
    }

}