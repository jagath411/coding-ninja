package Generics;

public class Pair <T,S>{
    private T first;
    private S second;

    public Pair() {
    	
    }
    public Pair(T first, T second){
      this.first = first;
      this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public void setFirst(T first){
        this.first=first;
    }

    public T getSecond(){
      return second;
    }

    public void setSecond(T second){
      this.second= second;
    }
}
