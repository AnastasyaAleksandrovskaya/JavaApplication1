
package ru.kpfu.itis.stasya;

/**
 *
 * @author asus
 */
public class t extends School2 {

    @Override
    void on() {
     System.out.println("The school is open");
    }
    @Override
    void work() {
       System.out.println("The school works");
    }
    @Override
    void off() {
       System.out.println("The school is closed");
    }
}
