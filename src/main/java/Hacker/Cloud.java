package Hacker;

public class Cloud {

    /*mma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads
    and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current
    cloud plus  or . She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from
    her starting postion to the last cloud. It is always possible to win the game.

    For each game, Emma will get an array of clouds numbered  if they are safe or  if they must be avoided. For example,
    indexed from . The number on each cloud is its index in the list so she must avoid the clouds at indexes  and .
    She could follow the following two paths:  or . The first path takes  jumps while the second takes .*/

    public static void main(String[] args) {
        int[] intArray = new int[]{ 0, 0, 0, 1, 0, 0};
        int resp = jumpingOnClouds(intArray);
        System.out.printf("resp: "+ resp);
    }

    static int jumpingOnClouds(int[] c) {
        int count = 0;
        int index = 0;

        while (index < c.length - 1) {
            index =
                    ((index + 2 < c.length) && c[index + 2] != 1)
                            ? index + 2
                            : index + 1;

            count += 1;
        }

        return count;
}



}
