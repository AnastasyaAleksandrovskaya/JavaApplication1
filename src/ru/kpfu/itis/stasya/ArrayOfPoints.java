package ru.kpfu.itis.stasya;

/**
 *
 * @author asus
 */
public class ArrayOfPoints {

    private int arraySize;
    private Point[] n;
    private Point[] m;

    public int add(Point q) {
        arraySize++;
        n = new Point[arraySize];
        for (int i = 0; i < arraySize - 1; i++) {
            n[i] = m[i];
        }
        n[arraySize - 1] = q;
        m = new Point[arraySize];
        for (int i = 0; i < m.length; i++) {
            m[i] = n[i];
        }
        return arraySize - 1;
    }

    public int getArraySize() {
        return arraySize;
    }

    public String get(int i) {
        if (n[i] != null) {
            return "(" + n[i].getX() + ", " + n[i].getY() + ")";
        } else {
            return "null";
        }
    }
}
