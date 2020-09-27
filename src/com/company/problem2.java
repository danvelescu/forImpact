package com.company;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;



public class problem2 {

    private LocalDate
            startPeriod1,
            startPeriod2,
            endPeriod1,
            endPeriod2;
    private List<LocalDate> listOfDate = new ArrayList();

    public  problem2(String start1, String end1, String start2, String end2){

        if(start1.isEmpty()){
            throw new DateTimeException("Wrong time expresions -infinite");
        }else{
           setStartPeriod1(start1);
        }
        if(start2.isEmpty())
        {
            throw new DateTimeException("Wrong time expresions -infinite");
        }else{
           setStartPeriod2(start2);
        }
        if(end1.isEmpty()){
            throw new DateTimeException("Wrong time expresions +infinite");
        }else{
            setEndPeriod1(end1);
        }
        if(end2.isEmpty()){
            throw new DateTimeException("Wrong time expresions +infinite");
        }else{
            setEndPeriod2(end2);
        }
    }





    public void setStartPeriod1(String data) {
        String[] startperiod = data.split("-");
        this.startPeriod1 = LocalDate.of(Integer.parseInt(startperiod[0]),Integer.parseInt(startperiod[1]),Integer.parseInt(startperiod[2]));
    }



    public void setStartPeriod2(String data) {
        String[] startperiod = data.split("-");
        this.startPeriod2 = LocalDate.of(Integer.parseInt(startperiod[0]),Integer.parseInt(startperiod[1]),Integer.parseInt(startperiod[2]));
    }



    public void setEndPeriod1(String data) {
        String[] startperiod = data.split("-");
        this.endPeriod1 = LocalDate.of(Integer.parseInt(startperiod[0]),Integer.parseInt(startperiod[1]),Integer.parseInt(startperiod[2]));
    }



    public void setEndPeriod2(String data) {
        String[] startperiod = data.split("-");
        this.endPeriod2 = LocalDate.of(Integer.parseInt(startperiod[0]),Integer.parseInt(startperiod[1]),Integer.parseInt(startperiod[2]));
    }

    public Boolean verfiyPeriod(){
        Period period1,period2;

        period1 = Period.between(startPeriod1,endPeriod1);
        period2 = Period.between(startPeriod2,endPeriod2);

      boolean check =  startPeriod1.isBefore(endPeriod2) && startPeriod2.isBefore(endPeriod1);

         if(!check){

                 System.out.println(startPeriod2.toString() + "---" + startPeriod2.plus(period2.minus(period1)).toString());
                 System.out.println(period2.minus(period1));

         }else System.out.println("no overlaping");

      return check;
   }

    public static void main(String[] args) {

        problem2 prob = new problem2("2011-4-10","","2011-7-22","2011-7-23");
        prob.verfiyPeriod();
    }
}
