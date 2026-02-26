/*
Vehicle Manufacturing
You are tasked with determining the number of two-wheelers and four-wheelers that need to be manufactured based on the given total number of vehicles and the total number of wheels.

You are provided with two integers:

v: the total number of vehicles (both two-wheelers and four-wheelers).
w: the total number of wheels for all the vehicles combined.
Your task is to calculate and print how many two-wheelers and four-wheelers must be manufactured based on the input data. If it's not possible to manufacture such a combination, print 
−
1
−1.

Explanation:
Test Case 1: You have 12 vehicles in total and 34 wheels, which is possible with 7 two-wheelers and 5 four-wheelers.
5*4=20, 7*2=14 
20+14=34
*/

public class VehicleManufacturing {

    public static void funcVehicle(int v, int w){

        int twoW=0, fourW=0;
        for (int i = 1; i < v; i++) {
            twoW=i*2;
            fourW=(v-i)*4;
            if(twoW+fourW==w){
                System.out.println("2-Wheelers="+ i +" and 4-Wheelers="+ (v-i));
                return;
            }
        }
        System.out.println("-1");

    }
    public static void main(String[] args) {
        int vehicles=12;
        int wheels=34;
        funcVehicle(vehicles,wheels);
    }
}
