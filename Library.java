/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building implements LibraryRequirements{
  private Hashtable<String, Boolean> collection;


    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title){
    if (containsTitle(title)) {
      System.out.println(title + " is already in the collection.");
    } else {
      collection.put(title, true); // true = available
      System.out.println(title + " added to the collection.");
      }
    }

    public String removeTitle(String title){
    if (!containsTitle(title)) {
      System.out.println(title + " not found in the collection.");
    } else {
      collection.remove(title);
      System.out.println(title + " removed from the collection.");
    }
    return title;
    }

    public void checkOut(String title){
    if (containsTitle(title)) {
      if (isAvailable(title)) {
        collection.put(title, false);
        System.out.println(title + " has been checked out.");
      } else {
        System.out.println(title + " is already checked out.");
      }
    } else {
      System.out.println(title + " is not in the collection.");
    }
    }

    public void returnBook(String title){
    if (containsTitle(title)) {
      if (!isAvailable(title)) {
        collection.put(title, true);
        System.out.println(title + " has been returned.");
      } else {
        System.out.println(title + " was not checked out.");
      }
    } else {
      System.out.println(title + " is not in the collection.");
    }
    }

    public boolean containsTitle(String title){
    return collection.containsKey(title);
    }

    public boolean isAvailable(String title){
    if (!collection.containsKey(title)) {
        System.out.println(title + " is not in the collection.");
        return false;
    }
    boolean available = collection.get(title);
    if (available) {
        System.out.println(title + " is available.");
        return true;
    } else {
        System.out.println(title + " is currently checked out.");
        return false;
    }
    }


    public void printCollection(){
    if (collection.isEmpty()) {
      System.out.println("The library collection is empty.");
    } else {
      System.out.println("\nLibrary Collection:");
      for (String title : collection.keySet()) {
        String status = collection.get(title) ? "Available" : "Checked out";
        System.out.println("• " + title + " — " + status);
      }
    }
    }
  
    public static void main(String[] args) {
      Library Josten = new Library("Josten", "Mendall Hall", 3);
      
    }
  
  }