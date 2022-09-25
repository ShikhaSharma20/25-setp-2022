package com.hibernet;



	

	import java.persistence.Entity; 
	import java.persistence.Id;


	public class employee {

		@Id          
		//  annotation for set primary key in  table
		
		
		//  are private instance variables 
		private int empId;           
		private String empFirstName; 
		private String empLastName; 

		
		
		//  getters and setters
		public int getEmpId() { 
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpFirstName() {
			return empFirstName;
		}

		public void setEmpFirstName(String empFirstName) {
			this.empFirstName = empFirstName;
		}

		public String getEmpLastName() {
			return empLastName;
		}

		public void setEmpLastName(String empLastName) {
			this.empLastName = empLastName;
		}

		@Override
		
		// generate toString
		public String toString() { 
			return "employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName + "]";
		}

	}