/* This class is an implementation of an ArrayList, a data structure similar
   to an array but that has several nice features (such as automatic resizing
   to accommodate extra information and an "add" method that adds a piece
   of information to the end of the array).
   
   The functionality of this should be very similar to (a restricted version
   of) the built in ArrayList class from java.util.ArrayList.
 */
public class MyArrayList
{
  // Store the actual data. For now, we can only use this to store Strings.
  private String[] array;
  
  // How many of the slots are currently filled
  // Private because we don't want it to be modified anywhere else
  public int length;
  
  // Default constructor. Tells us how to initialize an empty list
  public MyArrayList()
  {
    // Initialize the array with 10 slots to start
    /* TODO: FILL THIS IN */
    array = new String[10];
    // Initialize length to 0
    /* TODO: FILL THIS IN */
    length = 0;
  }
  
  /* Retrieves and returns the element at position 'index' */
  public String get(int index)
  {
    /* TODO: FILL THIS IN (replace null with an appropriate return value) */
    return array[index];
    
    /* BONUS: have this method throw an error if index is greater than or
       equal to length*/
  }
  
  /* A helper method we use to avoid having to copy-paste all the array
     resizing code, since we need it in multiple methods (add and insert)
   */
  private void resizeIfNeeded()
  {
    // Check to see if we need to resize
    if(length >= array.length)
    {
      // Create a new array with size 2* the old one
      String[] temp = new String[2*array.length];
      
      // Copy over all of the old stuff with a for loop
      /* TODO: FILL THIS IN */
        for (int i = 0; i<=array.length-1; i++) {
            temp[i] = array[i];
        }
      // Update array to point to our new improved one
      array = temp;
    }
  }
  
  /* Add the specified element to the end of the array.
     Automatically resizes the array if it runs out of space by doubling
     the amount of available slots.
   */
  public void add(String toAdd)
  {
    // Increase the capacity if needed (hint: use a method from above)
    resizeIfNeeded();
  
    // Add the new item to the end
    array[length] = toAdd;
    
    // Update the length appropriately since we have added an element
    /* TODO: FILL THIS IN */
      length++;
      
  }
  
  /* Return the number of elements stored in the array
     not counting the blank slots
   */
  public int size()
  {
    /* TODO: FILL THIS IN (replace -1 with the actual number of elements) */
    return length;
  }
  
  /* Delete the item at the specified index.
     All entries after that index will be shifted by 1,
     and the length will be decreased by 1 to accurately
     reflect the number of elements.
   */
  public void remove(int index)
  {
    // Use a for loop to shift everything after the index to the left
    /* TODO: FILL THIS IN */
    for (int i = index; i<length; i++) {
        array[i] = array[i+1];
    }
    // Update length accordingly
    /* TODO: FILL THIS IN */
    length--;
    /* BONUS: have this method throw an error if index is greater than or
       equal to length*/
  }
  
  /* Overwrite the String toAdd in the slot index of the array.
     Throws an exception if the index is negative or greater than the length
  */
  public void set(int index, String toAdd)
  {
    /* TODO: FILL THIS IN (one line) */
    array[index] = toAdd;
    /* BONUS: have this method throw an error if index is greater than or
       equal to length*/
  }
  
  /* Remove everything from the list */
  public void removeAll()
  {
    /* TODO: FILL THIS IN */
      length = 0;
      
  }
  
  /* Insert a String at the specified position.
     The String previously at that location is
     shifted forward one slot, along with everything
     after it.
   */
  public void insert(int index, String toAdd)
  {
    // Increase the size of the array if needed (hint: helper method)
    /* TODO: FILL THIS IN */
      resizeIfNeeded();
    // Shift everything from index onwards one slot to the right, to 
    // make room for the new thing we want to insert.
    // (We have to do this FIRST, otherwise we would forget what was
    //  previously stored in array[index]).
    /* TODO: FILL THIS IN */
      for (int i = length; i>=index; i--) {
          array[i+1] = array[i];
      }
      array[index] = toAdd;
      length++;
    // Add the actual element we wanted to add.
    /* TODO: FILL THIS IN */
  }
}