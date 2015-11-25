package com.yashodhar.techgig.wipro;

import java.util.Stack;

public class tautology {
	public static void main(String args[]){
		String str = "FZZ";
		//String str1 = "NNNNP";
		//String str2 = "NANPP";
		//String str2 = "IIPPOpNP";
		String res = checkTautology(str);
		System.out.println("tautology:::" +res);
				
	}
	
	public static String checkTautology(String str)
    {
        Stack<String> st = new Stack<String>();
        String res;
        String operand1;
        String operand2;
         for(int i=str.length()-1; i>=0; i--){
        	char c = str.charAt(i);
        	if( c == 'A'){
        		operand1 =(String) st.pop();
        		operand2 =(String) st.pop();
        		if(operand1.equals(operand2) && !operand1.contains("N") && !operand2.contains("N")){
        			st.push(operand1);
        		}
        		else{
        			if(!operand1.contains("N")){
            			st.push('N'+operand1);
            			}
            			else{
            				st.push(operand1);
            			}
        		}
        		        		
        	}
        	else if(c == 'O'){
        		operand1 =(String) st.pop();
        		operand2 =(String) st.pop();
        		if(operand1.equals(operand2) && !operand1.contains("N")){
        			
        			if(!operand1.contains("N")){
            			st.push('N'+operand1);
            			}
            			else{
            				if(!operand1.contains("N")){
            					st.push(operand1);
            				}else{
            					String str1 ="" + operand1.charAt(1);
                    			st.push(str1);
            				}
            			}
        			
        		}
        		else{
        			st.push(operand1);
        		}
        	}
        	else if(c == 'I'){
        		operand1 =(String) st.pop();
        		operand2 =(String) st.pop();
        		if(!operand1.equals(operand2) && !operand1.contains("N")){
        			st.push(operand2);
        		}
        		else{
        			
        			if(operand1.contains("N")){
            			String str1 ="" + operand1.charAt(1);
            			st.push(str1);
            		}
        			else{
            				st.push(operand1);
            			}
        		}
        		
        	}
        	else if(c == 'F'){
        		operand1 =(String) st.pop();
        		operand2 =(String) st.pop();
        		if(operand1.equals(operand2)){
        			if(operand1.contains("N")){
            			String str1 ="" + operand1.charAt(1);
            			st.push(str1);
            		}
        			else{
        				st.push(operand1);
        			}
        		}
        		else{
        			if(!operand1.contains("N")){
            			st.push('N'+operand1);
            			}
            			else{
            				st.push(operand1);
            			}
        		}
        		
        	}
        	else if(c == 'N'){
        		operand1 =(String) st.pop();
        		if(operand1.contains("N")){
        			String str1 ="" + operand1.charAt(1);
        			st.push(str1);
        		}
        		else{
        			if(!operand1.contains("N")){
            			st.push('N'+operand1);
            			}
            			else{
            				st.push(operand1);
            			}
        		}
        		
        		
        	}
        	else
        	{
        		String s = "" + c;
        		st.push(s);
        		
        	}
        }
         if(!st.isEmpty()){
        	res = (String)st.peek();
        	if(res.contains("N")){
        		return "NO";
        	}
        	else{
        		return "YES";
        	}
         }
         else
        	 return "Invalid";
        
		
        
        
    }

}
