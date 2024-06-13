package com.nsr.package1;

public class AlphanumericAdding {
	
	    public static void main(String[] args) {
	        String a = "C10b20a30";
	        int sum = stringSum(a);
	        System.out.println("Sum: " + sum);
	    }

	    public static int stringSum(String a) {
	        int sum = 0;
	        StringBuilder s = new StringBuilder();
	        for (char c : a.toCharArray()) {
	            if (Character.isDigit(c)) {
	                s.append(c);
	            } else {
	                if (s.length() > 0) {
	                    sum += Integer.parseInt(s.toString());
	                    s.setLength(0); // Reset the StringBuilder
	                }
	            }
	        }

	        if (s.length() > 0) {
	            sum += Integer.parseInt(s.toString());
        }

	        return sum;
	    }
	}



