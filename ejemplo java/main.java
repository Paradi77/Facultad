public class main {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel García Márquez");

        // Crear libros y asociarlos al autor
        Libro libro1 = new Libro("Cien años de soledad");
        Libro libro2 = new Libro("El amor en los tiempos del cólera");

        autor.addLibro(libro1);
        autor.addLibro(libro2);

        System.out.println("Autor: " + autor.getNombre());
        for (Libro libro : autor.getLibros()) {
            System.out.println("Libro: " + libro.getTitulo());
        }
    }
}
