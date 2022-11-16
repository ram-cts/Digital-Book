package com.core.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Student1 {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("Student.xml");
		StudentEntity bean = (StudentEntity) con.getBean("s1");
		// System.out.println(bean.getAddress());

		System.out.println("name  ::" + bean.getName());
		System.out.println("class ::" + bean.getClasses());
		System.out.println("age ::" + bean.getAge());
		System.out.println("city ::" + bean.getCity());
		System.out.println("subjects ::" + bean.getPojo().getSubjects());

	}
}
