package codeFlow;



public class User {

    private String name;
    private String password;

    public User(String name, String password) {
        setName(name);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) /*tilføjet:*/ throws IllegalArgumentException{
        if(DataValidator.isUserNameValid(name)){
            this.name = name;
        }
        else{
            //this.name = null;
            throw new IllegalArgumentException("Username is not valid");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) /*tilføjet:*/ throws IllegalArgumentException {
        if(DataValidator.isPasswordValid(password)){
            this.password = password;
        }
        else{
            //this.password = "N/A";
            throw new IllegalArgumentException("Password is not valid");
        }
    }
}