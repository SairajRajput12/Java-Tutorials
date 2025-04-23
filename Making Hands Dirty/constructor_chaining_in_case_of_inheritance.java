// class test
// {
//     String name;
 
//     // constructor 1
//     test()
//     {
//         this("");
//         System.out.println("No-argument constructor of" +
//                                            " base class");
//     }
 
//     // constructor 2
//     test(String name)
//     {
//         this.name = name;
//         System.out.println("Calling parameterized constructor"
//                                               + " of base");
//     }
// }
 
// class Derived extends test
// {
//     // constructor 3
//     Derived()
//     {
//         System.out.println("No-argument constructor " +
//                            "of derived");
//     }
 
//     // parameterized constructor 4
//     Derived(String name)
//     {
//         // invokes base class constructor 2
//         super(name);
//         System.out.println("Calling parameterized " +
//                            "constructor of derived");
//     }


// }

// class constructor_chaining_in_case_of_inheritance{
//      public static void main(String args[])
//     {
//         // calls parameterized constructor 4
//         Derived obj = new Derived("test");
 
//         // Calls No-argument constructor
//         //  Derived obj = new Derived();
//     }
// }



// Note : Similar to constructor chaining in same class, super() should be the first line of the constructor as super class’s constructor are invoked before the sub class’s constructor.
