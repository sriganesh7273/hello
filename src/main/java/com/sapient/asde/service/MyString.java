package com.sapient.asde.service;

import java.nio.charset.CharacterCodingException;

public class MyString {

    private String message;

    public MyString(){

    }

    public MyString(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyString{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean isPalindrome(){
        int length = this.message.length();

        String reverseString="";

        try{
            for (int i = (length - 1); i >= 0; --i) {
                reverseString += this.message.charAt(i);
            }
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            return null;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return reverseString.equalsIgnoreCase(this.message);
    }

    public String getAcronym() {
        String result="";
        try {
            String[] strings = this.message.split(" ");
            for (String string : strings) {
                result += String.valueOf(string.charAt(0)).toUpperCase();
            }
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return result;
    }

    public Integer nOccurrences(Character character) {

        Integer result=0;

        try {
            for (int i = 0; i < this.message.length(); i++) {
                if (Character.valueOf(this.message.charAt(i)).equals(character))
                    result++;
            }
        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return result;
    }

}
