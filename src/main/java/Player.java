public class Player {
  private String firstName;
  private String lastName;
  private String position;

  public Player(String firstName, String lastName, String position) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.position = position;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getPosition() {
    return position;
  }

  public String getRosterEntry() {
    return this.lastName + ", " + this.firstName + ", " + this.position;
  }
}