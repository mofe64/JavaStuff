package designpatterns.singleton.eager;

public class Admin {
    private String name;
    private String role;
    private static final Admin adminInstance = new Admin();

    public static Admin getInstance() {
        return adminInstance;
    }

    private Admin() {
        role = "Admin";
        name = "mofe";
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }


}
