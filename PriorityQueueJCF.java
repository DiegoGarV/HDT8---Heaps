/*
* Autores:
* Diego García 22404
* César López 22535
* Fecha: 31/03/2023
* Hoja de Trabajo #8
* Priority Queue con JCF
*/

import java.util.PriorityQueue;

public class PriorityQueueJCF<E extends Comparable<E>> implements PriorityQueueI<E> {

    protected PriorityQueue<E> data;
    
    
    // Creating a new PriorityQueue.
    public PriorityQueueJCF(){
		data = new PriorityQueue<E>();
	}

    
    // Returning null.
    @Override
    public E getFirst() {
        return null;
    }

   /**
    * It removes the first element from the queue.
    * 
    * @return The first element in the queue.
    */
    @Override
    public E remove() {
        return data.remove();
    }

   /**
    * This function adds a value to the end of the list
    * 
    * @param value The value to be added to the list.
    */
    @Override
    public void add(E value) {
        data.add(value);
    }

  /**
   * It checks if the size of the list is 0.
   * 
   * @return The size of the list.
   */
    @Override
    public boolean isEmpty() {
        return size()==0;
    }

   /**
    * It returns the size of the data.
    * 
    * @return The size of the data array.
    */
    @Override
    public int size() {
        return data.size();
    }

    /**
     * It clears the list.
     */
    @Override
    public void clear() {}
    
}
