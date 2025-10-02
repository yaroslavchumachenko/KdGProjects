package Bottles;

public class Bottles {
    class Solution {
        public int maxBottlesDrunk(int numBottles, int numExchange) {
            boolean status = true;
            int bottlesDrunk = 0;
            int emptyBottles = 0;
            while (status){
                if (numBottles != 0){
                    bottlesDrunk += numBottles;
                    emptyBottles += numBottles;
                    numBottles = 0;
                }
                else if (emptyBottles >= numExchange){
                    numBottles ++;
                    emptyBottles = emptyBottles-numExchange;
                    numExchange ++;
                }
                else{
                    status = false;

                }
            }
            return bottlesDrunk;
        }
    }
}
