class Main {
  public static void main(String[] args) {
    int myNum = 5;               // integer (whole number)
    //float myFloatNum = 5.99f;    // floating point number
   float myFloatNum = myNum; // Type casting (Widening casting)
   int myInt= (int) myFloatNum;  //Type Casting (Narrowing casting)
    char myLetter = 'D';         // character
    int myInt1= myLetter;
    char myChar1= (char) myNum;
    boolean myBool = true;       // boolean
    String myText = "Hello";     // String    
    System.out.println(myNum);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText);
    System.out.println(myInt);
    System.out.println(myInt1);
    System.out.println(myChar1);
  }
}
