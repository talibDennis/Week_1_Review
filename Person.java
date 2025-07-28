// a class is a blueprint NOT a object!
/* a class only contains information about itself! 
Like class Car should only have info partaining to a car,
class Person about a person etc. */

public class Person {
  // props or fields or instance vars
  private String name; // default of null
  private int age; // default is 0

  // contructors, no return type, MUST be public, MUST be the same name as the class
  public Person () {}
  public Person (String name) {
    this.name = name;
  }
  public Person (String name, int age) {
    this.name = name;
    this.age = age;
  }

  // getters or accessors (should be public in most cases)
  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }

  //setters or mutators (should be public in most cases)
  public void setName(String name) {
    this.name = name;
  }
  public void setName(int age) {
    this.age = age;
  }

} // class
