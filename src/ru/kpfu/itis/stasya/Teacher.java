package ru.kpfu.itis.stasya;

/**
 *
 * @author asus
 */
public class Teacher implements Sound {
    String Name;
    String Patronymic;
    Teacher(){
        Name="Natalia";
        Patronymic="Petrovna";
    }
    @Override
    public void getSound(){
        System.out.println("Put in th diary estimates");
    }
    @Override
    public String getName(){
        return Name;
    }
}
