package user;

//�����͸� ���⼭ ���� -> database ����
public class User {
   //ȸ�� ���� �����Ұ͵� ���⿡ ���� -> �̰� ������� �ؼ� mysql database ����
   private String userID;
   private String userPassword;
   private String userName;
   private String userEmail;
   private String userNumber;
   private String userDoctor;
   
   //��Ŭ�� -> source -> getters setters �Լ� ����
   public String getUserID() {
      return userID;
   }
   public void setUserID(String userID) {
      this.userID = userID;
   }
   public String getUserPassword() {
      return userPassword;
   }
   public void setUserPassword(String userPassword) {
      this.userPassword = userPassword;
   }
   public String getUserName() {
      return userName;
   }
   public void setUserName(String userName) {
      this.userName = userName;
   }
   public String getUserEmail() {
      return userEmail;
   }
   public void setUserEmail(String userEmail) {
      this.userEmail = userEmail;
   }
   public String getUserDoctor() {
      return userDoctor;
   }
   public void setUserDoctor(String userDoctor) {
      this.userDoctor = userDoctor;
   }
   public String getUserNumber() {
      return userNumber;
   }
   public void setUserNumber(String userNumber) {
      this.userNumber = userNumber;
   }
}