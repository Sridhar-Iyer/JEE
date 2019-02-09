package com.siyer.xml.xml_object;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

public class Experience {
	
	private String company;
	private String jobDescription;
	private String fromYear;
	private String toYear;
	
	@XmlElement
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@XmlElement
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	@XmlElement
	public String getFromYear() {
		return fromYear;
	}
	public void setFromYear(String fromYear) {
		this.fromYear = fromYear;
	}
	@XmlElement
	public String getToYear() {
		return toYear;
	}
	public void setToYear(String toYear) {
		this.toYear = toYear;
	}
	@Override
	public String toString() {
		return "Experience [company=" + company + ", jobDescription=" + jobDescription + ", fromYear=" + fromYear
				+ ", toYear=" + toYear + "]";
	}
	
	

}
