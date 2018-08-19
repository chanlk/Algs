package chap1;

import org.junit.Test;

import java.util.Arrays;

/**
 * @description: 排序测试
 * @author: Chanlk
 * @create: 2018-08-19 17:52
 **/

public class SortTest {


    //准备待排序的数组
    public Comparable[] numsPrepare() {

        Comparable[] arr = new Comparable[BaseEnum.M_SIZE.getSIZE()];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = (int) ((Math.random() * 1000));
        }
        return arr;
    }

    @Test
    public void fun1() {
        Comparable[] arr = numsPrepare();
        SelectSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
