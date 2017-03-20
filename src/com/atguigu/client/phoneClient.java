package com.atguigu.client;

import com.atguigu.service.PhoneCheck;
import com.atguigu.service.PhoneCheckImplService;

public class phoneClient {
	
	
	 public static void main(String[] args) {
		
		 PhoneCheck phoneCheck=new PhoneCheckImplService().getPhoneCheckImplPort();
		 
		 String num = phoneCheck.checkAreaByPhoneNum("15906669857");
		 
		 String num2 = phoneCheck.checkTypeByPhoneNum("15906669857");
		 
		 System.out.println(num);
		 
		 System.out.println(num2);
	}
	 

}
