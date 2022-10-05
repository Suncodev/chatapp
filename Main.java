public class Main {

    public static void main(String[] args) {
        
        Account nizar = new Account("Nizar");
        Account fadilah = new Account("Fadilah");

        nizar.sendMessage(fadilah,"Halo Nizar apa kabar ? ");
        fadilah.sendMessage(nizar, "Halo fadilah kabar baik");

        // nizar.sendMessage(fadilah, "Halo Fadilah apa kabar ?");
        // fadilah.sendMessage(nizar, "Halo Nizar apa kabar");    
    
    }

}
    
