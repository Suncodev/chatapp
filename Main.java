public class Main {
    public static void main(String[] args) {
        
        Account nizar = new Account("Nizar Fadilah");
        Message message = new Message(nizar, "Ini Pesan");

        System.out.println(nizar.getName());
        System.out.println(message.getMessage());

    }
}