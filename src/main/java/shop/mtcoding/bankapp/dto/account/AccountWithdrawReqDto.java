package shop.mtcoding.bankapp.dto.account;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountWithdrawReqDto {

    private Long amount; // 랩핑클래스
    private String wAccountNumber;
    private String wAccountPassword;

}
