package com.siyer.xml.xml_object;


import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class App {

    private static final String FILE_NAME = "jaxb-emp.xml";

    public static void main(String[] args) {
    	Experience exp1 = new Experience();
    	exp1.setCompany("Pandora");
    	exp1.setJobDescription("Big Data Consultant");
    	exp1.setFromYear("2016");
    	exp1.setToYear("2017");
    	Experience exp2 = new Experience();
    	exp2.setCompany("Autodesk");
    	exp2.setJobDescription("Big Data Engineer");
    	exp2.setFromYear("2017");
    	exp2.setToYear("2018");
    	
        Employee emp = new Employee();
        emp.setId(1);
        emp.setAge(25);
        emp.setName("Sridhar");
        emp.setGender("Male");
        emp.setRole("Developer");
        emp.setPassword("secret");
       
        emp.getExperience().add(exp1);
        emp.getExperience().add(exp2);

        jaxbObjectToXML(emp);

      //  Employee empFromFile = jaxbXMLToObject();
        //System.out.println(empFromFile.toString());
    }


    public static Employee jaxbXMLToObject() {
        try {
            @SuppressWarnings("restriction")
			JAXBContext context = JAXBContext.newInstance(Employee.class);
            @SuppressWarnings("restriction")
			Unmarshaller un = context.createUnmarshaller();
            @SuppressWarnings("restriction")
			Employee emp = (Employee) un.unmarshal(new File(FILE_NAME));
            return emp;
        } catch (@SuppressWarnings("restriction") JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static void jaxbObjectToXML(Employee emp) {
    	 try
         {
             //Create JAXB Context
             JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
              
             //Create Marshaller
             Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
  
             //Required formatting??
             jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
  
             //Print XML String to Console
             StringWriter sw = new StringWriter();
              
             //Write XML to StringWriter
             jaxbMarshaller.marshal(emp, sw);
              
             //Verify XML Content
             String xmlContent = sw.toString();
             System.out.println( xmlContent );
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}