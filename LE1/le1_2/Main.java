/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        Mother objMother = new Mother();
        objMother.show();  // This will call the Mother class version of show()

        Child objChild = new Child();
        objChild.show();  // This will call the Child class version of show()
    }
}