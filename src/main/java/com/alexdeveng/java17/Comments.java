package com.alexdeveng.java17;

class Comments {
    /**
     * This is a Javadoc Comment
     * @param a
     * @param b
     * @return returns the sum of a and b
     */
    int add (int a, int b) {
        //This is a single-line comment
        return a + b;
    }

    /*
     * This is a multi-line comment
     */
    void displayHelloCommentsMessage(){
        System.out.println("Hello Comments in Java!");
    }
}
