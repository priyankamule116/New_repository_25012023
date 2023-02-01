package Classes_and_Objects_11.src;


class Person {
     
    // Instance variables (data or "state")
    String name;
    int age;
     
     
    // Classes can contain
     
    // 1. Data
    // 2. Methods
}
 
 
public class Classes_and_Object_App {
 
    public static void main(String[] args) {
         
         
        // Create a Person object using the Person class
        Person person1 = new Person();  
        person1.name = "Jon Snow";
        person1.age = 37;
         
        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Tyrion Lannister";
        person2.age = 20;
         
        System.out.println(person2.name);
         
    }


    //TODO  Add a metod which prints age of the person
}