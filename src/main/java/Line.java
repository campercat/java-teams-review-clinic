import java.util.ArrayList;
import java.util.List;

public class Line {
  private int rank;
  private List<Player> players;

  public Line(int rank) {
    this.rank = rank;
    this.players = new ArrayList<>();
  }

  public int getRank() {
    return rank;
  }

  public List<Player> getPlayers() {
    return players;
  }

  public void assign(Player player) {
    this.players.add(player);
  }

  public boolean hasNoPlayers() {
    return this.players.isEmpty();
  }
}