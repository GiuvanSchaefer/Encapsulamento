package encapsulamento;

public class Encapsulamento {  
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Giuvan");
        
        cliente.incrementarSaldoDeCompra(120.00);
        
    
        System.out.println(cliente.getNome());

    }
    

}
