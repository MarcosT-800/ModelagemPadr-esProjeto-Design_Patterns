import java.util.ArrayList;
import java.util.List;

// Composição
class Motor {
    public void ligar() {
        System.out.println("Motor ligado.");
    }
}

class Carro {
    private Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    public void ligarMotor() {
        motor.ligar();
    }
}

// Agregação
class Departamento {
    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Universidade {
    private List<Departamento> departamentos;

    public Universidade() {
        this.departamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void listarDepartamentos() {
        for (Departamento dep : departamentos) {
            System.out.println(dep.getNome());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Exemplo de Composição
        Carro carro = new Carro();
        carro.ligarMotor();

        // Exemplo de Agregação
        Universidade universidade = new Universidade();
        universidade.adicionarDepartamento(new Departamento("Ciência da Computação"));
        universidade.adicionarDepartamento(new Departamento("Engenharia"));
        universidade.listarDepartamentos();
    }
}
