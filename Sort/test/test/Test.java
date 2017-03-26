/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static org.junit.Assert.*;
import static sort.Sort.end;
import static sort.Sort.end1;
import static sort.Sort.maxSubArraySum;
import static sort.Sort.max_sum;
/**
 *
 * @author Лариса Конина
 * 23501/3
 */
public class Test {
    
   
    public void testFindMaxSubarray() {
       
              
         int[] Price1={1,2,3,4,5,6,7,8,9,10,12,13,14};
         int[] Delta1=new int[Price1.length-1];
        
        for(int i=0; i<Price1.length-1; i++)
            
           Delta1[i]=Price1[i+1]-Price1[i];
        //Delta = 1 1 1 1 1 1 1 1 1 1 1 1 1 
        
        
        
        int startIndex=0;
        int endIndex=12;
        int Sum=13;
        boolean check = false;
        
        int result = maxSubArraySum(Delta1, 0, Delta1.length-1);
        int checkstart= end;
        int checkend = end1;
        
        if (max_sum > 0)  check=true;
        
        assertEquals(Sum, result);
        assertEquals(startIndex, checkstart);
        assertEquals(endIndex, checkend);
        assertEquals(true, check);
        
    }
    
}

