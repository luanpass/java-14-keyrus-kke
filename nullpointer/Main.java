package nullpointer;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.setDoc(123456789);
        System.out.println(empresa.getName().toUpperCase());
    }
}
