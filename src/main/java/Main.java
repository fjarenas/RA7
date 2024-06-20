public class Main {
    public static void main(String[] args) {
        //1. Cree un objeto Farmacia
        Farmacia farmacia = new Farmacia("Farmacia1");
        //2. Cree seis objetos productos farmace´uticos, tres que sean medicamentos (ejemplo: ibuprofeno, aspirina y paracetamol) y tres que sean de parafarmacia (ejemplo: crema solar, pasta de dientes y
        //suero fisiológico), invéntate los precios.
        ProductoFarmaceutico producto1 = new Medicamento("ibuprofeno",2.97);
        ProductoFarmaceutico producto2 = new Medicamento("aspirina",1.99);
        ProductoFarmaceutico producto3 = new Medicamento("paracetamol",0.75);
        ProductoFarmaceutico producto4= new ProductoParaFarmacia("crema solar",23.20);
        ProductoFarmaceutico producto5= new ProductoParaFarmacia("pasta de dientes",7.00);
        ProductoFarmaceutico producto6= new ProductoParaFarmacia("suero fisiologico",15.00);
        //3. Añade los productos a la farmacia.
        farmacia.addProducto(producto1);
        farmacia.addProducto(producto2);
        farmacia.addProducto(producto3);
        farmacia.addProducto(producto4);
        farmacia.addProducto(producto5);
        farmacia.addProducto(producto6);
        //4. Llama al método estático de la interface para que devuelva el String y muestres los datos en consola.
        System.out.println("======Muestras los datos======");
        System.out.println(ProductoFarmaceutico.listaDeProductos(farmacia.getProductoFarmaceutico()));
        //5. Comprueba el otro método de la interface para mostrar por consola, solo el nombre de los medicamentos. Solo el nombre, no el resto de atributos, aunque el m´etodo devuelve una lista de objetos
        //ProductoFarmaceutico
        System.out.println("======Productos y Medicamentos======");
        System.out.println(ProductoFarmaceutico.obtenerParafarmaciaOMedicamentos("MEDICAMENTO", farmacia.getProductoFarmaceutico()));
        System.out.println(ProductoFarmaceutico.obtenerParafarmaciaOMedicamentos("PARAFARMACIA", farmacia.getProductoFarmaceutico()));
    }
}
