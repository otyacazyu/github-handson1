package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> gamesList = List.of("ボンバーマン","星のカービィ","スマッシュブラザーズ","ポケモン","ゼルダの伝説","ファイナルファンタジー","ロックマン");

        gamesList.forEach(System.out::println);
    }
}