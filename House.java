/* This is a stub for the House class */

import java.util.ArrayList;
/**
 * Constructs Houses that behave like buildings with additional attributes and methods that are specific for a house.
 */
public class House extends Building implements HouseRequirements{
  
  protected ArrayList<Student> residents; // The <Student> tells Java what kind of data we plan to store IN the ArrayList
  protected boolean hasDiningRoom;

  /**
   * Constructor that takes the attributes from building and intializes new attributes that are specifically for House
   * @param name name of house (String)
   * @param address adress of house (String)
   * @param nFloors number of floors in the house (int)
   * @param hasDiningRoom if the house has a dining room (boolean)
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<>(); // start with an empty list of residents
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Method that declares the attribute boolean hasDiningRoom true.
   */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }
  
  /**
   * Method that counts how many residents live in the house.
   */
  public int nResidents(){
    return residents.size();//counts how many objects are in the array
  }

  /**
   * Method that adds a student to the list of residents of the House
   */
  public void moveIn(Student s){
    if(isResident(s)){ //checks if student is already a resident
        System.out.println(s + " is already a resident of this house"); 
    }else{
    residents.add(s);}
  }

  /**
   * Methods that removes a student from the list of residents of the House.
   */
  public Student moveOut(Student s){
    if(!isResident(s)){ //checks if student is even a resident
        System.out.println(s + " is not a resident of this house"); 
        return s;
    } else{
    residents.remove(s);
    return s;}
  } 
  
  /**
   * Method that checks if student is a resident of the House
   */
  public boolean isResident(Student s){
    if(residents.contains(s)){
      System.out.println("Student " + s + " IS in residence");
      return true;
    }else{
      System.out.println("Student " + s + " IS NOT in residence");
      return false;
    }
  }

  /**
   * Main section for testing code
   * @param args
   */
  public static void main(String[] args) {
    House Emerson = new House("Emerson House", "1 Paradise Road", 80, false);
    System.out.println("Has dining room: " + Emerson.hasDiningRoom());
    System.out.println("Residents: " + Emerson.nResidents());
  }

}