import com.practice.ProfileInfo;

public class Main {

  public static void main(String[] args) {
    ProfileInfo info = new ProfileInfo();
    for (int i = 0; i < 6; i++) {
      System.out.print(info.createRandomProfile());
      System.out.print("\n");
    }
  }
}
