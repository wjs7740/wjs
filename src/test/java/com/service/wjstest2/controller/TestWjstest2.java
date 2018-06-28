package com.service.wjstest2.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestWjstest2 {

        Wjstest2Delegate wjstest2Delegate = new Wjstest2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = wjstest2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}