package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str1 = reader.readLine();
		String[] str = str1.split(" ");
		System.out.println(str[1]);
	}

}