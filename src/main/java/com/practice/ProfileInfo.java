package com.practice;

import com.proto.profile.Profile;
import com.proto.profile.Profile.EyeColor;
import java.util.List;

public class ProfileInfo {

  public Profile createRandomProfile() {
    return Profile.newBuilder()
        .setAge((int) (Math.random() * (75 - 18) + 18))
        .setFirstName(getRandomFirstName())
        .setLastName(getRandomLastName())
        .setIsProfileViewed(false)
        .setHeight((float) (Math.random() * (190 - 160) + 160))
        .addAllPhoneNumbers(List.of("(123) 456-7890", "(987) 654-3211"))
        .setEyeColor(EyeColor.BLACK)
        .build();
  }

  public void saveProfileToFile() {
    //TODO
  }

  private String getRandomFirstName() {
    List<String> firstName = List.of("James", "Michael", "John", "Robert", "David", "Mary",
        "Patricia",
        "Jennifer", "Linda", "Elizabeth");
    return firstName.get((int) (Math.random() * (firstName.size() - 1) + 1));
  }

  private String getRandomLastName() {
    List<String> lastName = List.of("Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia",
        "Miller", "Davis", "Rodriguez", "Martinez");
    return lastName.get((int) (Math.random() * (lastName.size() - 1) + 1));
  }
}
