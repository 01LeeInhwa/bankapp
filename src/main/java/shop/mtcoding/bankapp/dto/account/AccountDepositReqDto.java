package shop.mtcoding.bankapp.dto.account;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDepositReqDto {

    // DTO는 똑같은게 존재해도 공유해서 쓰지 않는다
    // 이유는 DTO는 화면에 나타나는 데이터 (자주 변경해서 쓸 수 있음)
    private Long amount; // 랩핑클래스
    private String dAccountNumber;

}
