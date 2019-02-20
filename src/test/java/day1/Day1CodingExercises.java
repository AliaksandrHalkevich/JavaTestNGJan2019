package day1;

import org.testng.annotations.Test;

public class Day1CodingExercises {


    @Test
    public void test001() {
        System.out.println("Hello, World!");
    }

    @Test
    public void test002() {
        String helloText = "Hello, World";

        System.out.println(helloText);
    }

    @Test
    public void test003() {
        String s1 = ("Who let the dogs out?");
        String s2 = "Who who who who!";

        System.out.println(s1 + "    plus    " + s2);
    }

    @Test
    public void test004() {
        int num = 5;
        String s = "I have " + num + " cookies";

        System.out.println(s);
    }

    @Test
    public void test005() {
        boolean b;
        boolean toBe = false;

        b = toBe || !toBe;

        if (b) {
            System.out.println(toBe);
        }
    }

    @Test
    public void test006() {
        boolean isElementVisible = false;

        if (isElementVisible) {
            System.out.println("click on the element");
        } else {
            System.out.println("element is NOT visible");
        }
    }

    @Test
    public void test007() {
        int a = 4;
        boolean b = a == 4;

        if (b) {
            System.out.println("It's true!");
        }
    }

    @Test
    public void test008() {
        int a = 4;
        int b = 5;

        if (a > b || a < b) ;
        {


            System.out.println("TRUE");
        }

    }

    @Test
    public void test009() {
        boolean elementAisvisible = true;
        boolean elementBisvisible = false;

        if (elementAisvisible || elementBisvisible) {
            System.out.println("click somewhere");
        } else {
            System.out.println(elementAisvisible + "   " + elementBisvisible);
        }
    }

    @Test
    public void test010() {
        int[] arr;
        arr = new int[10];

        arr[0] = 4;
        arr[1] = arr[0] + 5;

        if (arr[1] == 1) {
            System.out.println("equal to 1");
        } else {
            System.out.println("not equal to 1");
        }
    }

    @Test
    public void test011() {
        int[] arr = {1, 2, 3, 4, 5};

        if (arr[3] == 3) {
            System.out.println("equal to 3");
        } else {
            System.out.println("not equal to 3");
        }
    }
}


