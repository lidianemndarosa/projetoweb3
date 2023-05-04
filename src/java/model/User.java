package model;

public class User {
    //Atributos
    private String userName;
    private String userPass;
    
    //Construtor
    public User(String u, String p) {
        this.userName = u;
        this.userPass = p;
        
    }
     
    // Getter e Setter
    public String getUserName() {
        return this.userName;
        
    }
    
    public void setUserName(String u) {
        this.userName = u;
    }
    
    public String getUserPass() {
        return this.userPass;
        
    }
    
    public void setUserPass(String p) {
        this.userPass = p;
    }
    
    //toString -> Representaçao do objeto
    @Override
    public String toString() {
        return "<hr>Nome: " + userName +
               "<br>Senha: "+ userPass;
    }
    
    //Métodos gerais
    public boolean isLogged() {
        return (userName.equals("email@email")
                && userPass.equals("1234"));
    }
}
