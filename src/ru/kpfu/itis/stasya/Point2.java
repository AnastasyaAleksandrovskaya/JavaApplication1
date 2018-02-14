/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.kpfu.itis.stasya;

/**
 *
 * @author asus
 */
public class Point2<T> {
    protected int pointCount;
    protected int capacity=16;
    protected T[] arr;
    protected T[] otherArr;
    protected int index;
    
    public int add(T p){
        pointCount++;
        capacity++;
        arr=(T[])new Object [pointCount];
        for (int i=0;i<pointCount-1;i++){
            arr[i]=otherArr[i];
        }
        arr[pointCount-1]=p;
        otherArr=(T[]) new Object [pointCount];
        for (int i=0;i<otherArr.length;i++){
            otherArr[i]=arr[i];
        }
        return capacity-1;
    }
    public boolean remove (int i){
        if (i<0 || i>=capacity-1){
            return false;
        }
        else {
            for(int j=i;j<arr.length-1;j++){
                otherArr[j]=arr[j+1];
            }
        pointCount--;
        return true;
        }
    }
    
}
