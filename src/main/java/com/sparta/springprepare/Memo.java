package com.sparta.springprepare;

import lombok.*;


@RequiredArgsConstructor
@Setter
@Getter
public class Memo {
    private final String username;
    private String contents;


}
class Main{
    public static void main(String[] args) {
        Memo memo = new Memo("Fobbie");
        System.out.println(memo.getUsername());
    }
}