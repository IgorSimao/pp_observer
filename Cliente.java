public class Cliente {
    public static void main(String[] args) {
        ObservableFilmeGenero observableGenero = new ObservableFilmeGenero("acao");
        ObservableFilmeGenero observableGenero1 = new ObservableFilmeGenero("comedia");
        ObservableFilmeGenero observableGenero2 = new ObservableFilmeGenero("suspense");
        ObservableFilmeGenero observableGenero3 = new ObservableFilmeGenero("terror");

       
        ConcreteObserverFilmes cliente1 = new ConcreteObserverFilmes("Cliente1");
        ConcreteObserverFilmes cliente2 = new ConcreteObserverFilmes("Cliente2");
        ConcreteObserverFilmes cliente3 = new ConcreteObserverFilmes("Cliente3");
        ConcreteObserverFilmes cliente4 = new ConcreteObserverFilmes("Cliente4");   
        ConcreteObserverFilmes cliente5 = new ConcreteObserverFilmes("Cliente5");


        cliente1.adicionarGenero("terror");
        cliente1.adicionarGenero("acao");

        cliente2.adicionarGenero("acao");
        cliente2.adicionarGenero("terror");

        cliente3.adicionarGenero("comedia");
        cliente3.adicionarGenero("suspense");

        cliente4.adicionarGenero("suspense");

        cliente5.adicionarGenero("comedia");

        observableGenero.addObserver(cliente1);
        observableGenero.addObserver(cliente2);
        observableGenero.addObserver(cliente3);
        observableGenero.addObserver(cliente4);
        observableGenero.addObserver(cliente5);
        observableGenero3.notifyObservers();
        
        observableGenero1.addObserver(cliente1);
        observableGenero1.addObserver(cliente2);
        observableGenero1.addObserver(cliente3);
        observableGenero1.addObserver(cliente4);
        observableGenero1.addObserver(cliente5);
        observableGenero3.notifyObservers();

        observableGenero2.addObserver(cliente1);
        observableGenero2.addObserver(cliente2);
        observableGenero2.addObserver(cliente3);
        observableGenero2.addObserver(cliente4);
        observableGenero2.addObserver(cliente5);
        observableGenero2.notifyObservers();

        observableGenero3.addObserver(cliente1);
        observableGenero3.addObserver(cliente2);
        observableGenero3.addObserver(cliente3);
        observableGenero3.addObserver(cliente4);
        observableGenero3.addObserver(cliente5);
        observableGenero3.notifyObservers();

        observableGenero3.notifyObservers();

    }
}
