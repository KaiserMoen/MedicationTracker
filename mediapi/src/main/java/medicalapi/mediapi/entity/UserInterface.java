package medicalapi.mediapi.entity;

public interface UserInterface {
    public String setUserName(String username);
    public String setPassword(String password);
    public String getUserName();
    public String getPassword();
    public void setUserType(int userType);
    public int getUserType();
    public int getUserId();
}
