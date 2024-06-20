import java.util.ArrayList;
import java.util.List;

public interface ProductoFarmaceutico {
//    Método a implementar que calcule el valor del producto con IVA.
    double calcularIVA(double precioSinIVA);

//    Método estático, que pasando una lista de objetos de la propia interface, devuelva una cadena.
    static List<String> listaDeProductos(List<ProductoFarmaceutico> productosFarmaceuticos){
        List<String> listaProductos = new ArrayList<>();
        for (ProductoFarmaceutico producto : productosFarmaceuticos){
            listaProductos.add(producto.toString());
        }
        return listaProductos;
    }

//    Método estático que según se le pase una cadena con los valores medicamento o parafarmacia
//    más una lista de objetos de la propia interface, devuelva una lista de objetos ProductoFarmaceutico
//    de las características solicitadas (o medicamentos o productos de parafarmacia).
    static List<ProductoFarmaceutico> obtenerParafarmaciaOMedicamentos(String tipo, List<ProductoFarmaceutico> productos){
        List<ProductoFarmaceutico> resultado = new ArrayList<>();
        for (ProductoFarmaceutico producto : productos) {
            if ("medicamento".equals(tipo.toLowerCase()) && producto instanceof Medicamento) {
                resultado.add(producto);
            } else if ("parafarmacia".equals(tipo.toLowerCase()) && producto instanceof ProductoParaFarmacia) {
                resultado.add(producto);
            }
        }
        return resultado;
    }
}
