class SuperBase{
    public static void add(int a, int b){

        System.out.println("inside SuperBase");
    }


}
class DerivedBase extends SuperBase{
    public static void add(int a , int b){
        System.out.println("Inside derived base");
    }
}

public class Overriding extends SuperBase {
    public static void add(int a,int b){
        System.out.println("inside Only base");

    }
    public static void main(String[] args){

        SuperBase a1= new SuperBase();
        SuperBase a2 = new Overriding();
        SuperBase a3 = new DerivedBase();
        a1.add(20,20);
        a2.add(20,23);
        a3.add(21,24);

        Overriding a5 = new Overriding();
        DerivedBase a7 = new DerivedBase();
        a5.add(1,2);
        a7.add(3,4);
    }
}
/*
    
*/