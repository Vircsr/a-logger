package test;

import log.LogLevel;
import log.LogManager;

public class LogTest {
    public static void main(String[] args) {
//        System.out.println(LogLevel.DEBUG);
//        System.out.println(LogLevel.getNameByValue(1));
        LogManager.getInstance(LogLevel.INFO,"this is an info.");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LogManager.getInstance(LogLevel.DEBUG,"debug");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LogManager.getInstance(LogLevel.ERROR,"error");
    }
}
