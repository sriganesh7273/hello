package com.sapient.asde.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStringTest {

    private MyString myString;

    @BeforeEach
    void setUp() {
        myString=new MyString("sri Ganesh");
    }

    @AfterEach
    void tearDown() {
        myString=null;
    }

    @Test
    void  checkForValidDefaultConstructor(){
        MyString myString1= new MyString();
        assertNull(myString1.getMessage());
    }

    @Test
    void  checkForInValidDefaultConstructor(){
        MyString myString1= new MyString();
        assertNull(myString1.getMessage());
    }


    @Test
    void checkForValidToString() {
        assertEquals("MyString{message='sri Ganesh'}",myString.toString());
    }

    @Test
    void  checkForInValidToString(){
        assertNotEquals("sri Ganesh",myString.toString());
    }

    @Test
    void  checkForInValidGetMessage(){
        assertNotSame("sri",myString.getMessage(),"They are not same");
    }

    @Test
    void  checkForValidGetMessage(){
        //using another method assertSame instead of assertEquals to know about more methods sir
        assertSame("sri Ganesh",myString.getMessage(),"They are same");
    }

    @Test
    void  checkForInValidSetMessage(){
        myString.setMessage("sri ganesh sharma");
        assertNotEquals("sri",myString.getMessage(),"They are not same");
    }

    @Test
    void  checkForValidSetMessage(){
        myString.setMessage("sri ganesh sharma");
        assertEquals("sri ganesh sharma",myString.getMessage(),"They are same");
    }

    @Test
    void  checkForInValidPalindrome(){
        assertFalse(myString.isPalindrome(),"It is not palindrome");
    }

    @Test
    void  checkForValidPalindrome(){
        myString.setMessage("MalayalaM");
        assertTrue(myString.isPalindrome(),"It is palindrome");
    }

    @Test
    void  checkForInValidAcronym(){
        assertNotEquals("SGS",myString.getAcronym(),"It is not same");
    }

    @Test
    void  checkForValidAcronym(){
        myString.setMessage("welcome to java");
        assertEquals("WTJ",myString.getAcronym(),"It is same");
    }


    @Test
    void  checkForInValidNOccurrences(){
        assertNotEquals(6,myString.nOccurrences('a'),"It is not same");
    }

    @Test
    void  checkForValidNOccurrences(){
        myString.setMessage("sri ganesh sharma");
        assertEquals(3,myString.nOccurrences('s'),"It is same");
    }

}