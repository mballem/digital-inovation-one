package one.innovation.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Aula {
    public static void main(String[] args) {
        // forma imperativa
        System.out.println(buscarUsuario(15));

        // forma funcional
        Function<Integer, Object> getUsuario = id -> new UsuarioDao().getUsuario(id);
        System.out.println(getUsuario.apply(15));
    }

    public static Object buscarUsuario(int id) {
        // retorna o usuario
        return new UsuarioDao().getUsuario(id);
    }
}

class Usuario {

    private Integer id;
    private String nome;

    public Usuario(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}

class UsuarioDao {

    List<Usuario> usuarios = Arrays.asList(
            new Usuario(5, "Jú"),
            new Usuario(10, "Ana"),
            new Usuario(15, "Bia"),
            new Usuario(20,"Cloe")
    );

    public Usuario getUsuario(Integer id) {
        return usuarios
                .stream()
                .filter((u -> u.getId().equals(id)))
                .collect(Collectors.toList()).get(0);
    }
}
