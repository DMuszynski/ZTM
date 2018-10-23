package pl.mysource.impl.User;

/**
 * Klasa definiująca Użytkownika
 * @version 1.0 2018-10-17
 * @author Damian Muszynski
 */
public class User {

    private String login;
    private String password;
    private String email;

    /**
     * Konstruktor definiuje nowa Użytkownika
     * @param login     imie
     * @param password  nazwisko
     * @param email     adres email
     */
    public User(String login, String password, String email){
        setLogin(login);
        setPassword(password);
        setEmail(email);
    }

    // Set Methods
    public final void setLogin(String login)    { this.login = login;   }
    public final void setPassword(String password)  { this.password = password;     }
    public void setEmail(String email)            { this.email = email;       }

    // Get Methods
    public final String getLogin()      { return login;     }
    public final String getPassword()   { return password;  }
    public final String getEmail()      { return email;     }

}
