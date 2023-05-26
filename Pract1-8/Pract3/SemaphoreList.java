package Pract3;

import java.util.*;
import java.util.concurrent.Semaphore;

public class SemaphoreList<E> implements List<E> {
    private static final Semaphore semaphore = new Semaphore(1, true);

    private volatile List<E> list = new ArrayList<>();

    @Override
    public int size() {
        int size = 0;
        try {
            semaphore.acquire();
            size = list.size();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean empty = true;
        try {
            semaphore.acquire();
            empty = list.isEmpty();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return empty;
    }

    @Override
    public boolean contains(Object o) {
        boolean temp = false;
        try {
            semaphore.acquire();
            temp = list.contains(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  temp;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = null;
        try {
            semaphore.acquire();
            iterator = list.iterator();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] objects = new Object[]{};
        try {
            semaphore.acquire();
            objects = list.toArray();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return objects;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        Object[] objects = new Object[]{};
        try {
            semaphore.acquire();
            objects = list.toArray(a);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  (T[]) objects;
    }

    @Override
    public boolean add(E e) {
        boolean add_status = false;
        try {
            semaphore.acquire();
            add_status = list.add(e);
            semaphore.release();
        } catch (InterruptedException er) {
            er.printStackTrace();
        }
        return  add_status;
    }

    @Override
    public boolean remove(Object o) {
        boolean remove_status = false;
        try {
            semaphore.acquire();
            remove_status = list.remove(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  remove_status;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean contains_status = false;
        try {
            semaphore.acquire();
            contains_status = list.containsAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return contains_status;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean add_All = false;
        try {
            semaphore.acquire();
            add_All = list.addAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  add_All;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        boolean add_status = false;
        try {
            semaphore.acquire();
            add_status = list.addAll(index,c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  add_status;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean removeAllStatus = false;
        try {
            semaphore.acquire();
            removeAllStatus = list.removeAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  removeAllStatus;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean status = false;
        try {
            semaphore.acquire();
            status = list.retainAll(c);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  status;
    }

    @Override
    public void clear() {
        try {
            semaphore.acquire();
            list.clear();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        Object object = null;
        try {
            semaphore.acquire();
            object = list.get(index);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (E) object;
    }

    @Override
    public E set(int index, E element) {
        Object object = null;
        try {
            semaphore.acquire();
            object = list.set(index,element);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (E) object;
    }

    @Override
    public void add(int index, E element) {
        try {
            semaphore.acquire();
            list.add(index,element);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public E remove(int index) {
        Object object = null;
        try {
            semaphore.acquire();
            object = list.remove(index);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return (E) object;
    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
        try {
            semaphore.acquire();
            index = list.lastIndexOf(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        try {
            semaphore.acquire();
            index = list.lastIndexOf(o);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  index;
    }

    @Override
    public ListIterator<E> listIterator() {
        ListIterator<E> listIt = null;
        try {
            semaphore.acquire();
            listIt = list.listIterator();
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return listIt;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        ListIterator<E> listIt = null;
        try {
            semaphore.acquire();
            listIt = list.listIterator(index);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return listIt;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        List<E> subList = null;
        try {
            semaphore.acquire();
            subList = list.subList(fromIndex,toIndex);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return subList;
    }
}