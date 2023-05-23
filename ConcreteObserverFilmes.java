import java.util.ArrayList;
import java.util.List;

public class ConcreteObserverFilmes implements IObserver{
    private String nome;
    private List<String> generosInscritos = new ArrayList<>();


    public ConcreteObserverFilmes(String nome) {
        this.nome = nome;

    }


    @Override
    public void update(String genero) {
        if (generosInscritos.contains(genero)){
            System.out.println("Olá, " + nome + "! Novo conteúdo do gênero " + genero + " disponível.");
        }
        
    }
    
    public void adicionarGenero(String genero) {
        generosInscritos.add(genero);
    }
    
    public void removerGenero(String genero) {
        generosInscritos.remove(genero);
    }
    
}
