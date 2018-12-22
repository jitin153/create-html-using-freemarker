package com.jitin.createhtmlwithfreemarker.utility;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

public class FreemarkerTemplateProcessor {
	public static String processTemplate(Object object,String templatePath,String templateName) {
		String processedText="";
		Configuration configuration=new Configuration(Configuration.VERSION_2_3_26);
		try {
			configuration.setDirectoryForTemplateLoading(new File(templatePath));
			configuration.setDefaultEncoding("UTF-8");
			configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
			configuration.setLogTemplateExceptions(false);
			Map<String,Object> root=new HashMap<String,Object>();
			root.put("data", object);
			Template template=configuration.getTemplate(templateName);
			Writer writer=new StringWriter();
			try {
				template.process(root, writer);
				processedText=processTemplateIntoString(template,root);
			}catch(TemplateException e) {
				System.out.println(e);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		return processedText;
	}

		private static String processTemplateIntoString(Template template, Object model) throws IOException, TemplateException {
			StringWriter stringWriter = new StringWriter();
			template.process(model, stringWriter);
			return stringWriter.toString();
		}
}
