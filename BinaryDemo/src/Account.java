import java.io.Serializable;

class Account implements Serializable {

    private int id;
    private double balance;

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

}
