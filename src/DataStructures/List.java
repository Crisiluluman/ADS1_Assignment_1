package DataStructures;

public interface List<T>{
  boolean isEmpty();
  int size();
  void addToFront(T data);
  T removeFirst() throws EmptyListException; // TODO: Ask about this exception


  class EmptyListException extends Exception {

    }
}
