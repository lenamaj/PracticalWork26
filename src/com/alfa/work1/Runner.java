package com.alfa.work1;

public class Runner {

    public void run() {

        System.out.println(devisionInt(10, 50));
        System.out.println(devisionDouble(10.5, 0));
    }

    public int devisionInt(int value1, int value2) {
        int result = 0;
        try {
           result = Math.abs(value1 / value2);
        } catch (Exception e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        return result;

    }

    public int devisionDouble(double val1, double val2){

        try {

            if (val2 == 0.0) {
                throw new ArithmeticException("this devision by 0");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
        return (int) Math.abs(val1/val2);


       // return devisionInt((int)val1, (int)val2);
    }
}
