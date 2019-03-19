package com.github.treeview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void asd() {
        List<String> list=new ArrayList<>();
        list.add("2");
        list.add(0,"1");
//        System.out.println(list.size()+"====");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+"====");
        }
    }
}