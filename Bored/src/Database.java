public class Database {

    private String name;
    private String birthday;

    public Database(String name, String birthday){

        this.name = name;
        this.birthday = birthday;

    }

    public String getName(){
        return name;
    }

    public String getBirthday(){
        return birthday;
    }

    public void setName(String aName){
        name = aName;
    }

    public void setBirthday(String aBirthday){
        birthday = aBirthday;
    }

    public String toString(){

        return "Name:\t" + name + "\nBirthday:\t" + birthday;

    }

}
