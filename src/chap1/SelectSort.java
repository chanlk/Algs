package chap1;

import org.junit.Test;

/**
 * @description: 选择排序
 * @author: Chanlk
 * @create: 2018-08-19 17:52
 **/

public class SelectSort implements BaseSort{


    public static void sort(Comparable[] arr){
        int length = arr.length;
        //从小到大的方式
        for (int i = 0; i < length -1;i++){
            int min = i;//ooo 这里要存储的是下标,而不是值,因为后面交换的时候要用下标
            for (int j = i + 1;j < length -1 ;j++){
                if (BaseFun.aIsLargeThanB(arr[min],arr[j])){
                    min = j;
                }
            }
            BaseFun.exch(arr,i,min);
        }
    }
    @Test
    public void Fun1(){
        String a = "a";
        String b = "b";
        // res --> false; a > b flase;
        System.out.println(BaseFun.aIsLargeThanB(a,b));

    }
}
