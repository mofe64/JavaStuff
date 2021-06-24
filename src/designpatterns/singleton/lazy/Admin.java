package designpatterns.singleton.lazy;

public class Admin {
    private String name;
    private String role;
    private Admin adminInstance;


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

    public Admin getAdminInstance() {
        if (adminInstance == null) {
            return new Admin();
        }
        return adminInstance;
    }
}
