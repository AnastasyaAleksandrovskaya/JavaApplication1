package ru.kpfu.itis.stasya;

/**
 *
 * @author asus
 */
public class SchoolSound {

public static void main(String[] args) {
    Sound[] School = new Sound[2];
    School[0] = new Learnen();
    School[1] = new Teacher();
    for (int i = 0; i < 2; i++) {
        System.out.print(School[i].getName() + ":");
        School[i].getSound();
    }
    Parents[] School1 = new Parents[1];
    School1[0] = new Learnen();
    for (int i = 0; i < 1; i++) {
        System.out.print(School1[i].getNameParents() + ":");
        School1[i].parents();
    }
    Learnen lern = new Learnen();
    lern.food(5);
}
}
