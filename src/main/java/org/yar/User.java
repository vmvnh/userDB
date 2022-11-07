package org.yar;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Table(name = "users")
public class User implements Serializable {
  public static final int START_SEQ = 1;

  @Id
  @NonNull
  @Column
  @Getter
  @Setter
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id;

  @Column
  @Getter
  @Setter
  private String name;

  public String toString() {
    return "Id: " +this.id+ " Name: " +this.name;
  }
}
