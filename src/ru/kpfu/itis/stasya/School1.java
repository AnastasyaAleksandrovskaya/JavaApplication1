
package ru.kpfu.itis.stasya;

/**
 *
 * @author asus
 */
public class School1{
    public int Number;
    public String Director;
    public School1(int Number, String Director){
        this.Number=Number;
        this.Director=Director;
    }
    public int getNumber(){
        return Number;
    }
    public String getDirector(){
        String result="School principal name "+Director;
        return result;
    }
    public void work(int hours){
        System.out.println("I'm going to work for "+ hours+" hours");
    }
    public static void main(String [] args){
        School1 sch1=new School1(131, "Habibullina");
        String result=sch1.getDirector();
        System.out.println(result);
        sch1.work(11);
        t T=new t();
        T.on();
        T.work();
        T.off();
    }
}