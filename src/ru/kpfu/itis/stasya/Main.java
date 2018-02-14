package ru.kpfu.itis.stasya;

/**
 *
 * @author asus
 */

public class Main {

public static void main(String[] args) {        
Point a = new Point(3, 1);
Point b = new Point(2, 9);
Point c = new Point(6, 4);
Point d = new Point(5,8);
Point e = new Point(0,2);
Point f = new Point(5,6);
ArrayOfPoints q = new ArrayOfPoints();
q.add(a);
q.add(b);
q.add(c);
q.add(d);
q.add(e);
int k=1;
int x = q.getArraySize();
while(k>0){
    k++;
    for (int i = 0; i< x ; i++ ){
    System.out.println( q.get(i));
    }
}
}
}