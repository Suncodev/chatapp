class Message {

    private Account account;
    private String message;

    public Message(Account account, String message){

        this.account = account;
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}