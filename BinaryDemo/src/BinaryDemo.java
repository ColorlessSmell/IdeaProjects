import java.io.*;
import java.io.ObjectInputStream;

//This program demonstates how to read from/write to a binary file
//1) FileInputStream/FileOutputStream
//2) DataInputStream/DataOutputStream
//3) ObjectInputStream/ObjectOutputStream

public class BinaryDemo {

    public static void main(String[] args){

        try {
        //Binary file is for computer to read for computer to write
        //Create two Account objects
        Account myAccount = new Account(1234, 750.75);
        Account yourAccount = new Account(4321,1050.20);


            //Write the account information inside a binary file, file name lets call it BankStatement.dat
            // (.dat is file extension for binary files)
            //Step #1: Create a File object that is associated with BankStatement.dat
            File outFile = new File("BankStatement.dat");

            //Step #2: Create a FileOutputStream object (because we are writing to the file)
            FileOutputStream fos = new FileOutputStream(outFile);

            //Step #3: Create an ObjectOutputStream object
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //Next write the two objects you created (account objects) inside the file BankStatement.dat
            oos.writeObject(myAccount);
            oos.writeObject(yourAccount);

            //Step #4: Don't forget to close the stream

            oos.close();

            //*********************************************************
            //How to read from a binary file
            //Step #1: Associate a file input with the binary file which we did above (BankStatement.dat)
            //Step #2: Create a FileInputStream object
            FileInputStream fis = new FileInputStream(outFile);

            //Step #3: Create a ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(fis);
            Account a1 = (Account) ois.readObject();
            Account a2 = (Account) ois.readObject();
            double totalAmt = a1.getBalance() + a2.getBalance();
            System.out.print("\nTotal Amount: " + totalAmt);

            //Step #4: Close the stream
            ois.close();

        } catch (FileNotFoundException e){

            System.out.println("File was not found");

        } catch (ClassNotFoundException e){

            System.out.println("Class \"Account\" was not found");

        }

        catch (IOException e){

            System.out.println(e);

        }


    }

}
