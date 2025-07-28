// a class is a blueprint NOT a object!
/* a class only contains information about itself! 
Like class Car should only have info partaining to a car,
class Pet about a Pet etc. */

public class Pet {
  // props or fields or instance vars
  private String name; // default of null
  private int age; // default is 0
  private boolean isFurry; // boolean is true or false (false by default)

  // contructors, no return type, MUST be public, MUST be the same name as the class
  public Pet () {}
  public Pet (String name) {
    this.name = name;
  }
  public Pet (String name, int age, boolean isFurry) {
    this.name = name;
    this.age = age;
    this.isFurry = isFurry;
  }

  // getters or accessors (should be public in most cases)
  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }
  public boolean getIsFurry() {
    return this.isFurry;
  }

  //setters or mutators (should be public in most cases)
  public void setName(String name) {
    this.name = name;
  }
  public void setName(int age) {
    this.age = age;
  }
  public void setIsFurry(boolean isFurry) {
    this.isFurry = isFurry;
  } // ex. this.isFurry is global, isFurry is for {this} only

} // class
