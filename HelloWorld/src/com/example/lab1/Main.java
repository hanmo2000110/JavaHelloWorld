package com.example.lab1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("made by kimshin");
		System.out.println("my student number is 22000120");
		System.out.println("Hello World!!!\n");
		System.out.print("이름 입력 : ");
		String name = s.next();
		System.out.print("[" + name + "]님 환영합니다~");
		s.close();
	}
}
