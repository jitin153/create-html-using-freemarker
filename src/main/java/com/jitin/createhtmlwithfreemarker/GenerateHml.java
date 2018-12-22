package com.jitin.createhtmlwithfreemarker;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;

import com.jitin.createhtmlwithfreemarker.model.Address;
import com.jitin.createhtmlwithfreemarker.model.College;
import com.jitin.createhtmlwithfreemarker.model.Student;
import com.jitin.createhtmlwithfreemarker.model.Wrapper;
import com.jitin.createhtmlwithfreemarker.utility.FreemarkerTemplateProcessor;

public class GenerateHml {
	private static final String TEMPLATE_DIRECTORY = "src/main/resources/templates/";
	private static final String HTML_CREATION_DIRECTORY = "src/main/resources/createdHtmls/CollegeReport.html";
	private static final String TEMPLATE_NAME = "Colleges.ftl";

	public static void main(String[] args) {
		Address studentAddress11 = new Address("PQR Street", "Lucknow", "Uttar Pradesh", 2000000L);
		Student student1 = new Student(1L, "Aman Gupta", "BCA", Boolean.TRUE, studentAddress11);
		Address studentAddress12 = new Address("KLM Street", "Moradabad", "Uttar Pradesh", 300001L);
		Student student2 = new Student(2L, "Yogesh Verma", "BCA", Boolean.TRUE, studentAddress12);
		Address collegeAddress1 = new Address("ABC Street", "Mumbai", "Maharashtra", 100001L);
		College college1 = new College(10001L, "TEST1 COLLEGE", collegeAddress1, Arrays.asList(student1, student2));

		Address studentAddress21 = new Address("XYZ Street", "Patna", "Bihar", 111111L);
		Student student3 = new Student(3L, "Ragini Kashyap", "BCA", Boolean.TRUE, studentAddress21);
		Address studentAddress22 = new Address("EFG Street", "Chennai", "Tamilnadu", 600002L);
		Student student4 = new Student(4L, "Manoj Sinha", "BCA", Boolean.FALSE, studentAddress22);
		Address studentAddress23 = new Address("UVW Street", "Moradabad", "Uttar Pradesh", 500004L);
		Student student5 = new Student(5L, "Vivek Das", "BCA", Boolean.TRUE, studentAddress23);
		Address collegeAddress2 = new Address("CDE Street", "Chennai", "Tamilnadu", 100002L);
		College college2 = new College(10001L, "TEST2 COLLEGE", collegeAddress2,
				Arrays.asList(student3, student4, student5));

		Wrapper wrapper = new Wrapper(new Date(), "Report of colleges", Arrays.asList(college1, college2));
		String html = FreemarkerTemplateProcessor.processTemplate(wrapper, TEMPLATE_DIRECTORY, TEMPLATE_NAME);
		System.out.println("HTML : " + html);
		PrintWriter out = null;
		try {
			out = new PrintWriter(HTML_CREATION_DIRECTORY);
			out.println(html);
			System.out.println("Html file created!");
		} catch (FileNotFoundException e) {
			System.out.println("Error occurred while writing file : " + e);
		} finally {
			out.close();
		}
	}
}
