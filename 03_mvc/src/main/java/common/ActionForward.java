package common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class ActionForward {

  private String view;
  private boolean isRedirect;
//false 기본값 포워드하고 리다이렉트 안하겠다.
}
