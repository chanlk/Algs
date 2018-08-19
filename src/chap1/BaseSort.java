package chap1;

/**
 * @description: 排序的父类
 * @author: Chanlk
 * @create: 2018-08-19 18:49
 **/

public abstract class BaseSort {

    static void sort(Comparable[] arr) {

    }

    public static boolean aIsLargeThanB(Comparable a, Comparable b)   {
        //a 比 b 大 ? 是 ,不是
        return a.compareTo(b) > 0;
    }
    public static void exch(Comparable arr[],int i,int j){
        Comparable tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }

}
