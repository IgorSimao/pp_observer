import java.util.ArrayList;
import java.util.List;

public class ObservableFilme {
    private List<IObserver> observers = new ArrayList<>();


    public void addObserver(IObserver observer){
        observers.add(observer);
    }
    
    public void removeObserver(IObserver observer){
        observers.remove(observer);
    }


    // public void notifyObservers(){
    //     for(IObserver observer : observers){
    //         observer.update(String genero);
    //     }
    // }

    public void notifyObservers(String genero){
        for(IObserver observer : observers){
            observer.update(genero);
        }
    }
}
