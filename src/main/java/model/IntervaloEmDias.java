/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 *
 * @author pp
 */
public class IntervaloEmDias {
    
       public long CalculaDias(int a,int b, int c, int d, int e, int f){
         //Variaveis
         
        // Local Date Início
        LocalDate dateBefore = LocalDate.of(c, b, a);
        //Local Date  Fim
        LocalDate dateAfter = LocalDate.of(f,  e, d);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        noOfDaysBetween = noOfDaysBetween + 1;
        return noOfDaysBetween;
    
}}
    

