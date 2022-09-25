package com.hibernate;

import javax.persistence.Entity;
                                        
	public class fresheremployee extends employee {        

		
		
		private int empContractPeriod;			 
		private int empIncrement; 			
		
		
		
		public int getEmpContractPeriod() { 	
			return empContractPeriod;
		}

		public void setEmpContractPeriod(int empContractPeriod) {
			this.empContractPeriod = empContractPeriod;
		}

		public int getEmpIncrement() {
			return empIncrement;
		}

		public void setEmpIncrement(int empIncrement) {
			this.empIncrement = empIncrement;
		}

		@Override
		// Here we generate toString
		public String toString() { 
			return "fresherEmployee [empContractPeriod=" + empContractPeriod + ", empIncrement=" + empIncrement + "]";
		}

	}