import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Team {
  private String name;
  private List<Player> members;
  private List<Line> lines;

  public Team(String name) {
    this.name = name;
    this.members = new ArrayList<>();
    this.lines = new ArrayList<>();
    for (int i = 1; i <= 4; i++) {
      lines.add(new Line(i));
    }
  }

  public String getName() {
    return name;
  }

  public List<Player> getMembers() {
    return members;
  }

  public boolean sign(Player player) {
    for(Player member : members) {
      if(member.getRosterEntry().equals(player.getRosterEntry())) {
        return false;
      }
    }
    this.members.add(player);
    return true;
  }

  public String getRoster() {
    StringBuilder builder = new StringBuilder();
    for(Player member : members) {
      builder.append(member.getRosterEntry()).append("\n");
    }
    return builder.toString();
  }

  public List<Line> getLines() {
    return lines;
  }

  public List<Line> getOpenLines() {
    List<Line> openLines = new ArrayList<>();
    for(Line line : lines) {
      if(line.hasNoPlayers()) {
        openLines.add(line);
      }
    }
    return openLines;
  }
}