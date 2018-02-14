
package ru.kpfu.itis.stasya;

/**
 *
 * @author asus
 */
public class Learnen implements Sound,Parents{
    String Name;
    String lastName;
    float score;
    String NameParents;
    Learnen(){
        Name="Ivan";
        lastName="Ivanov";
        score=3.8f;
        NameParents="Nina";
    }
    @Override
    public void getSound(){
        System.out.println("I did not do my homework");
    }
    @Override
    public String getName(){
        return Name;
    }

    @Override
    public String getNameParents() {
        return NameParents;
    }
    @Override
    public void parents() {
        if (score < 4) {
            System.out.println("Learn better");
        }
    }
    public void food(int times){
        System.out.println("I eat "+ times+" times");
    }
}
