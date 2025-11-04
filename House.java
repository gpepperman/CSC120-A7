/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building implements HouseRequirements{
  
  protected ArrayList<Student> residents; // The <Student> tells Java what kind of data we plan to store IN the ArrayList
  protected boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<>();
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }
  
  public int nResidents(){
    return residents.size();
  }

  public void moveIn(Student s){
    residents.add(s);
  }
    
  public Student moveOut(Student s){
    residents.remove(s);
    return s;
  } 
  
  public boolean isResident(Student s){
    if(residents.contains(s)){
      System.out.println("Student " + s + " IS in residence");
      return true;
    }else{
      System.out.println("Student " + s + " IS NOT in residence");
      return false;
    }
  }

  

  public static void main(String[] args) {
    House Emerson = new House("Emerson House", "1 Paradise Road", 80, false);
    System.out.println("Has dining room: " + Emerson.hasDiningRoom());
    System.out.println("Residents: " + Emerson.nResidents());
  }

}