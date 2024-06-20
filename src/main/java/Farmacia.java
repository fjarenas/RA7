import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    private String nombreFarmacia;
    private List<ProductoFarmaceutico> productoFarmaceutico = new ArrayList<>();
    public Farmacia(String nombreFarmacia) {
        this.nombreFarmacia = nombreFarmacia;
    }
    public String getNombreFarmacia() {
        return nombreFarmacia;
    }
    public List<ProductoFarmaceutico> getProductoFarmaceutico(){
        return productoFarmaceutico;
    }
    public boolean addProducto(ProductoFarmaceutico producto){
        return productoFarmaceutico.add(producto);
    }

}
