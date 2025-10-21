
import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    private List<Usuario> usuarios;

    public UsuarioController() {
        this.usuarios = new ArrayList<>();
    }

    public void crearUsuario(String username, String email) {}
    public List<Usuario> listarUsuarios() { return usuarios; }
    public void ejecutar() {}
    public void mostrarInformacion() {}
}
