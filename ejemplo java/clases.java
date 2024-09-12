import java.util.ArrayList;
import java.util.List;

class Libro{
    private String titulo;
    
    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
class Autor {
        private String nombre;
        private List<Libro> libros;
    
        public Autor(String nombre) {
            this.nombre = nombre;
            this.libros = new ArrayList<>(); // Inicializa la lista de libros
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public List<Libro> getLibros() {
            return libros;
        }
    
        public void addLibro(Libro libro) {
            libros.add(libro);
        }
    }
}