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
    
    
    public PriorityQueueJCF(){
		data = new PriorityQueue<E>();
	}

    
    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E remove() {
        return data.remove();
    }

    @Override
    public void add(E value) {
        data.add(value);
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void clear() {}
    
}
