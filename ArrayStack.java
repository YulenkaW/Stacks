
package stackinterface;

import java.util.EmptyStackException;


public class ArrayStack<T> implements StackInterfaceDoc <T> {
   private static final int DEFAULT_CAPACITY = 25;
    
    
   private int numberOfItems;
   private T[] items;
   
   public ArrayStack() {
       this(DEFAULT_CAPACITY);
   }
    public ArrayStack (int size) {
      items = (T[])  new Object[size];
      numberOfItems = 0;
    }
    
    @Override
    public void push(T item) {
     if (numberOfItems ==items.length) {
         increaseCapacity();
     }   
     items[numberOfItems] = item;
     numberOfItems++;
    }

    @Override
    public T pop() {
     checkForEmptyAndThrow();
      numberOfItems--;
      T item= items[numberOfItems];
      items[numberOfItems] = null;
      return item;
        
        
    }

    @Override
    public T peek() {
        if (isEmpty() ) {
          throw new EmptyStackException ();}
        return items[numberOfItems-1];
      }

    @Override
    public boolean isEmpty() {
        return numberOfItems==0;
       
    }

    @Override
    public void clear() {
        while (!isEmpty()){
            pop();
           
        }
        
    }
    private void increaseCapacity() {
        T[] newItems = (T[])  new Object[numberOfItems*2];
        for (int index = 0; index<numberOfItems; index++) {
            newItems[index] = items [index];
            
        }
        
    }
    private void checkForEmptyAndThrow() throws EmptyStackException {
    if (isEmpty() ) {
          throw new EmptyStackException ();
          }
}
}
