import java.util.ArrayList;
import java.util.List;

public class ObservableFilmeGenero{
    private List<IObserver> observers = new ArrayList<>();
    private String genero;

    public ObservableFilmeGenero(String genero) {
        this.genero = genero;
    }

    public void addObserver(IObserver observer){
        observers.add(observer);
    }
    
    public void removeObserver(IObserver observer){
        observers.remove(observer);
    }

    
    public void notifyObservers(){
        for(IObserver observer : observers){
            observer.update(genero);
        }
    }


    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}

